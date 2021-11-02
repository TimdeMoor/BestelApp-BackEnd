package com.restaurantapp.RestaurantApp.Tafel;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import javax.persistence.*;

@Entity
@javax.persistence.Table
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Tafel {
    @Id
    @SequenceGenerator(
            name = "table_sequence",
            sequenceName = "table_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "table_sequence"
    )
    private Long id;
    Integer capacity;

    public Tafel(){}

    public Tafel(Integer capacity) {
        this.capacity = capacity;
    }

    public void setCapacity(Integer newCapacity){
        capacity = newCapacity;
    }
}
