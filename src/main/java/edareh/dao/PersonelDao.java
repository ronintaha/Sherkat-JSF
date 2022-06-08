package edareh.dao;

import edareh.entity.PersonelData;
import edareh.entity.VacationData;

import javax.enterprise.context.RequestScoped;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@RequestScoped
public class PersonelDao {

    public void createTable(){
        DBHandler dbHandler = new DBHandler();
        String cSQL = "CREATE TABLE IF NOT EXISTS PERSONEL1" + " (ID INTEGER PRIMARY KEY AUTO_INCREMENT, " + " FIRSTNAME VARCHAR(255)," + " LASTNAME VARCHAR(255)," + " AGE VARCHAR(255)," + " NATIONALCODE VARCHAR(255))";
        try (Connection connection = dbHandler.getConnection()){
            Statement statement = connection.createStatement();
            statement.executeUpdate(cSQL);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void create(PersonelData personelData) {
        String FirstName = personelData.getName();
        String LastName = personelData.getLasteName();
        String AGE = personelData.getAge();
        String NCODE = personelData.getNationalCode();

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

    public void edit(PersonelData personelData) {
        String FirstName = personelData.getName();
        String LastName = personelData.getLasteName();
        String AGE = personelData.getAge();
        String NCODE = personelData.getNationalCode();

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

    public List<PersonelData> findAll() {

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
        PersonelData personelData = new PersonelData();
        VacationData vacationData = new VacationData();

        DBHandler dbHandler = new DBHandler();
        String iiSQL = ("SELECT * FROM PERSONEL1 WHERE NATIONALCODE =? ;");

        try (Connection connection = dbHandler.getConnection()) {
//            PersonelData personelD = new PersonelData();
//            String nCode = personelD.getId();

            PreparedStatement preparedStatement1 = connection.prepareStatement(iiSQL);
            preparedStatement1.setString(1, personelData.getNationalCode());
            preparedStatement1.executeQuery();
            ResultSet resultSet = preparedStatement1.getResultSet();


            if (resultSet.next()) {

                String name1 = resultSet.getString("FIRSTNAME");
                String lastName = resultSet.getString("LASTNAME");
                String age = resultSet.getString("AGE");
                String nCode1 = resultSet.getString("NATIONALCODE");
//                System.out.println("Information of person you want is : \n"+"Name : " + name +"\n" +"LastName : " +lastName+ "\n" + "Age : " + age+"\n");
                personelData.setName(name);
                personelData.setLasteName(lastName);
                personelData.setAge(age);
                personelData.setNationalCode(nCode1);
                vacationData.setlName(lastName);
                vacationData.setnCode(nCode1);
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
