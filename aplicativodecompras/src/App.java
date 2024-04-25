import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o limite do cartão: ");
        double limiteCartao = scanner.nextDouble();

        GerenciadorCompras gerenciadorCompras = new GerenciadorCompras(limiteCartao);
        gerenciadorCompras.iniciarMenu();

        scanner.close();
    }
}

