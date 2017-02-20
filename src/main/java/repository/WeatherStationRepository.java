package repository;

import entities.sub_entity.WeatherStation;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Michael Sjögren on 2017-02-13.
 */
public interface WeatherStationRepository extends CrudRepository<WeatherStation , Long> {
}
