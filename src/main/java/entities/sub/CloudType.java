package entities.sub;

import entities.CoreEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Michael Sjögren on 2017-02-09.
 */

@Entity

public class CloudType extends CoreEntity {

    public CloudType(String name, WeatherInfo weatherinfo){
        super();
        this.name = name;
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
