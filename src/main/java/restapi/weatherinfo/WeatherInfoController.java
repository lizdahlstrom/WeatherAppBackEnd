package restapi.weatherinfo;

import entities.sub_entity.WeatherInfo;
import entities.sub_entity.WeatherStation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repository.WeatherInfoRepository;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Liz on 2/9/2017.
 *
 *     --- Endpoints ---
 *    /weather-info/
 *
 */
@RestController
public class WeatherInfoController {

    @Autowired
    private WeatherInfoRepository repository;

    /** Get weather info by station id **/
    @CrossOrigin
    @RequestMapping(path = "/weather-station/{id}/weather-info/" , method = RequestMethod.GET , produces = "application/json")
    public ArrayList<WeatherInfo> getWeatherInfos(@PathVariable long id){
        return repository.findByWeatherStationId(id);
    }


    /** Create weather info **/
    @CrossOrigin
    @RequestMapping(method = RequestMethod.POST , value = "/weather-station/{stationId}/weather-info/")
    public String addWeatherInfo(@RequestBody WeatherInfo weatherInfo , @PathVariable long stationId){

        WeatherStation weatherStation = new WeatherStation("");
        weatherStation.setID(stationId);
        weatherInfo.setWeatherStation(weatherStation);
        repository.save(weatherInfo);
        return "Create successful!";
    }

    /** Update weather info **/
    @CrossOrigin
    @RequestMapping(method = RequestMethod.PUT , value = "/weather-info/")
    public String updateWeatherInfo(@RequestBody WeatherInfo weatherInfo){
        repository.save(weatherInfo);
        return "Update successful!";

    }

    /** Find weather info by id **/
    @CrossOrigin
    @RequestMapping(value = "/weather-info/{id}/" , method = RequestMethod.GET)
    public ArrayList<WeatherInfo> findById(@PathVariable long id){
        return repository.findById(id);
    }
    /** Delete weather info by id **/
    @CrossOrigin
    @RequestMapping(value = "/weather-info/{id}/" , method = RequestMethod.DELETE)
    public String delete(@PathVariable long id){
         repository.delete(id);
         return "Delete successful!";
    }
}
