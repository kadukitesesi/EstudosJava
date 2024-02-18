package com.kadukitesesi.banco;

public class ContaEspecial extends ContaInvestimento {
    private double tarifaMensal;
    private double limiteChequeEspecial;

    public double getTarifaMensal() {
        return tarifaMensal;
    }

    public void setTarifaMensal(double tarifaMensal) {
        this.tarifaMensal = tarifaMensal;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public void debitarTarifaMensal() {
        sacar(getTarifaMensal());
    }

    public double getSaldoDisponivel() {
        return getSaldo() + getLimiteChequeEspecial();
    }

    protected void validarSaldoParaSaque(double valorSaque) {
        if (getSaldoDisponivel() < valorSaque) {
            throw new RuntimeException("Saldo insuficiente para saque");
        }
    }

    public void extratoConta() {
        System.out.println("--------");
        System.out.printf("Agencia: %s%n", getAgencia());
        System.out.printf("Conta: %s%n", getConta());
        System.out.printf("Titular: %s%n", getPessoa().getNome());
        System.out.printf("Idade: %d%n", getPessoa().getIdade());
        System.out.printf("Saldo: %.2f%n",getSaldo());
        System.out.printf("Saldo disponivel: %.2f%n", getSaldoDisponivel());
    }

}
