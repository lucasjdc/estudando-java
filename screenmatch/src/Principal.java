import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Pessoa;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Rambo: First Blood");
        meuFilme.setAnoDeLancamento(1982);
        meuFilme.setDuracaoEmMinutos(97);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("Média das avaliações: " + meuFilme.pegaMedia());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2004);
        lost.setTemporadas(6);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEspisodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

        lost.exibeFichaTecnica();

        Filme outroFilme = new Filme();
        outroFilme.setNome("Rambo: Firs Blood Part II");
        outroFilme.setAnoDeLancamento(1985);
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

        var filmeDoPaulo = new Filme();
        filmeDoPaulo.setNome("Dogville");
        filmeDoPaulo.setAnoDeLancamento(2003);
        filmeDoPaulo.setDuracaoEmMinutos(177);
        filmeDoPaulo.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);

        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println("toString filme " + listaDeFilmes.get(0).toString());

        // Desafio: hora da prática
        // 2. No método main da classe Principal, crie um ArrayList de Pessoa
        // chamado listaDePessoas
        var listaDePessoas = new ArrayList<>();

        // 3. Adicione pelo menos três pessoas à lista utilizando o método add.
        var pessoa1 = new Pessoa();
        pessoa1.setNome("José");
        pessoa1.setIdade(40);
        var pessoa2 = new Pessoa();
        pessoa2.setNome("Paulo");
        pessoa2.setIdade(41);
        var pessoa3 = new Pessoa();
        pessoa3.setNome("João");
        pessoa3.setIdade(39);
        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        // 4. Imprima o tamanho da lista utilizando o método size.
        System.out.println("Tamanho da lista: " + listaDePessoas.size());

        // 5. Imprima a primeira pessoa da lista utilizando o método get.
        //System.out.println("Primeira pessoa: " + listaDePessoas.get(0).toString());

        // 6. Imprima a lista completa
        for (int i = 0; i < listaDePessoas.size(); i++) {
            System.out.println("- " + listaDePessoas.get(i).toString());
        }
    }
}
