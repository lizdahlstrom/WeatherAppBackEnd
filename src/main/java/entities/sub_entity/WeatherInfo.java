package entities.sub_entity;

import entities.super_entity.CoreEntity;

import javax.persistence.*;
import java.sql.Date;


/**
 * Created by Michael Sjögren on 2017-02-09.
 */
@Entity
public class WeatherInfo extends CoreEntity {

    private double temp;
    private Date date;
    private int airPressure;
    private byte humidity;
    private double windForce;
    private int cloudBase;
    private byte okta;
    private String cloudType;
    private String windDirection;
    @ManyToOne
    @JoinColumn(name = "weather_station_id")
    private WeatherStation weatherStation;

    public WeatherInfo(){}

    public WeatherInfo(Date date , int airPressure , byte humidity , double windForce , int cloudBase , byte okta , String windDirection , String cloudType , double temp ){
        this.date = date;
        this.airPressure = airPressure;
        this.humidity = humidity;
        this.windForce = windForce;
        this.cloudBase = cloudBase;
        this.okta = okta;
        this.windDirection = windDirection;
        this.cloudType = cloudType;
        this.temp = temp;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getAirPressure() {
        return airPressure;
    }

    public void setAirPressure(int airPressure) {
        this.airPressure = airPressure;
    }

    public byte getHumidity() {
        return humidity;
    }

    public void setHumidity(byte humidity) {
        this.humidity = humidity;
    }

    public double getWindForce() {
        return windForce;
    }

    public void setWindForce(double windForce) {
        this.windForce = windForce;
    }

    public int getCloudBase() {
        return cloudBase;
    }

    public void setCloudBase(int cloudBase) {
        this.cloudBase = cloudBase;
    }

    public byte getOkta() {
        return okta;
    }

    public void setOkta(byte okta) {
        this.okta = okta;
    }

    public String getCloudType() {
        return cloudType;
    }

    public void setCloudType(String cloudType) {
        this.cloudType = cloudType;
    }

    public String getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(String windDirection) {
        this.windDirection = windDirection;
    }

    public WeatherStation getWeatherStation() {
        return weatherStation;
    }

    public void setWeatherStation(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }
}
