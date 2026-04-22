package com.obra.calculadora.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.obra.calculadora.model.Aresta;
import com.obra.calculadora.service.TijoloService;

@RestController
@RequestMapping("/tijolos")
public class TijoloController {

    @Autowired
    private TijoloService service;

    @PostMapping
    public double calcular(@RequestBody List<Aresta> arestas) {
        return service.calcularTijolos(arestas, 0.2, 0.1);
    }
}