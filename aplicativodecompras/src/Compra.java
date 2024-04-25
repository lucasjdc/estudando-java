import java.util.*;

class Compra {
    private String descricao;
    private double valor;

    public Compra(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }
}

class GerenciadorCompras {
    private double limiteCartao;
    private List<Compra> compras;

    public GerenciadorCompras(double limiteCartao) {
        this.limiteCartao = limiteCartao;
        this.compras = new ArrayList<>();
    }

    public void cadastrarCompra(String descricao, double valor) {
        if (valor > limiteCartao) {
            System.out.println("Saldo insuficiente para realizar a compra.");
            return;
        }

        Compra novaCompra = new Compra(descricao, valor);
        compras.add(novaCompra);
        limiteCartao -= valor;
        System.out.println("Compra realizada com sucesso!");
    }

    public void calcularSaldo() {
        System.out.printf("Saldo disponível: R$%.2f\n", limiteCartao);
    }

    public void exibirComprasOrdenadas() {
        Collections.sort(compras, Comparator.comparingDouble(Compra::getValor));

        System.out.println("\nCOMPRAS REALIZADAS:");
        for (Compra compra : compras) {
            System.out.printf("%s - R$%.2f\n", compra.getDescricao(), compra.getValor());
        }
    }

    public void iniciarMenu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Cadastrar compra");
            System.out.println("2. Exibir compras");
            System.out.println("3. Calcular saldo");
            System.out.println("0. Sair");

            System.out.print("Digite sua opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a descrição da compra: ");
                    String descricaoCompra = scanner.next();
                    System.out.print("Digite o valor da compra: ");
                    double valorCompra = scanner.nextDouble();
                    cadastrarCompra(descricaoCompra, valorCompra);
                    break;
                case 2:
                    exibirComprasOrdenadas();
                    break;
                case 3:
                    calcularSaldo();
                    break;
                case 0:
                    System.out.println("Saindo da aplicação...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
