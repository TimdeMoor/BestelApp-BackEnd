package com.restaurantapp.RestaurantApp.Tafel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TafelContainer {
    private final TafelRepository repo;

    @Autowired
    public TafelContainer(TafelRepository tafelRepository) {
        this.repo = tafelRepository;
    }

    public List<Tafel> getAll() {
        return repo.findAll();
    }

    public void add(Tafel t) {
        repo.save(t);
    }

    public void delete(long id) {
        repo.deleteById(id);
    }

    @Transactional
    public void update(long id, int capacity){
        Tafel t = repo.getById(id);
        t.setCapacity(capacity);
    }
}
