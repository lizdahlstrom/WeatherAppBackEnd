package restapi.weatherinfo;

import entities.sub_entity.WeatherInfo;
import entities.sub_entity.WeatherStation;
import org.hibernate.Hibernate;
import org.hibernate.SessionFactory;
import org.hibernate.engine.spi.SessionFactoryDelegatingImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.vendor.HibernateJpaSessionFactoryBean;
import org.springframework.web.bind.annotation.*;
import repository.WeatherInfoRepository;

import javax.persistence.EntityManager;
import javax.websocket.Session;
import java.sql.Date;
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

    @RequestMapping(path = "/weather-info/findAll" , method = RequestMethod.GET , produces = "application/json")
    public ArrayList<WeatherInfo> getWeatherReports(){
        return repository.findAll();
    }
    
}
