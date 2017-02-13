package repository;

import entities.sub_entity.WeatherInfo;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Liz on 2017-02-09.
 */
public interface WeatherInfoRepository extends CrudRepository <WeatherInfo, Long> {
    ArrayList<WeatherInfo> findById(long id);
    ArrayList<WeatherInfo> findByWeatherStationId(long id);
    ArrayList<WeatherInfo> findByDate(Date date);
    ArrayList<WeatherInfo> findByTemp(double temp);
    ArrayList<WeatherInfo> findByAirPressure(int airPressure);
    ArrayList<WeatherInfo> findByHumidity(double temp);
    ArrayList<WeatherInfo> findByWindForce(double windForce);
    ArrayList<WeatherInfo> findByCloudBase(int cloudBase);
    ArrayList<WeatherInfo> findByOkta(byte okta);
    ArrayList<WeatherInfo> findByCloudType(String type);
    ArrayList<WeatherInfo> findByWindDirection(String direction);

}
