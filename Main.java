import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        // JDBC URL for Oracle database
        String jdbcURL = "jdbc:oracle:thin:@localhost:1521:xe"; // Replace with your DB details
        String username = "System"; // Replace with your DB username
        String password = "a"; // Replace with your DB password

        try {
            // Establish connection
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);
            System.out.println("Connected to Oracle Database successfully!");
            connection.close(); // Close the connection
        } catch (SQLException e) {
            System.err.println("Connection failed!");
            e.printStackTrace();
        }
    }
}
