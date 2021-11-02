package com.restaurantapp.RestaurantApp.OrderItem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderItemContainer {
    private final OrderItemRepository repo;

    @Autowired
    public OrderItemContainer(OrderItemRepository repo) {
        this.repo = repo;
    }

    public void add(OrderItem oi) {
        repo.save(oi);
    }

    public List<OrderItem> getAll() {
        return repo.findAll();
    }

    public void delete(Long id){
        repo.deleteById(id);
    }
}
