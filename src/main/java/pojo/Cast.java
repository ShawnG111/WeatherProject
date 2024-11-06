
package pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Cast {

    @Expose
    private String date;
    @Expose
    private String daypower;
    @Expose
    private String daytemp;
    @SerializedName("daytemp_float")
    private String daytempFloat;
    @Expose
    private String dayweather;
    @Expose
    private String daywind;
    @Expose
    private String nightpower;
    @Expose
    private String nighttemp;
    @SerializedName("nighttemp_float")
    private String nighttempFloat;
    @Expose
    private String nightweather;
    @Expose
    private String nightwind;
    @Expose
    private String week;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDaypower() {
        return daypower;
    }

    public void setDaypower(String daypower) {
        this.daypower = daypower;
    }

    public String getDaytemp() {
        return daytemp;
    }

    public void setDaytemp(String daytemp) {
        this.daytemp = daytemp;
    }

    public String getDaytempFloat() {
        return daytempFloat;
    }

    public void setDaytempFloat(String daytempFloat) {
        this.daytempFloat = daytempFloat;
    }

    public String getDayweather() {
        return dayweather;
    }

    public void setDayweather(String dayweather) {
        this.dayweather = dayweather;
    }

    public String getDaywind() {
        return daywind;
    }

    public void setDaywind(String daywind) {
        this.daywind = daywind;
    }

    public String getNightpower() {
        return nightpower;
    }

    public void setNightpower(String nightpower) {
        this.nightpower = nightpower;
    }

    public String getNighttemp() {
        return nighttemp;
    }

    public void setNighttemp(String nighttemp) {
        this.nighttemp = nighttemp;
    }

    public String getNighttempFloat() {
        return nighttempFloat;
    }

    public void setNighttempFloat(String nighttempFloat) {
        this.nighttempFloat = nighttempFloat;
    }

    public String getNightweather() {
        return nightweather;
    }

    public void setNightweather(String nightweather) {
        this.nightweather = nightweather;
    }

    public String getNightwind() {
        return nightwind;
    }

    public void setNightwind(String nightwind) {
        this.nightwind = nightwind;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    @Override
    public String toString() {
        return "Cast{" +
                "date='" + date + '\'' +
                ", daypower='" + daypower + '\'' +
                ", daytemp='" + daytemp + '\'' +
                ", daytempFloat='" + daytempFloat + '\'' +
                ", dayweather='" + dayweather + '\'' +
                ", daywind='" + daywind + '\'' +
                ", nightpower='" + nightpower + '\'' +
                ", nighttemp='" + nighttemp + '\'' +
                ", nighttempFloat='" + nighttempFloat + '\'' +
                ", nightweather='" + nightweather + '\'' +
                ", nightwind='" + nightwind + '\'' +
                ", week='" + week + '\'' +
                '}';
    }
}
