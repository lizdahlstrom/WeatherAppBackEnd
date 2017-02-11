package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by Liz on 2/9/2017.
 *
 *  MAIN SPRING APP
 */

@SpringBootApplication
// for registration of where the repository interfaces are
@EnableJpaRepositories(basePackages = "repository")
// for registration of where the entity classes are
@EntityScan(basePackages = "entities")
// for registration of where the controller classes are
@ComponentScan(basePackages = "restapi")
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}