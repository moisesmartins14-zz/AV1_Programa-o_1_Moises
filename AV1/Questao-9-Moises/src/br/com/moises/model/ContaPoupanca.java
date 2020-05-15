package br.com.moises.model;

public class ContaPoupanca extends Conta {

    private double porcentagemRendimento;
    private int diaRendimento;

    public ContaPoupanca(int numero, String agencia, Double saldo, String abertura, String nome, double porcentagemRendimento, int diaRendimento) {
        super(nome, numero, agencia, saldo, abertura);
        this.porcentagemRendimento = porcentagemRendimento;
        this.diaRendimento = diaRendimento;
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
    public void transferir(Conta destino, double valor) {
        if (valor < 0 || valor > this.getSaldo()) {
            System.out.println("Impossível concluir a transferência");
        } else {
            this.setSaldo(this.getSaldo() - valor);
            destino.setSaldo(destino.getSaldo() + valor);
        }
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "porcentagemRendimento= " + porcentagemRendimento +
                ", diaRendimento= " + diaRendimento +
                ", agencia= '" + agencia + '\'' +
                '}';
    }
}