package edareh.dao;

import edareh.entity.VacationData;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GetVacationDao {
    public VacationData getVacationDao(int nCode){
        VacationData vacationData = new VacationData();
        DBHandler dbHandler = new DBHandler();
        String gSQL = ("SELECT * FROM VACATION WHERE NATIONALCODE = ? ;");
        try(Connection connection = dbHandler.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(gSQL);
            preparedStatement.setInt(1,nCode);
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
        return vacationData;

    }
}
