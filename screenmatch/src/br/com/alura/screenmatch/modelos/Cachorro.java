package br.com.alura.screenmatch.modelos;

public class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("O cachorro latiu.");
    }

    public void abanarRabo() {
        System.out.println("O cachorro está abanando o rabo.");
    }
}
