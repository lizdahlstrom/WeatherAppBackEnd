package entities.sub;

import entities.CoreEntity;

import javax.persistence.Entity;

/**
 * Created by Michael Sjögren on 2017-02-09.
 */
@Entity
public class WeatherStation extends CoreEntity {

    public WeatherStation(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}