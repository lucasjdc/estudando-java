import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.*;

import java.util.ArrayList;
import java.util.Date;

public class Principal {
    public static void main(String[] args) {
        var meuFilme = new Filme("Rambo: First Blood", 1982);
        meuFilme.setDuracaoEmMinutos(97);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("Média das avaliações: " + meuFilme.pegaMedia());

        Serie lost = new Serie("Lost", 2004);
        lost.setTemporadas(6);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEspisodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

        lost.exibeFichaTecnica();

        var outroFilme = new Filme("Rambo: Firs Blood Part II",1985);
        outroFilme.setDuracaoEmMinutos(94);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);

        filtro.filtra(episodio);

        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.setDuracaoEmMinutos(177);
        filmeDoPaulo.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);

        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println("toString filme " + listaDeFilmes.get(0).toString());
        System.out.println(listaDeFilmes.stream().toList());

        // 1. Crie uma classe Produto com atributos como nome, preço, e quantidade. Em
        // seguida, crie uma lista de objetos Produto utilizando a classe ArrayList. Adicione
        // alguns produtos, imprima o tamanho da lista e recupere um produto pelo índice.

        ArrayList<Produto> listaProdutos = new ArrayList<>();
        listaProdutos.add(new Produto("Caderno", 14,30));
        listaProdutos.add(new Produto("Ventilador", 139.99, 10));
        listaProdutos.add(new Produto("Caneta", 1.99, 150));

        // Exibir o tamanho da lista
        System.out.println("Quantidade de Produtos: " + listaProdutos.size());

        // Visualizando o primeiro produto
        System.out.println("Primeiro protudo da lista: " + listaProdutos.get(1).getNomeDoProduto());

        // Visualizando os produtos cadastrados na lista.
        System.out.println(listaProdutos.stream().toList());

        // Crie um objeto ProdutoPerecivel

        ArrayList<ProdutoPerecivel> listaDePereciveis = new ArrayList<>();
        listaDePereciveis.add(new ProdutoPerecivel("Queijo", 48.43,20, new Date(2024,06,24)));

        // imprima o produto perecivel cadastrado
        System.out.println(listaDePereciveis.stream().toList());
    }
}