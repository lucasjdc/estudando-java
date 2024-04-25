package br.com.alura.screenmatch.modelos;

// 6. Crie uma classe ContaBancaria com propriedades como número da conta e saldo.
// Em seguida, crie uma lista de contas bancárias com diferentes saldos. Utilize
// um loop para encontrar e imprimir a conta com o maior saldo.
public class ContaBancaria {
    private String numeroConta;
    private double saldo;

    public ContaBancaria(String numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }
}
