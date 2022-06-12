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


    public void insertVacation(Vacation vacation) {
        DBHandler dbHandler = new DBHandler();
//        Personnel personnel = new Personnel();
//        ManagerData managerData = new ManagerData();
        String day = String.valueOf(vacation.getDayOfLeave());
        String lastName = vacation.getlName();
//        String confirm1 = vacationData.getConfirm();
        String nCode1 = vacation.getnCode();

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

    public Vacation getVacationDao(String nationalCode) {
        Vacation vacation = new Vacation();
        Personnel personnel = new Personnel();
        DBHandler dbHandler = new DBHandler();
        String gSQL = ("SELECT * FROM VACATION WHERE NATIONALCODE = ? ;");
        try (Connection connection = dbHandler.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(gSQL);
            preparedStatement.setString(1, nationalCode);
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

        return vacation;
    }

    public void confirmData(Vacation vacation) {
        DBHandler dbHandler = new DBHandler();

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

    public Vacation getInformationForVacation(String searchNationalCode) {
//        Personnel personnel = new Personnel();
        Vacation vacation = new Vacation();

        DBHandler dbHandler = new DBHandler();
        String query = ("SELECT * FROM PERSONEL1 WHERE NATIONALCODE =? ;");

        try (Connection connection = dbHandler.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, searchNationalCode);
            preparedStatement.executeQuery();
            ResultSet resultSet = preparedStatement.getResultSet();

            if (resultSet.next()) {

//                String name = resultSet.getString("FIRSTNAME");
                String lastName = resultSet.getString("LASTNAME");
//                String age = resultSet.getString("AGE");
                String nationalCode = resultSet.getString("NATIONALCODE");
//                System.out.println("Information of person you want is : \n"+"Name : " + name +"\n" +"LastName : " +lastName+ "\n" + "Age : " + age+"\n");
//                personnel.setName(name);
//                personnel.setLasteName(lastName);
//                personnel.setAge(age);
//                personnel.setNationalCode(nationalCode);
                vacation.setlName(lastName);
                vacation.setnCode(nationalCode);
            }
//            Statement statement = connection.createStatement();
//            statement.executeQuery(iSQL);
//            ResultSet resultSet = statement.getResultSet();
//           String name = resultSet.getString("FIRSTNAME");
//           String last =  resultSet.getString("LASTNAME");
//           String age =  resultSet.getString("AGE");
//            System.out.println("Information of person you want is : "+name+""+last+""+age);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return vacation;
    }
}
