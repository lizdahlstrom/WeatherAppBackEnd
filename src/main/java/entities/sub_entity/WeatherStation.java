package entities.sub_entity;

import entities.super_entity.CoreEntity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Michael Sjögren on 2017-02-09.
 */
@Entity
@Table(name = "weather_station")
public class WeatherStation extends CoreEntity {

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "weather_info_id")
    private List<WeatherInfo> weatherReports = new ArrayList<>();

    @Column(name = "station_name")
    private String name;

    public WeatherStation(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<WeatherInfo> getWeatherReports() {
        return weatherReports;
    }
}