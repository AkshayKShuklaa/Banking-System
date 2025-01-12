import java.sql.*;
public class Conn 
{
    Connection connection;
    Statement s;
    String jdbcURL = "jdbc:oracle:thin:@localhost:1521:xe"; // Replace with your DB details
    String username = "System"; // Replace with your DB username
    String password = "a"; // Replace with your DB password

    public Conn()
    {
        try {
            // Establish connection
            connection = DriverManager.getConnection(jdbcURL, username, password);
            s=connection.createStatement();
            System.out.println("Connected to Oracle Database successfully!");
            System.out.println(connection);
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
