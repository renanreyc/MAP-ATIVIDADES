package tests.mainTests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import tests.builders.AlunoBuilder;
import tests.builders.MatriculaBuilder;
import tests.builders.SalaBuilder;
import main.sectors.Alunos;
import main.entities.Aluno;
import main.entities.Matricula;
import main.entities.Sala;
import main.BaseRepository;

public class AlunosTest {

    private Alunos alunoService;
    private BaseRepository<Aluno> repositorio;
    private Aluno aluno;
    private Sala sala;

    @Before
    public void setUp(){
        this.repositorio = new BaseRepository<Aluno>(new ArrayList<Aluno>());
        this.alunoService = new Alunos(this.repositorio);
        this.aluno = AlunoBuilder.mockAluno().getAluno();
        this.sala = SalaBuilder.mockSala().getSala();
    }

    @Test
    public void testRegistrarAluno() {
        assertEquals(this.alunoService.registrarAluno(this.aluno.getNome()).getNome(), this.aluno.getNome());
        assertFalse(this.alunoService.getRepository().getAll().isEmpty());
    }

    @Test
    public void testFinalizarSemestre() {
        this.aluno.setMatriculas((List<Matricula>)MatriculaBuilder.mockCollectionMatriculas().getMatriculas());
        assertFalse(this.alunoService.finalizarSemestre(this.aluno).getHistorico().isEmpty());
    }

    @Test
    public void testMatricularAlunoNaDisciplina() {
        assertEquals(this.alunoService.matricularAlunoNaDisciplina(this.sala, this.aluno).getAluno(), this.aluno);
    }

}