package br.com.alura.screenmatch.modelos;

// 1. Crie uma classe Produto com atributos como nome, preço, e quantidade. Em
// seguida, crie uma lista de objetos Produto utilizando a classe ArrayList. Adicione
// alguns produtos, imprima o tamanho da lista e recupere um produto pelo índice.
public class Produto {
    private String nomeDoProduto;
    private double precoDoProduto;
    private int quantidadeDoProduto;

    public Produto(String nome, double preco, int quantidade) {
        this.nomeDoProduto = nome;
        this.precoDoProduto = preco;
        this.quantidadeDoProduto = quantidade;
    }

    public String getNomeDoProduto() {
        return this.nomeDoProduto;
    }

    // 2. Implemente o método toString() na classe Produto para retornar uma
    // representação em texto do objeto. Em seguida, imprima a lista de produtos
    // utilizando o método System.out.println().

    // Criando os getters

    public double getPrecoDoProduto() {
        return precoDoProduto;
    }

    public int getQuantidadeDoProduto() {
        return quantidadeDoProduto;
    }

    // Reescrevendo o método toString().

    @Override
    public String toString() {
        return "Produto{" +
                "nome: '" + nomeDoProduto + '\'' +
                ", preco: " + precoDoProduto +
                ", quantidade do produto em estoque:" + quantidadeDoProduto +
                '}';
    }
}
