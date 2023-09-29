import br.com.alura.screenmatch.modelos.Filme;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Principal {
    public static void main(String[] args) {
        Filme rambo1 = new Filme();
        rambo1.setNome("Rambo: First Blood");
        rambo1.setDirecao("Ted Kotcheff");
        rambo1.setIncluidoNoPlano(true);
        rambo1.setAnoDeLancamento(1982);
        rambo1.setDuracaoEmMinutos(97);
        rambo1.exibeFichaTecnica();
        rambo1.avalia(8);
        rambo1.avalia(9);
        System.out.println(arredondar(rambo1.pegaMedia()));
        System.out.println("Número de avaliações: " + rambo1.getTotalDeAvaliacoes());
    }

    private static String arredondar(double media) {
        DecimalFormat df = new DecimalFormat("0.00");
        df.setRoundingMode(RoundingMode.UP);
        return df.format(media);
    }
}
