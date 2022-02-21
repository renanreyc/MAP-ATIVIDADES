package main.servicos;

import main.entidades.Escala;

import java.util.ArrayList;
import java.util.List;

public class EscalaServico extends BaseServico<Escala> {

    public List<Escala> findByFuncionarioAndFuncao(String nome, String funcao) {

        List<Escala> escalas = new ArrayList<>();

        for (Escala escala : this.getAll()) {

            if (escala.getFuncionario().getNome().equals(nome) && escala.possuiFuncao(funcao))
                escalas.add(escala);
        }

        return escalas;
    }
}
