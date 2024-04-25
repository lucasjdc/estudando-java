package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Forma;

// Classe Quadrado implementando a interface Forma
public class Quadrado implements Forma {
    private double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
