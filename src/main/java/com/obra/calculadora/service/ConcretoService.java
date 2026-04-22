package com.obra.calculadora.service;
import org.springframework.stereotype.Service;
import java.util.List;
import com.obra.calculadora.model.Aresta;

@Service
public class ConcretoService {

    public double calcularVolume(List<Aresta> arestas, double altura) {
        double total = 0;

        for (Aresta a : arestas) {
            total += a.getComprimento() * a.getEspessura() * altura;
        }

        return total;
    }
}