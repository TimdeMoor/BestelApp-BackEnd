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
    Long id;
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
