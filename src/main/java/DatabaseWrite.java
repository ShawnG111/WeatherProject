import com.google.gson.Gson;
import functions.ReturnUrl;
import pojo.WeatherInfo;

public class DatabaseWrite {

    public static void main(String[] args) {
        Gson gson=new Gson();
        String json = ReturnUrl.getUrl("https://restapi.amap.com/v3/weather/weatherInfo?city=320100&key=4d15df123afe6dd97b4dccf6290cc8fc&extensions=all");
        WeatherInfo data=gson.fromJson(json, WeatherInfo.class);
        WeatherJdbc.insert(data);
    }
}
