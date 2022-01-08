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
        };
    }
}
