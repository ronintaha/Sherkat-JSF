package edareh.dao;

//import edareh.entity.ManagerData;
import edareh.entity.PersonelData;
import edareh.entity.VacationData;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
@RequestScoped
@Named
public class VacationDao {
    public void insertVacation(){
        DBHandler dbHandler = new DBHandler();
        VacationData vacationData = new VacationData();
        PersonelData personelData = new PersonelData();
//        ManagerData managerData = new ManagerData();
        String day = String.valueOf(vacationData.getDayOfLeave());
        String lastName = vacationData.getlName();
//        String confirm1 = vacationData.getConfirm();
        String nCode1 = personelData.getNationalCode();

        String iSQL = "INSERT INTO VACATION(LastN,VacationDay,NATIONALCODE) VALUES (?,?,?)";
        try(Connection connection = dbHandler.getConnection()){
            PreparedStatement preparedStatement = connection.prepareStatement(iSQL);
            preparedStatement.setString(1,lastName);
            preparedStatement.setString(2, day);
//            preparedStatement.setString(3, confirm1);
            preparedStatement.setString(3,nCode1);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
