package entities.sub_entity;

import entities.super_entity.CoreEntity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Michael Sjögren on 2017-02-09.
 */
@Entity
@Table(name = "weather_station")
public class WeatherStation extends CoreEntity {

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "weather_info_id")
    private Set<WeatherInfo> weatherInfos = new HashSet<>();

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

}