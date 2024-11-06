
package pojo;

import java.util.List;
import com.google.gson.annotations.Expose;

@SuppressWarnings("unused")
public class PojoTest {

    @Expose
    private String count;
    @Expose
    private List<Forecast> forecasts;
    @Expose
    private String info;
    @Expose
    private String infocode;
    @Expose
    private String status;

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

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

    public String getInfocode() {
        return infocode;
    }

    public void setInfocode(String infocode) {
        this.infocode = infocode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "PojoTest{" +
                "count='" + count + '\'' +
                ", forecasts=" + forecasts +
                ", info='" + info + '\'' +
                ", infocode='" + infocode + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
