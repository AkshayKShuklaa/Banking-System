import java.sql.*;
public class Conn 
{
    String jdbcURL = "jdbc:oracle:thin:@localhost:1521:xe"; // Replace with your DB details
    String username = "System"; // Replace with your DB username
    String password = "a"; // Replace with your DB password

    public Conn()
    {
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
    public static void main(String[] args) {
        // JDBC URL for Oracle database
        new Conn();

        
    }
}