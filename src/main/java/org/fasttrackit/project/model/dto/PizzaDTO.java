package org.fasttrackit.project.model.dto;

import lombok.Builder;
import org.fasttrackit.project.model.TablePizza;

@Builder
public record PizzaDTO (
        Integer id,
        String name,
        String description,
        Integer price,
        TablePizza tableOf

){
}
