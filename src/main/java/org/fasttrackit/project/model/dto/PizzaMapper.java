package org.fasttrackit.project.model.dto;

import org.fasttrackit.project.model.Pizza;
import org.hibernate.annotations.Comment;
import org.springframework.stereotype.Component;

@Component
public class PizzaMapper {
    public static PizzaDTO toDto(Pizza entity){
        return PizzaDTO.builder()
                .id(entity.getId())
                .name(entity.getName())
                .description(entity.getDescription())
                .price(entity.getPrice())
                .tableOf(entity.getTableOf())
                .build();
    }

    public static Pizza toEntity(PizzaDTO pizzaDTO){
        return Pizza.builder()
                .id(pizzaDTO.id())
                .name(pizzaDTO.name())
                .description(pizzaDTO.description())
                .price(pizzaDTO.price())
                .tableOf(pizzaDTO.tableOf())
                .build();
    }
}
