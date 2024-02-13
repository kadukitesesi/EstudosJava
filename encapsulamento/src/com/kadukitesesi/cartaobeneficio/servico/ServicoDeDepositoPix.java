package com.kadukitesesi.cartaobeneficio.servico;

import com.kadukitesesi.cartaobeneficio.Cartao;
import com.kadukitesesi.cartaobeneficio.Recibo;

public class ServicoDeDepositoPix {


    public Recibo efetuarDeposito(Cartao cartao, double valorDeposito) {
        // TODO faz cobrança do valor no Pix

        cartao.depositar(valorDeposito);

        return new Recibo(cartao.obterTitular(), "Depósito", valorDeposito);
    }
}
