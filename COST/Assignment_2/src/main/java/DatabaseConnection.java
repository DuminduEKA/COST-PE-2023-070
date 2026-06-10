import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    // Keep your custom port 3000 as configured on your server
    private static final String URL = "jdbc:mysql://localhost:3000/task_tracker_db"; 
    private static final String USER = "root"; 
    // Updated with your actual MySQL password
    private static final String PASSWORD = "Dumindu@2004"; 

    public static Connection getConnection() throws SQLException {
        try {
            // Force the JVM to load and register the MySQL JDBC Driver class
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("MySQL Driver class missing from project dependencies: " + e.getMessage());
        }
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}