package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.*;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

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

        // Criando a lista e adicionando os títulos
        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(theTerminator1984);
        lista.add(starWars1977);
        lista.add(captainBlood1935);
        lista.add(starTrek1966);

        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        // Testando a Classe Cachorro
        // Criando um objeto da classe Cachorro
        //Cachorro cachorro = new Cachorro();

        // Fazendo o casting para a classe Animal
        //Animal animal = (Animal) cachorro;
        Animal animal = new Gato();

        //animal.emitirSom();

        // Verificando se o objeto é um instância de Cachorro antes de fazer o casting

        if (animal instanceof Cachorro) {
            Cachorro cachorro = (Cachorro) animal;

            cachorro.emitirSom();
            cachorro.abanarRabo();
        } else {
            System.out.println("O objeto não é um cachorro");
        }

        // Criando uma lista de produtos
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Caneta", 1.50));
        produtos.add(new Produto("Caderno", 5.00));
        produtos.add(new Produto("Borracha", 0.80));

        // Calculando o preço médio dos produtos
        double somaPrecos = 0;
        for (Produto produto: produtos) {
            somaPrecos += produto.getPreco();
        }

        double precoMedio = somaPrecos / produtos.size();

        // Formatando o preço médio com duas casas decimais
        DecimalFormat df = new DecimalFormat("0.00");
        String precoMedioFormatado = df.format(precoMedio);

        // Impriminto o preço médio dos produtos formatado
        System.out.println("Preço médio dos produtos: R$ " + precoMedioFormatado);
    }
}
