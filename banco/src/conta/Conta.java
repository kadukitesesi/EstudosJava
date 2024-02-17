package conta;

public class Conta {
    private  String agencia;
    private String conta;
    private Pessoa pessoa;
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if(valor <= 0) {
            throw new IllegalArgumentException("Valor do depósito deve ser maior que 0");
        }
        saldo += valor;
    }


    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getAgencia() {
        return agencia;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public void extratoConta() {
        System.out.println("--------");
        System.out.printf("Agencia: %s%n", getAgencia());
        System.out.printf("Conta: %s%n", getConta());
        System.out.printf("Titular: %s%n", getPessoa().getNome());
        System.out.printf("Saldo: %.2f %n", getSaldo());
    }


}
