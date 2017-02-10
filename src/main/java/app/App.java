package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by Liz on 2/9/2017.
 *
 *  MAIN SPRING APP
 */

@SpringBootApplication
@EnableJpaRepositories(basePackages = "repository")
@EntityScan(basePackages = "entities")
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}