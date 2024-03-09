package com.kadukitesesi.agencia;

import java.util.*;

public class CadastroPacoteViagem {

    private final List<PacoteViagem> pacotes = new LinkedList<>();

    public void adicionar(String descricao, double precoDiaria) {
        PacoteViagem pacote = new PacoteViagem(descricao, precoDiaria);

        if (pacotes.contains(pacote)) {
            throw new PacoteDuplicadoException("Pacote de viagem com esta descrição já foi adicionado");
        }

        pacotes.add(pacote);
    }

    public List<PacoteViagem> obterTodos() {

        return pacotes;
    }

    public void ordenar() {
        Collections.sort(pacotes);
    }

    public void ordenarPorPrecoDecrescente() {
        pacotes.sort(new PrecoPacoteViagemComparator().reversed());
    }

    public PacoteViagem removerPorDescricao(String descricao) {
        boolean removido = false;
        Iterator<PacoteViagem> pacotesIterator = pacotes.iterator();

        String descricao1 = descricao;
        while (pacotesIterator.hasNext()) {
            PacoteViagem pacote = pacotesIterator.next();
            if (pacote.getDescricao().equals(descricao1)) {
                pacotesIterator.remove();
                removido = true;
            }

            if (!removido) {
                throw new PacoteNaoEncontradoException("Pacote de viagem não encontrado com descrição");
            }
    }

    public PacoteViagem buscarPorDescricao(String descricao1) {
            for (PacoteViagem pacote : pacotes) {
                if (pacote.getDescricao().equals(descricao1)) {
                    return pacote;
                }
            }

            throw new PacoteNaoEncontradoException("Pacote de viagem não encontrado");
        }
    }

}