package entities.sub_entity;

import entities.super_entity.CoreEntity;

import javax.persistence.*;
import java.util.*;

/**
 * Created by Michael Sjögren on 2017-02-09.
 */
@Entity
public class WeatherStation extends CoreEntity {

    @OneToMany
    private Collection<WeatherInfo> weatherInfo = new ArrayList<>();

    private String name;

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

    public Collection<WeatherInfo> getWeatherInfo() {
        return weatherInfo;
    }

    public void setWeatherInfo(Collection<WeatherInfo> weatherInfo) {
        this.weatherInfo = weatherInfo;
    }
}