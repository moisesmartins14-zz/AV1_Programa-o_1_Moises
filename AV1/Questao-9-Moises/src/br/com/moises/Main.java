package br.com.moises;

import br.com.moises.model.ContaCorrente;
import br.com.moises.model.ContaPoupanca;

public class Main {

    public static void main(String[] args) {
        try {
            ContaCorrente minhaConta = new ContaCorrente(1, "250-x", 1200.00, "14/05/2020", "Jardiano", 200.0, 1200.0);
            ContaPoupanca meuSonho = new ContaPoupanca(1, "250-x", 1200.00, "14/05/2020", "Jardiano II", 200.0, 1000);

            System.out.println(minhaConta.toString());
            System.out.println(meuSonho.toString());

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }
    }
}
