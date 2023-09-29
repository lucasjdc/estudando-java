package br.com.alura.screenmatch.modelos;

import java.util.ArrayList;

public class Filme {
    private String nome;
    private String direcao;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private double mediaDasAvaliacoes;
    private int duracaoEmMinutos;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDirecao(String direcao) {
        this.direcao = direcao;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void  exibeFichaTecnica(){
        System.out.println("Nome: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
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
