package br.com.moises;

import br.com.moises.model.Conta;

public class Main {

    public static void main(String[] args) {
        // criar conta
        Conta minhaConta = new Conta("Moises",1234, "0001", 1045.00, "11/06/2019");
        // sacando 150 reais
        minhaConta.sacar(150);
        // depositando 500 reais
        minhaConta.deposita(500);
        System.out.println(minhaConta.getSaldo());
    }
}
