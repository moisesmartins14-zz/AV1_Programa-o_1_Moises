package br.com.moises;

import br.com.moises.model.ContaCorrente;
import br.com.moises.model.ContaPoupanca;

public class Main {

    public static void main(String[] args) {
        // criando a conta
        ContaCorrente minhaConta = new ContaCorrente(1234, "0001", 1200.00, "11/06/2019", "Moises", 200.0, 1200.0);
        ContaPoupanca conta2  = new ContaPoupanca(1234, "0001", 1200.00, "01/01/2020", "Marcos", 200.0, 1000);

        System.out.println(minhaConta.toString());
        System.out.println(conta2.toString());

/*      Sacar: O valor solicitado deve ser superior a zero e igual ou menor que o saldo.
        Depositar: O valor do deposito não poder ser negativo ou igual a zero.
        Transferir: O valor para transferencia não pode ser negativo ou igual a zero, não deve ser maior do que o
        saldo da conta de origem, a conta de destino não pode ser a conta de origem.*/
    }
}
