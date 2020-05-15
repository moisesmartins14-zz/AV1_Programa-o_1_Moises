package br.com.moises;

import br.com.moises.model.Conta;

public class Main {

    public static void main(String[] args) {
        //criando duas contas
        Conta minhaConta = new Conta("Moises",1234, "0001", 1200.00, "11/06/2019");
        Conta conta2 = new Conta("Marcos",1235, "0001", 1200.00, "01/01/2020");

        conta2.transferir(minhaConta, 1000.0);

        System.out.println(minhaConta.toString());
        System.out.println(conta2.toString());
    }
}
