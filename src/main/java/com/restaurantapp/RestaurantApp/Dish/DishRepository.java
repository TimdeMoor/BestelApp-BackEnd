package com.restaurantapp.RestaurantApp.Dish;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DishRepository extends JpaRepository<Dish, Long> {

    @Query("select d from Dish d where d.id = :dishId")
    Dish getSingle(@Param(value = "dishId") Long dishId);
}
