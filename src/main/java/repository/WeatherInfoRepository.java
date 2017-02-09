package repository;

import entities.sub.WeatherInfo;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Liz on 2017-02-09.
 */
public interface WeatherInfoRepository extends CrudRepository <WeatherInfo, Integer> {

}
