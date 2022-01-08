package com.restaurantapp.RestaurantApp.OrderItem;

import com.restaurantapp.RestaurantApp.Dish.Dish;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/order-items")
public class OrderItemController {
    private final OrderItemContainer container;

    @Autowired
    public OrderItemController(OrderItemContainer container) {
        this.container = container;
    }

    @PostMapping
    public void add(@RequestBody OrderItem orderItem) {
        container.add(orderItem);
    }

    @GetMapping
    public List<OrderItem> getAll() {
        return container.getAll();
    }

    @DeleteMapping(path = "{id}")
    public void delete(@PathVariable("id") Long id){
        container.delete(id);
    }

    @GetMapping(path = "{orderId}")
    public List<OrderItem> getByOrderId(@PathVariable("orderId") Long id){
        return container.getByOrderId(id);
    }
}
