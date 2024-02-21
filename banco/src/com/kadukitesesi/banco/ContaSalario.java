package com.kadukitesesi.banco;

public class ContaSalario extends Conta {
    private double salarioMensal;

    public ContaSalario(Pessoa pessoa, int agencia, int conta, double salarioMensal) {
        super(pessoa, agencia, conta);
        this.salarioMensal = salarioMensal;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }
}
