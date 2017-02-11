package restapi.weatherinfo;

import entities.sub_entity.WeatherInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import repository.WeatherInfoRepository;

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
    private WeatherInfoRepository weatherInfoRepository;

    @RequestMapping("/hello")
    public String greeter() {
        return "hello world";
    }

    @RequestMapping("/weatherinfos")
    public String weatherInfo(){
        return weatherInfoRepository.findAll().toString();
    }
}
