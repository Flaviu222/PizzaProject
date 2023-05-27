package org.fasttrackit.project.service;

import org.fasttrackit.project.model.Pizza;
import org.fasttrackit.project.repository.PizzaRepository;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class PizzaService {
    private final PizzaRepository repository;

    public PizzaService(PizzaRepository repository) {
        this.repository = repository;
    }

    public void addPizza(List<Pizza> pizzas){
        repository.saveAll(pizzas);
    }
    public List<Pizza> getAll() {
        return repository.findAll();
    }
}
