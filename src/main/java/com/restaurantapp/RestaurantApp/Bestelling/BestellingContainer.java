package com.restaurantapp.RestaurantApp.Bestelling;

import com.restaurantapp.RestaurantApp.Dish.Dish;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.swing.border.AbstractBorder;
import java.util.List;

@Service
public class BestellingContainer {
    private final BestellingRepository repo;

    @Autowired
    public BestellingContainer(BestellingRepository repo){
        this.repo = repo;
    }

    public List<Bestelling> getAll(){
        return repo.findAll();
    }

    public void add(Bestelling o){
        repo.save(o);
    }

    public void delete(long id){
        repo.deleteById(id);
    }

    public List<Bestelling> getIncomplete(){
        return repo.getIncomplete();
    }

    public List<Dish> getOrderDishes(Long id){
        return null;
    }

    @Transactional
    public void complete(long id){
        Bestelling bestelling = repo.getById(id);
        bestelling.Complete();
    }
}
