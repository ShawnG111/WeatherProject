
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
    private int daytemp;
    @SerializedName("daytemp_float")
    private float daytempFloat;
    @Expose
    private String dayweather;
    @Expose
    private String daywind;
    @Expose
    private String nightpower;
    @Expose
    private int nighttemp;
    @SerializedName("nighttemp_float")
    private float nighttempFloat;
    @Expose
    private String nightweather;
    @Expose
    private String nightwind;
    @Expose
    private int week;

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

    public int getDaytemp() {
        return daytemp;
    }

    public void setDaytemp(int daytemp) {
        this.daytemp = daytemp;
    }

    public float getDaytempFloat() {
        return daytempFloat;
    }

    public void setDaytempFloat(float daytempFloat) {
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

    public int getNighttemp() {
        return nighttemp;
    }

    public void setNighttemp(int nighttemp) {
        this.nighttemp = nighttemp;
    }

    public float getNighttempFloat() {
        return nighttempFloat;
    }

    public void setNighttempFloat(float nighttempFloat) {
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

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

}
