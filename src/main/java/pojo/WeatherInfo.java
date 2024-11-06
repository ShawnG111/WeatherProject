
package pojo;

import java.util.List;
import com.google.gson.annotations.Expose;

@SuppressWarnings("unused")
public class WeatherInfo {

    @Expose
    private int count;
    @Expose
    private List<Forecast> forecasts;
    @Expose
    private String info;
    @Expose
    private int infocode;
    @Expose
    private int status;

    public int getCount() {
        return count;
    }

    public void setCount(int count) { this.count = count; }

    public List<Forecast> getForecasts() {
        return forecasts;
    }

    public void setForecasts(List<Forecast> forecasts) {
        this.forecasts = forecasts;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getInfocode() {
        return infocode;
    }

    public void setInfocode(int infocode) {
        this.infocode = infocode;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

}
