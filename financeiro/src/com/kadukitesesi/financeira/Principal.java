package com.kadukitesesi.financeira;

import com.kadukitesesi.financeira.modelo.Fazenda;
import com.kadukitesesi.financeira.modelo.Funcionario;
import com.kadukitesesi.financeira.modelo.Industria;
import com.kadukitesesi.financeira.modelo.ParceiroFinanceiro;
import com.kadukitesesi.financeira.servico.ServicoFinanciamento;
public class Principal {
    public static void main(String[] args) {
        var servicoFinanciamento = new ServicoFinanciamento();
        var fazenda = new Fazenda("Fazenda Dona Benedita", 5_000_000, 5);
        var industria = new Industria("Alimentos da Vovó", 900_000, true);
        var parceiro = new ParceiroFinanceiro("Capital ABC", 2_000_000);
        var funcionario = new Funcionario("João da Silva", 18_000);

        servicoFinanciamento.solicitarFinanciamento(funcionario, 90_000);
        servicoFinanciamento.solicitarFinanciamento(fazenda, 600_000);
        servicoFinanciamento.solicitarFinanciamento(industria, 500_000);
    }
}
