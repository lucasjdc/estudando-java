package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.Forma;
import br.com.alura.screenmatch.modelos.ContaBancaria;
import br.com.alura.screenmatch.modelos.Quadrado;
import br.com.alura.screenmatch.modelos.Circulo;

import java.util.ArrayList;
import java.util.List;

// Classe Teste para calcular e imprimir a área de cada forma
public class Teste {
    public static void main(String[] args) {
        // Criando uma lista de formas
        List<Forma> areas = new ArrayList<>();
        areas.add(new Circulo(5.0));
        areas.add(new Quadrado(2.0));

        // Calculando e imprimindo a área de cada forma
        for (Forma forma: areas) {
            System.out.println("Área da figura: " + forma.calcularArea());
        }

        List<ContaBancaria> contas = new ArrayList<>();
        contas.add(new ContaBancaria("001", 1000.0));
        contas.add(new ContaBancaria("002",1500.0));
        contas.add(new ContaBancaria("003",2000.0));
        contas.add(new ContaBancaria("004",500.0));

        // Encontrando a conta com o mairo saldo
        ContaBancaria maiorSaldo = contas.get(0);
        for (ContaBancaria conta : contas) {
            if (conta.getSaldo() > maiorSaldo.getSaldo()) {
                maiorSaldo = conta;
            }
        }

        // Imprimindo a conta com o maior saldo
        System.out.println("A conta com o maior saldo é: " + maiorSaldo.getNumeroConta() + " com saldo de R$ " + maiorSaldo.getSaldo());
    }
}
