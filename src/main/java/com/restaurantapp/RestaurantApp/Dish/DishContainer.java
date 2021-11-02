package com.restaurantapp.RestaurantApp.Dish;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DishContainer {
    //TODO: Add Logic checks
    //TODO: Fix GetSingle

    private final DishRepository repo;

    @Autowired
    public DishContainer(DishRepository dishRepository){
        this.repo = dishRepository;
    }

    public List<Dish> getAll(){
        return repo.findAll();
    }

    //public Dish getSingle(Long id){
    //    return repo.getById(id);
    //}

    public void add(Dish dish) {
        repo.save(dish);
    }

    public void delete(long id) {
        repo.deleteById(id);
    }

    @Transactional
    public void update(long id, String name, Double price) {
        Dish dish = repo.getById(id);
        dish.setName(name);
        dish.setPrice(price);
    }
}
