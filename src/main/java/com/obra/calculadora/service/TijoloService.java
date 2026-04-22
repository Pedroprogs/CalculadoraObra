package com.obra.calculadora.service;
import org.springframework.stereotype.Service;
import java.util.List;
import com.obra.calculadora.model.Aresta;

@Service
public class TijoloService {

    public double calcularTijolos(List<Aresta> arestas, double alturaTijolo, double larguraTijolo) {
        double total = 0;

        for (Aresta a : arestas) {

            double areaParede = a.getComprimento() * a.getAltura();

            double areaTijolo = alturaTijolo * larguraTijolo;

            total += areaParede / areaTijolo;
        }

        return total;
    }
}