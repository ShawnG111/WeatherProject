package excel;
import java.sql.*;

public class CityJdbc {
    private static String URL = "jdbc:mysql://172.20.0.87:3306/test";
    private static String USER = "brms_admin";
    private static String PASSWORD = "brms_admin123";

    public static void insert(ExcelData data){
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL,USER,PASSWORD);
            String sql = "insert into citycode (adcode, cityname, citycode) VALUES (?,?,?)";
            PreparedStatement ps = null;
            ps = conn.prepareStatement(sql);
            ps.setInt(1,data.getAdCode());
            ps.setString(2,data.getCityName());
            ps.setInt(3,data.getCityCode());
            ps.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally{
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
