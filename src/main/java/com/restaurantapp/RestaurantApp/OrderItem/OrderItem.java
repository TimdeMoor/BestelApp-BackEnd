package com.restaurantapp.RestaurantApp.OrderItem;


import com.fasterxml.jackson.annotation.JsonAutoDetect;

import javax.persistence.*;

@Table
@Entity
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class OrderItem {
    @Id
    @SequenceGenerator(
            name = "order_sequence",
            sequenceName = "order_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "order_sequence"
    )
    private Long id;

    Long dishId;
    Long orderId;
    Integer amount;
    String opmerking;

    public OrderItem(){}

    public OrderItem(Long dishId, Long orderId, Integer amount, String opmerking) {
        this.dishId = dishId;
        this.orderId = orderId;
        this.amount = amount;
        this.opmerking = opmerking;
    }

    public OrderItem(Long dishId, Long orderId, Integer amount) {
        this.dishId = dishId;
        this.orderId = orderId;
        this.amount = amount;
        this.opmerking = null;
    }
}
