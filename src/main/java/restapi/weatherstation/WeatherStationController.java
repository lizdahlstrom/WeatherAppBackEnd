package restapi.weatherstation;

import entities.sub_entity.WeatherStation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import repository.WeatherStationRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Michael Sjögren on 2017-02-13.
 */

@RestController
public class WeatherStationController {

    @Autowired
    private WeatherStationRepository repository;

    @RequestMapping(value = "/weather-station/" , method = RequestMethod.POST , produces = "application/json")
    public void createWeatherStation(@RequestBody WeatherStation weatherStation){
            repository.save(weatherStation);
    }
}
