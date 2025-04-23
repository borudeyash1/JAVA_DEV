import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    // Change these parameters to match your MySQL configuration
    private static final String URL = "jdbc:mysql://localhost:3306/studentdb";
    private static final String USER = "abc";
    private static final String PASSWORD = "abc";  // Replace with your MySQL password

    static {
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("Unable to load JDBC Driver");
            e.printStackTrace();
        }
    }

    // Method to get a database connection
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
