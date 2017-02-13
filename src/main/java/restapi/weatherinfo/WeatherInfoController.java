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

    @RequestMapping(value = "/weather-info/create" , method = RequestMethod.POST , produces = "application/json")
    public void createWeatherInfo(@RequestBody WeatherInfo weatherInfo ){
        // TODO: koppla relationen mellan weather info och weather station
        // skapar en väder info men weather_station_id förblir null och skapar inte relation mellan station och info

        repository.save(weatherInfo);
    }

    @RequestMapping(path = "/weather-station/{id}/weather-info" , method = RequestMethod.GET , produces = "application/json")
    public ArrayList<WeatherInfo> getWeatherReports(@PathVariable long id){
        ArrayList<WeatherInfo> weatherReports = new ArrayList<>();
        repository.findByWeatherStationId(id).forEach(weatherReports :: add );
        return weatherReports;
    }

    @RequestMapping("/weather-station/{stationID}/weather-info/{id}")
    public WeatherInfo getWeatherReport(@PathVariable long id){
        return repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST , value = "/weather-station/{stationId}/weather-info/")
    public void addWeatherReport(@RequestBody WeatherInfo weatherInfo , @PathVariable long stationId){
        weatherInfo.setWeatherStation(new WeatherStation(""));
        repository.save(weatherInfo);
    }

    @RequestMapping(method = RequestMethod.POST , value = "/weather-station/{stationId}/weather-info/{id}")
    public void updateWeatherReport(@RequestBody WeatherInfo weatherInfo , @PathVariable long stationId){
        weatherInfo.setWeatherStation(new WeatherStation(""));
        repository.save(weatherInfo);
    }

    @RequestMapping(value = "/weather-station/{stationId}/weather-info/{id}" , method = RequestMethod.GET)
    public ArrayList<WeatherInfo> findById(@PathVariable long id){
        return repository.findById(id);
    }
}
