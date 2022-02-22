package main;

import main.entidades.Escala;
import main.entidades.Filme;
import main.entidades.Funcionario;
import main.funcoes.Funcao;
import main.funcoes.ListaFuncoes;
import main.servicos.EscalaServico;
import main.servicos.FilmeServico;
import main.servicos.FuncionarioServico;

public class Aplicacao {

    public static void main (String[] args) {

        GloboFilmes globoFilmes = new GloboFilmes();

        Filme filme1 = globoFilmes.createFilme("Era Uma Vez No Espaço", "2003");

        Funcionario funcionario1 = globoFilmes.createFuncionario("Renan");
        Funcionario funcionario2 = globoFilmes.createFuncionario("Eliseu");
        Funcionario funcionario3 = globoFilmes.createFuncionario("Sabrina");
        Funcionario funcionario4 = globoFilmes.createFuncionario("Britney");
        Funcionario funcionario5 = globoFilmes.createFuncionario("Luan");
        Funcionario funcionario6 = globoFilmes.createFuncionario("Carlos");

        Escala escala1 = globoFilmes.createEscala(funcionario1, filme1, ListaFuncoes.DIRETOR, ListaFuncoes.PRODUTOR);
        Escala escala2 = globoFilmes.createEscala(funcionario2, filme1, ListaFuncoes.CINEGRAFISTA);
        Escala escala3 = globoFilmes.createEscala(funcionario3, filme1, ListaFuncoes.ELENCO, ListaFuncoes.PRODUTOR);
        Escala escala4 = globoFilmes.createEscala(funcionario4, filme1, ListaFuncoes.ROTEIRISTA, ListaFuncoes.ATOR);
        Escala escala5 = globoFilmes.createEscala(funcionario5, filme1, ListaFuncoes.TRILHASONORA);

        Filme filme2 = globoFilmes.createFilme("2001 - Uma Odisseia no Espaco", "2020");
        Escala escala6 = globoFilmes.createEscala(funcionario1, filme2, ListaFuncoes.ROTEIRISTA, ListaFuncoes.ATOR);
        Escala escala7 = globoFilmes.createEscala(funcionario2, filme2, ListaFuncoes.DIRETOR);
        Escala escala8 = globoFilmes.createEscala(funcionario3, filme2, ListaFuncoes.ATOR);
        Escala escala9 = globoFilmes.createEscala(funcionario4, filme2, ListaFuncoes.ROTEIRISTA, ListaFuncoes.ATOR, ListaFuncoes.ELENCO);
        Escala escala10 = globoFilmes.createEscala(funcionario5, filme2, ListaFuncoes.CINEGRAFISTA);
        Escala escala11 = globoFilmes.createEscala(funcionario6, filme2, ListaFuncoes.CAMERA);

        System.out.println(globoFilmes.listAllFilmesComEscalas());

        System.out.println(globoFilmes.listFilmografiaByFuncionarioAndFuncao(funcionario1.getNome(), ListaFuncoes.DIRETOR));
        System.out.println(globoFilmes.listFilmografiaByFuncionarioAndFuncao(funcionario1.getNome(), ListaFuncoes.TRILHASONORA));
        System.out.println(globoFilmes.listFilmografiaByFuncionarioAndFuncao(funcionario4.getNome(), ListaFuncoes.ATOR));
    }
}