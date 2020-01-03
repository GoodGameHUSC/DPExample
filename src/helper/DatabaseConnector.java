package helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector {
    private static String hostName = "localhost";
    private static String dbName = "test";
    private static String userName = "root";
    private static String password = "";

    private static Connection _connector = null;

    public static void main(String[] args) {
        try {
            DatabaseConnector.getConnection();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    // lazy singleton init

    public static Connection getConnection() throws Exception {
        if (_connector == null) {
            try {
                initConnection();
            } catch (Exception e) {
                throw e;
            }
        }
        return _connector;
    }

    private static void initConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName;
        _connector = DriverManager.getConnection(connectionURL, userName, password);

    }

}
