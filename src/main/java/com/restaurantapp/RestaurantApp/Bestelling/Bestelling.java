package com.restaurantapp.RestaurantApp.Bestelling;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.restaurantapp.RestaurantApp.Dish.Dish;
import com.restaurantapp.RestaurantApp.OrderItem.OrderItem;

import javax.persistence.*;
import java.util.List;

@Table
@Entity
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Bestelling {
    @Id
    @SequenceGenerator(
            name = "bestelling_sequence",
            sequenceName = "bestelling_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "bestelling_sequence"
    )
    private Long id;
    Long tableId;
    Double totalPrice;
    boolean isComplete;

    public Bestelling(Long tableId, boolean isComplete) {
        this.tableId = tableId;
        this.isComplete = false;
    }
    public Bestelling(){}

    public void Complete(){
        this.isComplete = true;
    }
}
