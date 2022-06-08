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
public class GetPersonelDao {

    public  void getInformation() {
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

                String name = resultSet.getString("FIRSTNAME");
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
