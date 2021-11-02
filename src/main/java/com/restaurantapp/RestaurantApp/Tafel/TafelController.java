package com.restaurantapp.RestaurantApp.Tafel;

import com.restaurantapp.RestaurantApp.Dish.Dish;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/tables")
public class TafelController {
    private final TafelContainer container;

    public TafelController(TafelContainer container) {
        this.container = container;
    }

    @GetMapping
    public List<Tafel> getAll(){
        return container.getAll();
    }

    @PostMapping
    public void add(@RequestBody Tafel tafel){
        container.add(tafel);
    }

    @DeleteMapping(path = "{tableId}")
    public void delete(@PathVariable("tableId") Long id){
        container.delete(id);
    }

    @PatchMapping(path = "{tableId}")
    public void update(
            @PathVariable("tableId") Long id,
            @RequestParam(required = false) Integer capacity){
        container.update(id, capacity);
    }
}
