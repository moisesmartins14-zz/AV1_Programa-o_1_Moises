package br.com.moises.model;

import br.com.moises.interfaces.Tributavel;

public class ContaCorrente extends Conta implements Tributavel {

    private double taxaAdministracao;
    private double limite;

    public ContaCorrente(int numero, String agencia, double saldo, String abertura, String nome, double taxaAdministracao, Double limite) {
        super(nome, numero, agencia, saldo, abertura);
        this.taxaAdministracao = taxaAdministracao;
        this.limite = limite;
    }

    @Override
    public void sacar(double quantidade) {
        double novoSaldo = this.getSaldo() - quantidade;
        this.setSaldo(novoSaldo);
    }

    @Override
    public void depositar(double quantidade) {
        this.setSaldo(this.getSaldo() + quantidade);
    }

    @Override
    public void transfere(Conta destino, double valor) {
        if (valor < 0 || valor > this.getSaldo()) {
            System.out.println("Impossível concluir a transferência");
        } else {
            this.setSaldo(this.getSaldo() - valor);
            destino.setSaldo(destino.getSaldo() + valor);
        }
    }

    @Override
    public double getValorImposto() {
        return this.getSaldo() * 0.01;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "taxaAdministracao= " + taxaAdministracao +
                ", limite= " + limite +
                ", agencia= '" + agencia + '\'' +
                '}';
    }
}
