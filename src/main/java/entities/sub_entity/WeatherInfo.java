package entities.sub_entity;

import entities.super_entity.CoreEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
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

    public WeatherInfo(Date date , int airPressure , byte humidity , double windForce , int cloudBase , byte okta){
        this.date = date;
        this.airPressure = airPressure;
        this.humidity = humidity;
        this.windForce = windForce;
        this.cloudBase = cloudBase;
        this.okta = okta;
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
}
