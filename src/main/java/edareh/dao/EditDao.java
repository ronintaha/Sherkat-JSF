package edareh.dao;

import edareh.entity.PersonelData;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EditDao {
    DBHandler dbHandler = new DBHandler();
    PersonelData personelData = new PersonelData();
    Connection connection;

    {
        try {
            connection = dbHandler.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void editNameDao(String code){

        String nSQL = "UPDATE PERSONEL1 SET FIRSTNAME = ? WHERE NATIONALCODE = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(nSQL);
            preparedStatement.setString(1,personelData.getName());
            preparedStatement.setString(2, code);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void editLastNameDao(String code1){

        String nSQL = "UPDATE PERSONEL1 SET LASTNAME = ? WHERE NATIONALCODE = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(nSQL);
            preparedStatement.setString(1,personelData.getLasteName());
            preparedStatement.setString(2, code1);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void editAgeDao(String code1){

        String nSQL = "UPDATE PERSONEL1 SET AGE= ? WHERE NATIONALCODE = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(nSQL);
            preparedStatement.setString(1,personelData.getAge());
            preparedStatement.setString(2, code1);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
