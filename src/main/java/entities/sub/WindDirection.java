package entities.sub;

import entities.CoreEntity;

import javax.persistence.Entity;

/**
 * Created by Michael Sjögren on 2017-02-09.
 */
@Entity
public class WindDirection extends CoreEntity {

    public WindDirection(String name,WeatherInfo weatherinfo){
        super();
        this.name= name;
        this.weatherinfo=weatherinfo;

    }
    private String name;
    private WeatherInfo weatherinfo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WeatherInfo getWeatherinfo() {
        return weatherinfo;
    }

    public void setWeatherinfo(WeatherInfo weatherinfo) {
        this.weatherinfo = weatherinfo;
    }

}
