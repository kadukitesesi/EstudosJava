package com.kadukitesesi.cartaobeneficio.servico;

import com.kadukitesesi.cartaobeneficio.Cartao;
import com.kadukitesesi.cartaobeneficio.Estabelecimento;
import com.kadukitesesi.cartaobeneficio.Recibo;
public class ServicoDePagamentoOnline {
    public Recibo efetuarPagamento(Estabelecimento estabelecimento,
                                   Cartao cartao, double valor) {
        cartao.debitar(valor);

        // TODO realiza outras lógicas para efetuar o pagamento ao estabelecimento

        return new Recibo(cartao.obterTitular(), "Pagamento", valor);
    }
}
