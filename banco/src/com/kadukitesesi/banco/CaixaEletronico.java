package com.kadukitesesi.banco;

public class CaixaEletronico {

    public static final double TAXA_TRANSFERENCIA = 10;

    public void transferir(ContaEspecial contaOrigem, ContaEspecial contaDestino, double valorTransferencia) {
        System.out.printf("Transferindo R$%.2f da conta %d / %d para %d / %d%n",valorTransferencia, contaOrigem.getConta()
                ,contaOrigem.getAgencia(),contaDestino.getConta(),contaDestino.getAgencia());

        contaOrigem.sacar(valorTransferencia + TAXA_TRANSFERENCIA);

        contaDestino.depositar(valorTransferencia);
    }


}
