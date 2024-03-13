package Util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataSource {

    //badlou el port kima el port mte3kom my mysql fel xampp
    private static final String URL = "jdbc:mysql://localhost:8111/artspace";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connexion établie");
        } catch (SQLException e) {
            System.out.println(e);
        }
        return connection;
    }
}
