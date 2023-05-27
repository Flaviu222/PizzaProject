package org.fasttrackit.project.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.fasttrackit.project.model.dto.PizzaDTO;
import org.fasttrackit.project.model.dto.PizzaMapper;
import org.fasttrackit.project.service.PizzaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("pizza")
@RequiredArgsConstructor
@Slf4j
public class PizzaController {
    private final PizzaService service;

    @GetMapping
    public List<PizzaDTO> getAll(){
        return service.getAll().stream()
                .map(PizzaMapper::toDto)
                .toList();
    }
}
