package excel;

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

            String sql1 = "SELECT count(*) count_value FROM citycode WHERE adcode = " + data.getAdCode() + " AND cityname = '" + data.getCityName() + "'";
            preparedStatement = conn.prepareStatement(sql1);
            resultSet = preparedStatement.executeQuery();
            int i=0;
            while (resultSet.next()) {
                int adcode = resultSet.getInt("count_value");
                i=adcode;
            }

            if(i == 0){
                String sql2 = "INSERT INTO citycode (adcode, cityname, citycode) VALUES (?,?,?)";
                preparedStatement = conn.prepareStatement(sql2);
                preparedStatement.setInt(1, data.getAdCode());
                preparedStatement.setString(2, data.getCityName());
                preparedStatement.setInt(3, data.getCityCode());
                preparedStatement.execute();
            }

//        } catch (MySQLIntegrityConstraintViolationException e) {

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
