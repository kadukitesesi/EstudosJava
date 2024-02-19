package com.kadukitesesi.banco;

public class Conta {
    private  int agencia;
    private int conta;
    private Pessoa pessoa;
    private double saldo;


    public Conta(Pessoa pessoa, int agencia, int conta) {
        this.pessoa = pessoa;
        this.agencia = agencia;
        this.conta = conta;
    }
    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if(valor <= 0) {
            throw new IllegalArgumentException("Valor do depósito deve ser maior que 0");
        }
        saldo += valor;
    }

    public int getAgencia() {
        return agencia;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public int getConta() {
        return conta;
    }

    protected void validarSaldoParaSaque(double valorSaque) {
        if (getSaldo() < valorSaque) {
            throw new RuntimeException("Saldo insuficiente para saque");
        }
    }

    public void sacar(double valor) {
        if(valor <= 0) {
            throw new IllegalArgumentException("Valor de depósito deve ser maior que 0");
        }
        validarSaldoParaSaque(valor);
        saldo -= valor;
    }

    public void extratoConta() {
        System.out.println("--------");
        System.out.printf("Agencia: %s%n", getAgencia());
        System.out.printf("Conta: %s%n", getConta());
        System.out.printf("Titular: %s%n", getPessoa().getNome());
        System.out.printf("Idade: %d%n", getPessoa().getIdade());
        System.out.printf("Saldo: %.2f %n", getSaldo());
    }


}
