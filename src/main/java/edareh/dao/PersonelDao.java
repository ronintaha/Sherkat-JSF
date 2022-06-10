package edareh.dao;

import edareh.entity.Personnel;
import edareh.entity.Vacation;

import javax.enterprise.context.RequestScoped;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@RequestScoped
public class PersonelDao {

    public void createTablePersonnel(){
        DBHandler dbHandler = new DBHandler();
        String cSQL = "CREATE TABLE IF NOT EXISTS PERSONEL1" + " (ID INTEGER PRIMARY KEY AUTO_INCREMENT, " + " FIRSTNAME VARCHAR(255)," + " LASTNAME VARCHAR(255)," + " AGE VARCHAR(255)," + " NATIONALCODE VARCHAR(255))";
        try (Connection connection = dbHandler.getConnection()){
            Statement statement = connection.createStatement();
            statement.executeUpdate(cSQL);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void InsertInfo(Personnel personnel) {
        String FirstName = personnel.getName();
        String LastName = personnel.getLasteName();
        String AGE = personnel.getAge();
        String NCODE = personnel.getNationalCode();

        String query = "INSERT INTO PERSONEL1 ( FIRSTNAME,LASTNAME,AGE,NATIONALCODE) VALUES (?,?,?,?)";
        DBHandler dbHandler = new DBHandler();
        try (Connection connection = dbHandler.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, FirstName);
            preparedStatement.setString(2, LastName);
            preparedStatement.setString(3, AGE);
            preparedStatement.setString(4, NCODE);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void edit(Personnel personnel) {
        String FirstName = personnel.getName();
        String LastName = personnel.getLasteName();
        String AGE = personnel.getAge();
        String NCODE = personnel.getNationalCode();

        String query = "INSERT INTO PERSONEL1 ( FIRSTNAME,LASTNAME,AGE,NATIONALCODE) VALUES (?,?,?,?)";
        DBHandler dbHandler = new DBHandler();
        try (Connection connection = dbHandler.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, FirstName);
            preparedStatement.setString(2, LastName);
            preparedStatement.setString(3, AGE);
            preparedStatement.setString(4, NCODE);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public List<Personnel> findAll() {

        String query = "select * from Personnel";
        DBHandler dbHandler = new DBHandler();
        try (Connection connection = dbHandler.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return new ArrayList<>();
    }

    public void findByID(Long id, String nationalCode, String name) {
        Personnel personnel = new Personnel();
        Vacation vacation = new Vacation();

        DBHandler dbHandler = new DBHandler();
        String iiSQL = ("SELECT * FROM PERSONEL1 WHERE NATIONALCODE =? ;");

        try (Connection connection = dbHandler.getConnection()) {
//            Personnel personelD = new Personnel();
//            String nCode = personelD.getId();

            PreparedStatement preparedStatement1 = connection.prepareStatement(iiSQL);
            preparedStatement1.setString(1, personnel.getNationalCode());
            preparedStatement1.executeQuery();
            ResultSet resultSet = preparedStatement1.getResultSet();


            if (resultSet.next()) {

                String name1 = resultSet.getString("FIRSTNAME");
                String lastName = resultSet.getString("LASTNAME");
                String age = resultSet.getString("AGE");
                String nCode1 = resultSet.getString("NATIONALCODE");
//                System.out.println("Information of person you want is : \n"+"Name : " + name +"\n" +"LastName : " +lastName+ "\n" + "Age : " + age+"\n");
                personnel.setName(name);
                personnel.setLasteName(lastName);
                personnel.setAge(age);
                personnel.setNationalCode(nCode1);
                vacation.setlName(lastName);
                vacation.setnCode(nCode1);
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


    }
    public  void getInformation() {
        Personnel personnel = new Personnel();
        Vacation vacation = new Vacation();

        DBHandler dbHandler = new DBHandler();
        String iiSQL = ("SELECT * FROM PERSONEL1 WHERE NATIONALCODE =? ;");

        try (Connection connection = dbHandler.getConnection()) {
//            Personnel personelD = new Personnel();
//            String nCode = personelD.getId();

            PreparedStatement preparedStatement1 = connection.prepareStatement(iiSQL);
            preparedStatement1.setString(1, personnel.getNationalCode());
            preparedStatement1.executeQuery();
            ResultSet resultSet = preparedStatement1.getResultSet();


            if (resultSet.next()) {

                String name = resultSet.getString("FIRSTNAME");
                String lastName = resultSet.getString("LASTNAME");
                String age = resultSet.getString("AGE");
                String nCode1 = resultSet.getString("NATIONALCODE");
//                System.out.println("Information of person you want is : \n"+"Name : " + name +"\n" +"LastName : " +lastName+ "\n" + "Age : " + age+"\n");
                personnel.setName(name);
                personnel.setLasteName(lastName);
                personnel.setAge(age);
                personnel.setNationalCode(nCode1);
                vacation.setlName(lastName);
                vacation.setnCode(nCode1);
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

    }
}
