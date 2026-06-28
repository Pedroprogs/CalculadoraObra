package com.obra.calculadora.controller;

import com.obra.calculadora.model.Aresta;
import com.obra.calculadora.model.Orcamento;
import com.obra.calculadora.service.ConcretoService;
import com.obra.calculadora.service.OrcamentoService;
import com.obra.calculadora.service.TijoloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/orcamento")
public class OrcamentoController {

    @Autowired
    private OrcamentoService orcamentoService;

    @Autowired
    private ConcretoService concretoService;

    @Autowired
    private TijoloService tijoloService;

    @PostMapping("/calcular")
    public Orcamento calcular(@RequestParam String nomeUsuario,
                              @RequestBody List<Aresta> arestas) {
        double volume = concretoService.calcularVolume(arestas, 0.3);
        double tijolos = tijoloService.calcularTijolos(arestas, 0.2, 0.1);
        return orcamentoService.salvar(nomeUsuario, volume, tijolos);
    }

    @GetMapping("/buscar/nome/{nomeUsuario}")
    public List<Orcamento> buscarPorNome(@PathVariable String nomeUsuario) {
        return orcamentoService.buscarPorNome(nomeUsuario);
    }

    @GetMapping("/buscar/numero/{numeroOrcamento}")
    public Optional<Orcamento> buscarPorNumero(@PathVariable String numeroOrcamento) {
        return orcamentoService.buscarPorNumero(numeroOrcamento);
    }
}