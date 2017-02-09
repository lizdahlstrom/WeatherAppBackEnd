package entities.sub_entity;

import entities.super_entity.CoreEntity;

import javax.persistence.Entity;
import java.sql.Date;


/**
 * Created by Michael Sjögren on 2017-02-09.
 */
@Entity
public class WeatherInfo extends CoreEntity {

    private Date date;
    private int airPressure;
    private byte humidity;
    private double windForce;
    private int cloudBase;
    private byte okta;
    private CloudType cloudType;
    private WindDirection windDirection;
    // FK
    private long station_id;

    public WeatherInfo(Date date , int airPressure , byte humidity , double windForce , int cloudBase , byte okta, CloudType cloudType , WindDirection windDirection ){

        this.date = date;
        this.airPressure = airPressure;
        this.humidity = humidity;
        this.windForce = windForce;
        this.cloudBase = cloudBase;
        this.okta = okta;
        this.cloudType = cloudType;
        this.windDirection = windDirection;
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
}
