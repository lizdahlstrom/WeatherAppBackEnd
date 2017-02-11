package entities.sub_entity;

import entities.super_entity.CoreEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Created by Michael Sjögren on 2017-02-09.
 */

@Entity
@Table(name = "cloud_type")
public class CloudType extends CoreEntity {


    @Column(name = "cloud_type_name")
    private String name;

    @OneToOne
    private WeatherInfo weatherInfo;

    public CloudType(String name){
        this.name = name;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WeatherInfo getWeatherInfo() {
        return weatherInfo;
    }

    public void setWeatherInfo(WeatherInfo weatherInfo) {
        this.weatherInfo = weatherInfo;
    }
}
