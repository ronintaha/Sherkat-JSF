package edareh.dao.creatTabales;

import edareh.dao.DBHandler;

import javax.inject.Named;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
@Named
public class CreateTablePerson {

    public static void createTableP(){
        DBHandler dbHandler = new DBHandler();
        String cSQL = "CREATE TABLE IF NOT EXISTS PERSONEL1" + " (ID INTEGER PRIMARY KEY AUTO_INCREMENT, " + " FIRSTNAME VARCHAR(255)," + " LASTNAME VARCHAR(255)," + " AGE VARCHAR(255)," + " NATIONALCODE VARCHAR(255))";
        try (Connection connection = dbHandler.getConnection()){
            Statement statement = connection.createStatement();
            statement.executeUpdate(cSQL);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
