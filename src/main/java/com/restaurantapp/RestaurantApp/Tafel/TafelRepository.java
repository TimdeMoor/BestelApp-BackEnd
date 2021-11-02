package com.restaurantapp.RestaurantApp.Tafel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TafelRepository extends JpaRepository<Tafel, Long> {}
