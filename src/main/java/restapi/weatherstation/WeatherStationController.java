package restapi.weatherstation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import repository.WeatherStationRepository;

/**
 * Created by Michael Sjögren on 2017-02-13.
 */
public class WeatherStationController {

    @Autowired
    private WeatherStationRepository repository;

    @RequestMapping("/add")
    public void addStation(){

    }
}
