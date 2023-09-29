package br.com.alura.screenmatch.modelos;

import java.util.ArrayList;

public class Filme {
    public String nome;
    public ArrayList<String > genero  = new ArrayList<String>();
    public String direcao;
    public int anoDeLancamento;
    public boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    double mediaDasAvaliacoes;
    public int duracaoEmMinutos;

    public void  exibeFichaTecnica(){
        System.out.println("Nome: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Gênero: " + genero);
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia(){
        mediaDasAvaliacoes = somaDasAvaliacoes / totalDeAvaliacoes;
        return Math.round(mediaDasAvaliacoes);
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }
}
