package com.restaurantapp.RestaurantApp.Dish;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import javax.persistence.*;

@Table
@Entity
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Dish {
    @Id
    @SequenceGenerator(
            name = "dish_sequence",
            sequenceName = "dish_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "dish_sequence"
    )
    private Long id;
    String name;
    Double price;

    public Dish(String name, Double price){
        this.name = name;
        this.price = price;
    }

    public Dish(){}

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
