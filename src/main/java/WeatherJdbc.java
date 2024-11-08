import functions.Close;
import pojo.Cast;
import pojo.WeatherInfo;

import java.sql.*;

public class WeatherJdbc {
    private static String URL = "jdbc:mysql://172.20.0.87:3306/test";
    private static String USER = "brms_admin";
    private static String PASSWORD = "brms_admin123";

    public static void insert(WeatherInfo info){
        Connection conn = null;
        PreparedStatement preparedStatement = null;

        try {
            conn = DriverManager.getConnection(URL,USER,PASSWORD);

            String sql1 = "INSERT INTO weather_check (status, count, info, infocode, city, adcode, province, reporttime) VALUES (?,?,?,?,?,?,?,?)";
            preparedStatement = conn.prepareStatement(sql1, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setInt(1, info.getStatus());
            preparedStatement.setInt(2, info.getCount());
            preparedStatement.setString(3, info.getInfo());
            preparedStatement.setInt(4, info.getInfocode());
            preparedStatement.setString(5, info.getForecasts().get(0).getCity());
            preparedStatement.setInt(6, info.getForecasts().get(0).getAdcode());
            preparedStatement.setString(7, info.getForecasts().get(0).getProvince());
            preparedStatement.setString(8, info.getForecasts().get(0).getReporttime());
            preparedStatement.executeUpdate();
            ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
            int i=0;
            if(generatedKeys.next())
                i = generatedKeys.getInt(1);

            String sql2 = "INSERT INTO weather_info (num_primary, date, week, dayweather, nightweather, daytemp, nighttemp, daywind, nightwind, daypower, nightpower, daytemp_float, nighttemp_float) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            for(Cast c:info.getForecasts().get(0).getCasts()){
                preparedStatement = conn.prepareStatement(sql2);
                preparedStatement.setInt(1, i);
                preparedStatement.setString(2, c.getDate());
                preparedStatement.setInt(3, c.getWeek());
                preparedStatement.setString(4, c.getDayweather());
                preparedStatement.setString(5, c.getNightweather());
                preparedStatement.setInt(6, c.getDaytemp());
                preparedStatement.setInt(7, c.getNighttemp());
                preparedStatement.setString(8, c.getDaywind());
                preparedStatement.setString(9, c.getNightwind());
                preparedStatement.setString(10, c.getDaypower());
                preparedStatement.setString(11, c.getNightpower());
                preparedStatement.setFloat(12, c.getDaytempFloat());
                preparedStatement.setFloat(13, c.getNighttempFloat());
                preparedStatement.execute();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Close.run(conn);
        }

    }
}
