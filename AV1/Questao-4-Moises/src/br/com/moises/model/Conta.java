package br.com.moises.model;

public class Conta {
    private String nome;
    private int numeroConta;
     String agencia;
    private double saldo;
    private String data_abertura;

    public Conta(String nome, int numeroConta, String agencia, double saldo, String data_abertura) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.saldo = saldo;
        this.data_abertura = data_abertura;
    }

    public void sacar(double quantidade) {
        double novoSaldo = this.saldo - quantidade;
        this.saldo = novoSaldo;
    }

    public void depositar(double quantidade) {
        this.saldo += quantidade;
    }

    public void transferir(Conta destino, double valor) {
        if (valor < 0 || valor > this.saldo) {
            System.out.println("Impossível concluir a transferência");
        } else {
            this.saldo = this.saldo - valor;
            destino.saldo = destino.saldo + valor;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getData_abertura() {
        return data_abertura;
    }

    public void setData_abertura(String data_abertura) {
        this.data_abertura = data_abertura;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "nome= '" + nome + '\'' +
                ", numero= " + numeroConta +
                ", agencia= '" + agencia + '\'' +
                ", saldo= " + saldo +
                ", data_abertura= '" + data_abertura + '\'' +
                '}';
    }
}
