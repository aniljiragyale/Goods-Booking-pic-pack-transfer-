import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    public static Connection initializeDatabase() throws Exception {
        String dbURL = "jdbc:mysql://localhost:3306/goods_booking";
        String dbUser = "root";
        String dbPass = "yourpassword"; // Change to your MySQL password
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(dbURL, dbUser, dbPass);
    }
}
