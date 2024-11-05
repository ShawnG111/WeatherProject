package excel;
import java.sql.*;

public class IntoDatabase {
    public static String URL = "jdbc:mysql://172.20.0.87:3306/test";
    public static String USER = "brms_admin";
    public static String PASSWORD = "brms_admin123";

    private static Connection conn = null;
    static{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static Connection getConnection(){
        return conn;
    }

    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
    }

}
