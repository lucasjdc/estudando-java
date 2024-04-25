package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.*;
import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        // Criando instâncias de filmes e séries
        Filme theTerminator1984 = new Filme("The Terminator", 1984);
        theTerminator1984.avalia(8);
        Filme starWars1977 = new Filme("Star Wars", 1977);
        starWars1977.avalia(9);
        Filme captainBlood1935 = new Filme("Captain Blood", 1935);
        captainBlood1935.avalia(8);
        Serie starTrek1966 = new Serie("Star Trek", 1966);
        var theFastAndTheFurious2001 = new Filme("The Fast and the Furious",2001);
        theFastAndTheFurious2001.avalia(9);

        // Criando a lista e adicionando os títulos
        List<Titulo> lista = new LinkedList<>();
        lista.add(theTerminator1984);
        lista.add(starWars1977);
        lista.add(captainBlood1935);
        lista.add(starTrek1966);
        lista.add(theFastAndTheFurious2001);

        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        // Ordenando a lista
        List<String> buscaPorArtista = new LinkedList<>();
        buscaPorArtista.add("Sylvester Stallone");
        buscaPorArtista.add("Christopher Lambert");
        buscaPorArtista.add("Jackie Chan");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtista);
        System.out.println("Lista de títulos ordenada");
        Collections.sort(lista);
        System.out.println(lista);

        // Ordenando a lista por ano de lançamento
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano");
        System.out.println(lista);
    }
}
