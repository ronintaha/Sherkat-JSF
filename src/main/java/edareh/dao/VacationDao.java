package edareh.dao;

//import edareh.entity.ManagerData;

import edareh.entity.Personnel;
import edareh.entity.Vacation;

import javax.enterprise.context.RequestScoped;
import java.sql.*;

@RequestScoped
public class VacationDao {

    public  void creatTableVacation() {
        DBHandler dbHandler = new DBHandler();
        String vSQL = "CREATE TABLE IF NOT EXISTS VACATION" + "(ID INTEGER PRIMARY KEY AUTO_INCREMENT," + "LastN VARCHAR (255)," + "VacationDay VARCHAR(255)," + "Confirm VARCHAR(255)," + "NationalCode VARCHAR (255))";
        try (Connection connection = dbHandler.getConnection()) {
            Statement statement = connection.createStatement();
            statement.executeUpdate(vSQL);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public void insertVacation() {
        DBHandler dbHandler = new DBHandler();
        Vacation vacation = new Vacation();
        Personnel personnel = new Personnel();
//        ManagerData managerData = new ManagerData();
        String day = String.valueOf(vacation.getDayOfLeave());
        String lastName = vacation.getlName();
//        String confirm1 = vacationData.getConfirm();
        String nCode1 = personnel.getNationalCode();

        String iSQL = "INSERT INTO VACATION(LastN,VacationDay,NATIONALCODE) VALUES (?,?,?)";
        try (Connection connection = dbHandler.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(iSQL);
            preparedStatement.setString(1, lastName);
            preparedStatement.setString(2, day);
//            preparedStatement.setString(3, confirm1);
            preparedStatement.setString(3, nCode1);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void getVacationDao() {
        Vacation vacation = new Vacation();
        Personnel personnel = new Personnel();
        DBHandler dbHandler = new DBHandler();
        String gSQL = ("SELECT * FROM VACATION WHERE NATIONALCODE = ? ;");
        try (Connection connection = dbHandler.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(gSQL);
            preparedStatement.setString(1, personnel.getNationalCode());
            preparedStatement.executeQuery();
            ResultSet resultSet = preparedStatement.getResultSet();
            if (resultSet.next()) {
                String first = resultSet.getString("LastN");
                int second = resultSet.getInt("VacationDay");
                String third = resultSet.getString("confirm");
                String furth = resultSet.getString("NationalCode");
                vacation.setDayOfLeave(second);
                vacation.setlName(first);
                vacation.setConfirm(third);
                vacation.setnCode(furth);

            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void confirmData() {
        DBHandler dbHandler = new DBHandler();
        Vacation vacation = new Vacation();
        String cSQL = "UPDATE VACATION SET Confirm = ? WHERE NATIONALCODE = ?";
        try (Connection connection = dbHandler.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(cSQL);
            preparedStatement.setString(1, vacation.getConfirm());
            preparedStatement.setString(2, vacation.getnCode());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
