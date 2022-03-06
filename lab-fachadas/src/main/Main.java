package main;

import main.entities.*;
import main.enums.Compromissos;
import main.enums.Proficiencias;
import main.enums.Setores;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        SIG sistema = new SIG();

        Aluno aluno = sistema.registrarAluno("Filipe");
        Professor professor = sistema.registrarProfessor("Antonio", Proficiencias.MATEMATICA, 1500);
        Disciplina disciplina = sistema.criarDisciplina("Matematica Discreta", Proficiencias.MATEMATICA);
        Sala sala = sistema.criarSala("C201");
        Item item = sistema.adicionarItemAoEstoque("Lapis", 40);
        Compromisso compromisso = sistema.agendarCompromisso(new Date(), Setores.Diretoria, Compromissos.REUNIAO);
        Pedido pedido = sistema.realizarPedido("Papel", 20, 50);
        sistema.alocarProfessorDisponivelPorDisciplina(sala, disciplina);
        sistema.matricularNaDisciplina(sala, aluno);
        sistema.finalizarSemestre(aluno);

        print("\nBalanco Geral: " + sistema.gerarBalancoCompleto());
        print("\nFolha de Pagamento: ");
        sistema.gerarFolhaDePagamento().forEach(e -> print("Nome: " + e.getNome() + ", Tipo: " + e.getTipo() + " Credor: " + e.getCredor() + ", Valor: " + e.getValor()));
        print("\nTempo de casa do professor " + professor.getNome() + ": " + sistema.calcularTempoDeCasaParaProfessor(professor) + " dias");
        print("\nCompromissos Agendados: ");
        sistema.listarCompromissos().forEach(e -> print("Data: " + e.getDate() + ", Tipo: " + e.getCompromisso() + ", Setor: " + e.getSetor()));
    }

    public static void print(String string) {
        System.out.println(string);
    }
}