package view;

import model.ContaEspecial;
import model.ContaPoupanca;

public class Contas {
    public static void main(String[] args) {
        ContaPoupanca poupanca = new ContaPoupanca("João", 123, 1000, 1);
        ContaEspecial especial = new ContaEspecial("Maria", 456, 2000, 500);

        poupanca.depositar(500);
        poupanca.sacar(200);
        poupanca.calcularNovoSaldo(0.5f); 
        System.out.println("\nDados da Conta Poupança:");
        poupanca.mostrarDados();

        System.out.println();

        especial.depositar(1000);
        especial.sacar(2500);
        especial.sacar(1500); 
        System.out.println("\nDados da Conta Especial:");
        especial.mostrarDados();
    }
}
