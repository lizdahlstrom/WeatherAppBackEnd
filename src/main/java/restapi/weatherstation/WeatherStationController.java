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
    @RequestMapping(value = "/weather-station/" , method = RequestMethod.POST , produces = "application/json")
    public String createWeatherStation(@RequestBody WeatherStation weatherStation){
            repository.save(weatherStation);
            return "Created station successfully!";
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
    @RequestMapping(value = "/weather-station/" , method = RequestMethod.PUT , produces = "application/json")
    public String updateWeatherStation(@RequestBody WeatherStation weatherStation){
        repository.save(weatherStation);
        return "updated station" + weatherStation.getID() + "successfully!";
    }

    /** Delete weather station by id **/
    @CrossOrigin
    @RequestMapping(value = "/weather-station/{id}/" , method = RequestMethod.PUT  , produces = "application/json")
    public String deleteWeatherStation(@PathVariable long id){
        repository.delete(id);
        return "Deleted station with id: " + id + " successfully!";
    }

}
