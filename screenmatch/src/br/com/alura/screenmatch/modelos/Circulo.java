package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Forma;

// Classe Circulo implementando a interface Forma
public class Circulo implements Forma {
    private double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }


}
