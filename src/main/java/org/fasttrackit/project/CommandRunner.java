package org.fasttrackit.project;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.fasttrackit.project.model.Pizza;
import org.fasttrackit.project.model.TablePizza;
import org.fasttrackit.project.service.PizzaService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
@RequiredArgsConstructor
@Slf4j
public class CommandRunner implements CommandLineRunner {
    private final PizzaService pizzaService;
    @Override
    public void run(String... args) throws Exception {

        log.info("Runner is populating with data");

        pizzaService.addPizza(List.of(
                Pizza.builder()
                        .name("Diavola")
                        .description("sos de rosii, mozzarella, salam picant")
                        .price(33)
                        .tableOf(TablePizza.builder()
                                .tableNumber(1)
                                .build())
                        .build(),
                Pizza.builder()
                        .name("prosciutto crudo")
                        .description("sos de rosii,mozzarella, prosciutto crudo, ")
                        .price(35)
                        .tableOf(TablePizza.builder()
                                .tableNumber(2)
                                .build())
                        .build()
        ));

    }
}




