package entities.sub_entity;

import entities.super_entity.CoreEntity;

import javax.persistence.*;
import java.sql.Date;


/**
 * Created by Michael Sjögren on 2017-02-09.
 */
@Entity
@Table(name = "weather_info")
public class WeatherInfo extends CoreEntity {

    @Column(name = "date")
    private Date date;

    @Column(name = "air_pressure")
    private int airPressure;

    @Column(name = "humidity")
    private byte humidity;

    @Column(name = "wind_force")
    private double windForce;

    @Column(name = "cloud_base")
    private int cloudBase;

    @Column(name = "okta")
    private byte okta;

    @JoinColumn(name = "wind_direction_id")
    private WindDirection windDirection;

    @JoinColumn(name = "cloud_type_id")
    private CloudType cloudType;

    @ManyToOne()
    private WeatherStation weatherStation;

    public WeatherInfo(Date date , int airPressure , byte humidity , double windForce , int cloudBase , byte okta , WindDirection windDirection , CloudType cloudType){
        this.date = date;
        this.airPressure = airPressure;
        this.humidity = humidity;
        this.windForce = windForce;
        this.cloudBase = cloudBase;
        this.okta = okta;
        this.windDirection = windDirection;
        this.cloudType = cloudType;
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

    public CloudType getCloudType() {
        return cloudType;
    }

    public void setCloudType(CloudType cloudType) {
        this.cloudType = cloudType;
    }

    public WindDirection getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(WindDirection windDirection) {
        this.windDirection = windDirection;
    }

    public WeatherStation getWeatherStation() {
        return weatherStation;
    }

    public void setWeatherStation(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }
}
