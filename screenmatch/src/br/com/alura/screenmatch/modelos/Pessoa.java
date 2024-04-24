package br.com.alura.screenmatch.modelos;

// Desafio: hora da prática
// 1 Crie uma classe Pessoa com atributos como nome, idade,
// e um método toString que representa esses atributos.
public class Pessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa {" +
                "nome = '" + nome + '\'' +
                ", idade = " + idade +
                '}';
    }
}
