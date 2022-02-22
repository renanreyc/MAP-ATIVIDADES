package main;

import main.entidades.Escala;
import main.entidades.Filme;
import main.entidades.Funcionario;
import main.funcoes.Funcao;
import main.funcoes.ListaFuncoes;
import main.servicos.EscalaServico;
import main.servicos.FilmeServico;
import main.servicos.FuncionarioServico;

import java.util.List;

public class GloboFilmes {


    private final FilmeServico filmeServico;
    private final FuncionarioServico funcionarioServico;
    private final EscalaServico escalaServico;



    public GloboFilmes() {

        this.filmeServico = new FilmeServico();
        this.funcionarioServico = new FuncionarioServico();
        this.escalaServico = new EscalaServico();
    }

    public Filme createFilme(String nome, String ano) {
        Filme filme = new Filme(nome, ano);
        return this.filmeServico.save(filme);
    }

    public Funcionario createFuncionario(String nome) {
        Funcionario funcionario = new Funcionario(nome);
        return this.funcionarioServico.save(funcionario);
    }

    public Escala createEscala(Funcionario funcionario, Filme filme, ListaFuncoes...funcoes) {

        Escala escala = new Escala(funcionario, filme);
        for (ListaFuncoes funcao : funcoes) {
            escala.addFuncao(new Funcao(funcao.getNome()));
        }

        // set relationships
        funcionario.addEscala(escala);
        filme.addEscala(escala);

        return this.escalaServico.save(escala);
    }

    public String listAllFilmesComEscalas() {
        StringBuilder builder = new StringBuilder();

        for (Filme filme : this.filmeServico.getAll()) {

            builder.append("\n");
            builder.append("=================== Filme - " + filme.getNome() + " - Ano - " + filme.getAno() + " ===========================");

            for (Escala escala: filme.getEscalas()) {
                builder.append(escala.getListaDeFuncoes());
            }

            builder.append("\n");
        }

        return builder.toString();
    }

    public String listFilmografiaByFuncionarioAndFuncao(String nome, ListaFuncoes funcao) {

        StringBuilder builder = new StringBuilder();

        builder.append("=========== Filmografia do Funcionario: " + nome + " na Função: " + funcao.getNome());

        List<Escala> escalas = this.escalaServico.findByFuncionarioAndFuncao(nome, funcao.getNome());

        if (escalas.isEmpty()) {
            builder.append("\n");
            builder.append("Não encontrado filmes para esse funcionario nesta função!");
        }
        else {
            escalas.forEach(escala -> builder.append(escala.getListaDeFuncoes()));
        }

        builder.append("\n");
        return builder.toString();
    }
}
