package com.obra.calculadora.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.obra.calculadora.model.Aresta;
import com.obra.calculadora.service.ConcretoService;

@RestController
@RequestMapping("/concreto")
public class ConcretoController {

    @Autowired
    private ConcretoService service;

    @PostMapping
    public double calcular(@RequestBody List<Aresta> arestas) {
        return service.calcularVolume(arestas, 0.3);
    }
}