package com.restaurantapp.RestaurantApp.Dish;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DishConfig {
    @Bean
    CommandLineRunner DishCommandLineRunner(DishRepository repository) {
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
            repository.save(kroket);
            repository.save(frikandel);
            repository.save(kip);
        };
    }
}
