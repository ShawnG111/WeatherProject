package excelNew;

import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;
import functions.Close;

import java.sql.*;

public class CityJdbc {
    private static String URL = "jdbc:mysql://172.20.0.87:3306/test";
    private static String USER = "brms_admin";
    private static String PASSWORD = "brms_admin123";

    public static void insert(ExcelData data){
        Connection conn = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            conn = DriverManager.getConnection(URL,USER,PASSWORD);

            String sql2 = "INSERT INTO citycode (adcode, cityname, citycode) VALUES (?,?,?)";
            preparedStatement = conn.prepareStatement(sql2);
            preparedStatement.setInt(1, data.getAdCode());
            preparedStatement.setString(2, data.getCityName());
            preparedStatement.setInt(3, data.getCityCode());
            preparedStatement.execute();

        } catch (MySQLIntegrityConstraintViolationException e) {

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            Close.run(conn);
        }
    }
}
