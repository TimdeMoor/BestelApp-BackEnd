package com.restaurantapp.RestaurantApp.Tafel;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TafelConfig {

    @Bean
    CommandLineRunner TafelCommandLineRunner(TafelRepository repo) {
        return args -> {
            repo.deleteAll(); //TODO:Weghalen
            repo.save(new Tafel(2));
            repo.save(new Tafel(2));
            repo.save(new Tafel(4));
            repo.save(new Tafel(4));
            repo.save(new Tafel(8));
        };
    }
}
