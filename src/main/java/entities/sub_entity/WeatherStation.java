package entities.sub_entity;

import entities.super_entity.CoreEntity;

import javax.persistence.*;
import java.util.*;

/**
 * Created by Michael Sjögren on 2017-02-09.
 */
@Entity
public class WeatherStation extends CoreEntity {

    private String name;

    @OneToMany(targetEntity = WeatherInfo.class , mappedBy = "weatherStation" , cascade = CascadeType.ALL , fetch = FetchType.LAZY)
    private List<WeatherInfo> weatherInfo = new ArrayList<>();

    public WeatherStation(){}

    public WeatherStation(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public List<WeatherInfo> getWeatherInfo() {
        return weatherInfo;
    }

    public void setWeatherInfo(List<WeatherInfo> weatherInfo) {
        this.weatherInfo = weatherInfo;
    }
}