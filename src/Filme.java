import java.util.ArrayList;

public class Filme {
    String nome;
    ArrayList<String > genero  = new ArrayList<String>();
    String direcao;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    double mediaDasAvaliacoes;
    int duracaoEmMinutos;

    void  exibeFichaTecnica(){
        System.out.println("Nome: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Gênero: " + genero);
    }

    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double pegaMedia(){
        mediaDasAvaliacoes = somaDasAvaliacoes / totalDeAvaliacoes;
        return Math.round(mediaDasAvaliacoes);
    }

    int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }
}
