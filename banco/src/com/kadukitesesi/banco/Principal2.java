package com.kadukitesesi.banco;

public class Principal2 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Carlos Mendonça", 45);
        Pessoa pessoa2 = new Pessoa("Josefino Rarabraga", 67);

        CaixaEletronico caixaEletronico = new CaixaEletronico();

        ContaEspecial conta1 = new ContaEspecial(pessoa, 1234, 1456,  90);
        conta1.depositar(500.0);
        conta1.setLimiteChequeEspecial(3_000);
        conta1.extratoConta();
        ContaEspecial conta2 = new ContaEspecial(pessoa2,1890,12904,92);
        conta2.extratoConta();

        caixaEletronico.transferir(conta1,conta2,2_000);
        conta2.extratoConta();


    }
}
