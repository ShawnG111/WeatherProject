
package pojo;

import java.util.List;
import com.google.gson.annotations.Expose;

@SuppressWarnings("unused")
public class Forecast {

    @Expose
    private String adcode;
    @Expose
    private List<Cast> casts;
    @Expose
    private String city;
    @Expose
    private String province;
    @Expose
    private String reporttime;

    public String getAdcode() {
        return adcode;
    }

    public void setAdcode(String adcode) {
        this.adcode = adcode;
    }

    public List<Cast> getCasts() {
        return casts;
    }

    public void setCasts(List<Cast> casts) {
        this.casts = casts;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getReporttime() {
        return reporttime;
    }

    public void setReporttime(String reporttime) {
        this.reporttime = reporttime;
    }

    @Override
    public String toString() {
        return "Forecast{" +
                "adcode='" + adcode + '\'' +
                ", casts=" + casts +
                ", city='" + city + '\'' +
                ", province='" + province + '\'' +
                ", reporttime='" + reporttime + '\'' +
                '}';
    }
}