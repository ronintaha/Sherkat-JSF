package edareh.dao;

import edareh.entity.PersonelData;
import edareh.entity.VacationData;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
@RequestScoped
@Named
public class GetVacationDao {
    public void getVacationDao(){
        VacationData vacationData = new VacationData();
        PersonelData personelData = new PersonelData();
        DBHandler dbHandler = new DBHandler();
        String gSQL = ("SELECT * FROM VACATION WHERE NATIONALCODE = ? ;");
        try(Connection connection = dbHandler.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(gSQL);
            preparedStatement.setString(1, personelData.getNationalCode());
            preparedStatement.executeQuery();
            ResultSet resultSet = preparedStatement.getResultSet();
            if (resultSet.next()){
                String first = resultSet.getString("LastN");
                int second = resultSet.getInt("VacationDay");
                String third = resultSet.getString("confirm");
                String furth = resultSet.getString("NationalCode");
                vacationData.setDayOfLeave(second);
                vacationData.setlName(first);
                vacationData.setConfirm(third);
                vacationData.setnCode(furth);

            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
