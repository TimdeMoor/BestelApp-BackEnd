package com.restaurantapp.RestaurantApp.OrderItem;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

    @Query("select oi from OrderItem oi where oi.orderId = :orderId")
    List<OrderItem> getOrderItemByOrderId(@Param(value = "orderId") Long orderId);
}
