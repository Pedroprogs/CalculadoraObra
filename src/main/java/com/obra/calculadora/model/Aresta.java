package com.obra.calculadora.model;
public class Aresta {

    private double comprimento;
    private double altura;
    private double espessura;

    private boolean temJanela;
    private boolean temPorta;

    // getters e setters
    public double getComprimento() { return comprimento; }
    public void setComprimento(double comprimento) { this.comprimento = comprimento; }

    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; }

    public double getEspessura() { return espessura; }
    public void setEspessura(double espessura) { this.espessura = espessura; }
}