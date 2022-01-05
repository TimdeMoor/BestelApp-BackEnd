package com.restaurantapp.RestaurantApp.Dish;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DishConfig {
    @Bean
    CommandLineRunner DishCommandLineRunner(DishRepository repo) {
        return args -> {
            Dish kroket = new Dish(
                    "Kroket",
                    1.50
            );
            Dish frikandel = new Dish(
                    "Frikandel",
                    1.30
            );
            Dish kip = new Dish(
                    "Kip",
                    3.50
            );
            repo.deleteAll(); //TODO:Weghalen
            repo.save(kroket);
            repo.save(frikandel);
            repo.save(kip);
        };
    }
}
