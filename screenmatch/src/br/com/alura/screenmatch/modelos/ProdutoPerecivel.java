// Crie uma classe ProdutoPerecivel que herde de Produto. Adicione um atributo dataValidade e um construtor que
// utilize o construtor da classe mãe (super) para inicializar os atributos herdados. Crie um objeto ProdutoPerecivel
// e imprima seus valores.

package br.com.alura.screenmatch.modelos;

import java.util.Date;

public class ProdutoPerecivel extends Produto {
    private Date dataValidade;

    public ProdutoPerecivel(String nome, double preco, int quantidade, Date validade) {
        super(nome, preco, quantidade);
        this.dataValidade = validade;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    @Override
    public String toString() {
        return "Produto: " + getNomeDoProduto() + " | preco: R$ " + getPrecoDoProduto() + " | quantidade: " + getQuantidadeDoProduto() + " unidades | validade: " + getDataValidade();
    }
}
