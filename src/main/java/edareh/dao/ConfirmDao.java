package edareh.dao;

import edareh.entity.VacationData;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConfirmDao {
    public static void confirmData(){
        DBHandler dbHandler = new DBHandler();
        VacationData vacationData = new VacationData();
        String cSQL = "UPDATE VACATION SET Confirm = ? WHERE NATIONALCODE = ?";
        try (Connection connection = dbHandler.getConnection()){
            PreparedStatement preparedStatement = connection.prepareStatement(cSQL);
            preparedStatement.setString(1, vacationData.getConfirm());
            preparedStatement.setString(2, vacationData.getnCode());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
