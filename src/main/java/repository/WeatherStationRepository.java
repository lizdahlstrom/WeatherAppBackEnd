package repository;

import entities.sub_entity.WeatherInfo;
import entities.sub_entity.WeatherStation;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Michael Sjögren on 2017-02-13.
 */
public interface WeatherStationRepository extends CrudRepository<WeatherStation , Long> {
    ArrayList<WeatherStation> findById(long id);
    ArrayList<WeatherStation> findByWeatherStationId(long id);
    
}
