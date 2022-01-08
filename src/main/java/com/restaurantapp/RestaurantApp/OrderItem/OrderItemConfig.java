package com.restaurantapp.RestaurantApp.OrderItem;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OrderItemConfig {

    @Bean
    CommandLineRunner OrderItemCommandLineRunner(OrderItemRepository repo) {
        return args -> {
            repo.deleteAll(); //TODO:Weghalen
            repo.save(new OrderItem(1L, 1L, 2));
            repo.save(new OrderItem(2L, 2L, 1));
            repo.save(new OrderItem(2L, 1L, 3, "Extra saus"));
            repo.save(new OrderItem(1L, 3L, 6,"Vegetarisch"));
            repo.save(new OrderItem(3L, 2L, 1));
            repo.save(new OrderItem(2L, 3L, 3));
            repo.save(new OrderItem(1L, 2L, 2));
        };
    }
}
