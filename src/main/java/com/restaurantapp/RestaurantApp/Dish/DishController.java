package com.restaurantapp.RestaurantApp.Dish;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/dishes")
public class DishController {
    private final DishContainer container;

    @Autowired
    public DishController(DishContainer container) {
        this.container = container;
    }

    @GetMapping
    public List<Dish> getAll() {
        return container.getAll();
    }

    @GetMapping(path = "{dishId}")
    public Dish getSingle(@PathVariable("dishId") Long id){
        return container.getSingle(id);
    }

    @PostMapping
    public void add(@RequestBody Dish dish) {
        container.add(dish);
    }

    @DeleteMapping(path ="{dishId}")
    public void delete(@PathVariable("dishId") Long id) {
        container.delete(id);
    }

    @PatchMapping(path = "{dishId}")
    public void update(
            @PathVariable("dishId") Long id,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) Double price) {
        container.update(id, name, price);
    }
}
