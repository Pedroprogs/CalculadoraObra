package com.obra.calculadora.service;

import com.obra.calculadora.model.Orcamento;
import com.obra.calculadora.repository.OrcamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class OrcamentoService {

    @Autowired
    private OrcamentoRepository repository;

    public Orcamento salvar(String nomeUsuario, double volumeConcreto, double quantidadeTijolos) {
        Orcamento o = new Orcamento();
        o.setNomeUsuario(nomeUsuario);
        o.setNumeroOrcamento(UUID.randomUUID().toString().substring(0, 8).toUpperCase());
        o.setVolumeConcreto(volumeConcreto);
        o.setQuantidadeTijolos(quantidadeTijolos);
        o.setDataCriacao(LocalDateTime.now());
        return repository.save(o);
    }

    public List<Orcamento> buscarPorNome(String nomeUsuario) {
        return repository.findByNomeUsuario(nomeUsuario);
    }

    public Optional<Orcamento> buscarPorNumero(String numeroOrcamento) {
        return repository.findByNumeroOrcamento(numeroOrcamento);
    }
}