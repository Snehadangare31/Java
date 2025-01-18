import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCExample {
    public static void main(String[] args) {
        // Database connection details
        String jdbcURL = "jdbc:mysql://localhost:3306/your_database_name"; // Replace with your DB name
        String dbUsername = "your_username"; // Replace with your username
        String dbPassword = "your_password"; // Replace with your password

        Connection connection = null;

        try {
            // Step 1: Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver"); // MySQL Connector Driver

            // Step 2: Establish a connection
            connection = DriverManager.getConnection(jdbcURL, dbUsername, dbPassword);
            System.out.println("Connected to the database!");

            // Step 3: Create a statement
            Statement statement = connection.createStatement();

            // Step 4: Execute a query
            String query = "SELECT * FROM your_table_name"; // Replace with your table name
            ResultSet resultSet = statement.executeQuery(query);

            // Step 5: Process the results
            while (resultSet.next()) {
                int id = resultSet.getInt("id"); // Replace with your column name
                String name = resultSet.getString("name"); // Replace with your column name
                System.out.println("ID: " + id + ", Name: " + name);
            }

            // Step 6: Close the ResultSet and Statement
            resultSet.close();
            statement.close();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Step 7: Close the connection
            try {
                if (connection != null) {
                    connection.close();
                    System.out.println("Database connection closed.");
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
