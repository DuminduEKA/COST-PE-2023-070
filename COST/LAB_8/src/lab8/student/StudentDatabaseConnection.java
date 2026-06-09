package lab8.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StudentDatabaseConnection {
    // Port 3306 connects directly to your background MySQL instance
    private static final String URL = "jdbc:mysql://localhost:3306/oop_lab_08";
    private static final String USERNAME = "root";
    // This line MUST contain your exact password:
    private static final String PASSWORD = "Dumindu@2004"; 

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
}