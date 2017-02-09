package app;

import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Liz on 2/9/2017.
 *
 *  MAIN SPRING APP
 */

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}