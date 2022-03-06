package main;

import main.sectors.Administrativo;
import main.sectors.Almoxarifado;
import main.sectors.Alunos;
import main.sectors.Disciplinas;
import main.sectors.Financeiro;
import main.sectors.Salas;
import main.sectors.Professores;
import main.entities.*;
import main.enums.Compromissos;
import main.enums.Proficiencias;
import main.enums.Setores;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SIG {

    private final Administrativo administrativo;
    private final Almoxarifado estoque;
    private final Financeiro balanco;
    private final Alunos alunos;
    private final Disciplinas disciplinas;
    private final Professores professorService;
    private final Salas salasServices;

    public SIG() {
        this.administrativo = new Administrativo(new BaseRepository<>(new ArrayList<>()));
        this.estoque = new Almoxarifado(new BaseRepository<>(new ArrayList<>()), new BaseRepository<>(new ArrayList<>()));
        this.balanco = new Financeiro(new BaseRepository<>(new ArrayList<>()));
        this.alunos = new Alunos(new BaseRepository<>(new ArrayList<>()));
        this.disciplinas = new Disciplinas(new BaseRepository<>(new ArrayList<>()));
        this.professorService = new Professores(new BaseRepository<>(new ArrayList<>()));
        this.salasServices = new Salas(new BaseRepository<>(new ArrayList<>()));
    }

    public Aluno registrarAluno(String nome) {
        return this.alunos.registrarAluno(nome);
    }

    public Professor registrarProfessor(String nome, Proficiencias proficiencia, double salario) {
        return this.professorService.matricularProfessor(nome, proficiencia, salario);
    }

    public Disciplina criarDisciplina(String nome, Proficiencias proficiencia) {
        return this.disciplinas.registrarDisciplina(nome, proficiencia);
    }

    public Compromisso agendarCompromisso(Date data, Setores setor, Compromissos tipo) {
        return this.administrativo.criarCompromisso(data, setor, tipo);
    }

    public List<Compromisso> listarCompromissos() {
        return this.administrativo.getRepository().getAll();
    }

    public List<Compromisso> listarCompromissosPorSetor(Setores setor) {
        return this.administrativo.recuperarCompromissoPorSetor(setor);
    }

    public List<Compromisso> listarCompromissosPorTipo(Compromissos tipo) {
        return this.administrativo.recuperarCompromissoPorTipo(tipo);
    }

    public double gerarBalanco() {
        return this.balanco.gerarBalancoSemPedidos();
    }

    public double gerarBalancoCompleto() {
        return this.balanco.gerarBalnacoComPedidos(this.estoque.recuperarPedidosAbertos());
    }

    public List<Pagamento> gerarFolhaDePagamento() {
        return this.balanco.gerarFolhaDePagamento(this.professorService.getRepository().getAll());
    }

    public long calcularTempoDeCasaParaProfessor(Professor professor) {
        return this.professorService.calcularTempoDeCasa(professor);
    }

    public Sala alocarProfessorDisponivelPorDisciplina(Sala sala, Disciplina disciplina) {
        Professor professor = this.professorService.procurarProfessorDisponivelPorProficiencia(disciplina.getProficiencia());
        sala.setDisciplina(disciplina);
        sala.setProfessor(professor);
        professor.setAlocado(true);

        return sala;
    }

    public Matricula matricularNaDisciplina(Sala sala, Aluno aluno) {
        return this.alunos.matricularAlunoNaDisciplina(sala, aluno);
    }

    public Aluno finalizarSemestre(Aluno aluno) {
        return this.alunos.finalizarSemestre(aluno);
    }

    public Pedido realizarPedido(String nome, int quantidade, double valor) {
        return this.estoque.gerarPedido(nome, quantidade, valor);
    }

    public Item adicionarItemAoEstoque(String nome, int quantidade) {
        return this.estoque.adicionarItemAoEstoque(nome, quantidade);
    }

    public Sala criarSala(String codigo) {
        return this.salasServices.criarSala(codigo);
    }

    public Sala alocarSala(String codigo, Disciplina disciplina, Professor professor) {
        return this.salasServices.alocarSala(codigo, professor, disciplina);
    }
}
