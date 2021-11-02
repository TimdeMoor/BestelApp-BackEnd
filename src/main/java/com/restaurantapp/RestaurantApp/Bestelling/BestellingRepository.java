package com.restaurantapp.RestaurantApp.Bestelling;

import com.restaurantapp.RestaurantApp.Dish.Dish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BestellingRepository extends JpaRepository<Bestelling, Long> {

    @Query("select b from Bestelling b where b.isComplete = false")
    List<Bestelling> getIncomplete();
}
