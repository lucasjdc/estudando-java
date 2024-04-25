package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme theTerminator1984 = new Filme("The Terminator", 1984);
        theTerminator1984.avalia(8);
        Filme starWars1977 = new Filme("Star Wars", 1977);
        starWars1977.avalia(9);
        Filme captainBlood1935 = new Filme("Captain Blood", 1935);
        captainBlood1935.avalia(8);
        Serie starTrek1966 = new Serie("Star Trek", 1966);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(theTerminator1984);
        lista.add(starWars1977);
        lista.add(captainBlood1935);
        lista.add(starTrek1966);

        for (Titulo item: lista) {
            System.out.println(item.getNome());
            Filme filme = (Filme) item;
            System.out.println("Classificação: " + filme.getClassificacao());
        }
    }
}
