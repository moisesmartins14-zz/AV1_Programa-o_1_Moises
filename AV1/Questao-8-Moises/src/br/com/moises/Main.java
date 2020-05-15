package br.com.moises;

import br.com.moises.model.ContaCorrente;
import br.com.moises.model.ContaPoupanca;

public class Main {

    public static void main(String[] args) {
        // criando a conta
        ContaCorrente minhaConta = new ContaCorrente(1234, "0001", 1200.00, "14/05/2020", "Moises", 200.0, 1200.0);
        ContaPoupanca conta2 = new ContaPoupanca(1235, "0001", 1200.00, "14/05/2020", "Marcos", 200.0, 1000);

        System.out.println(minhaConta.toString());
        System.out.println(conta2.toString());

    }
}