package com.restaurantapp.RestaurantApp.Bestelling;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BestellingConfig {
    @Bean
    CommandLineRunner BestellingCommandLineRunner(BestellingRepository repo) {
        return args -> {
            repo.deleteAll(); //TODO:Weghalen
            repo.save(new Bestelling(1L, false));
            repo.save(new Bestelling(2L, false));
            repo.save(new Bestelling(3L, false));
        };
    }
}
