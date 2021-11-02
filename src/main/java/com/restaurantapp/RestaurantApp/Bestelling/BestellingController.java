package com.restaurantapp.RestaurantApp.Bestelling;

import com.restaurantapp.RestaurantApp.Dish.Dish;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/orders")
public class BestellingController {
    private final BestellingContainer container;

    @Autowired
    public BestellingController(BestellingContainer bestellingContainer) {
        this.container = bestellingContainer;
    }

    @GetMapping()
    public List<Bestelling> getAll() {
        return container.getAll();
    }

    @GetMapping(path = "{OrderId}/dishes")
    public List<Dish> getOrderDishes(){
        return null;
    }

    @PostMapping
    public void add(@RequestBody Bestelling bestelling) {
        container.add(bestelling);
    }

    @DeleteMapping(path = "{OrderId}")
    public void delete(@PathVariable("OrderId") Long id){
        container.delete(id);
    }

    @PatchMapping(path = "complete/{OrderId}")
    public void complete(@PathVariable("OrderId") Long id) {
        container.complete(id);
    }

    @GetMapping(path = "incomplete")
    public List<Bestelling> getIncomplete(){
        return container.getIncomplete();
    }
}
