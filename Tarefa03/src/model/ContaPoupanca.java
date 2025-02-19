package model;

public class ContaPoupanca extends ContaBancaria {
    private int diaRendimento;

    public ContaPoupanca(String cliente, int num_conta, float saldo, int diaRendimento) {
        super(cliente, num_conta, saldo);
        this.diaRendimento = diaRendimento;
    }

    public void calcularNovoSaldo(float taxaRendimento) {
        float rendimento = saldo * (taxaRendimento / 100);
        saldo += rendimento;
        System.out.println("Rendimento de R$" + rendimento + " aplicado. Novo saldo: R$" + saldo);
    }
}
