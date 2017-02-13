package repository;

import entities.sub_entity.WeatherInfo;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Liz on 2017-02-09.
 */
public interface WeatherInfoRepository extends CrudRepository <WeatherInfo, Long> {
    ArrayList<WeatherInfo> findAll();
}
