package restapi.weatherstation;

import entities.sub_entity.WeatherStation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repository.WeatherStationRepository;

import java.util.ArrayList;

/**
 * Created by Michael Sjögren on 2017-02-13.
 */

@RestController
public class WeatherStationController {

    @Autowired
    private WeatherStationRepository repository;
    /** Create weather station **/
    @CrossOrigin
    @RequestMapping(value = "/weather-station/" , method = RequestMethod.POST)
    public void createWeatherStation(@RequestBody WeatherStation weatherStation){
            repository.save(weatherStation);
    }
    
    /** Get all weather stations **/
    @CrossOrigin
    @RequestMapping(value = "/weather-station/" , method = RequestMethod.GET , produces = "application/json")
    public ArrayList<WeatherStation> getAllWeatherStations(){
        ArrayList<WeatherStation> stations = new ArrayList<>();
        repository.findAll().forEach(stations :: add );
        return stations;
    }
    /** Get weather stations by id **/
    @CrossOrigin
    @RequestMapping(value = "/weather-station/{id}/" , method = RequestMethod.GET , produces = "application/json")
    public WeatherStation getStationById(@PathVariable long id){
        WeatherStation weatherStation = repository.findOne(id);
        return weatherStation;
    }

    /** Update weatherStation **/
    @CrossOrigin
    @RequestMapping(value = "/weather-station/" , method = RequestMethod.PUT )
    public void updateWeatherStation(@RequestBody WeatherStation weatherStation){
        repository.save(weatherStation);
    }

    /** Delete weather station by id **/
    @CrossOrigin
    @RequestMapping(value = "/weather-station/{id}/" , method = RequestMethod.PUT )
    public void deleteWeatherStation(@PathVariable long id){
        repository.delete(id);
    }

}
