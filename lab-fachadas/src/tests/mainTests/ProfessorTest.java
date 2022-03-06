package tests.mainTests;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import tests.builders.ProfessorBuilder;
import main.entities.Professor;
import main.enums.Proficiencias;
import main.BaseRepository;
import main.sectors.Professores;

public class ProfessorTest {

    private Professores professorService;
    private BaseRepository<Professor> repositorio;
    private Professor professor;

    @Before
    public void setUp(){
        this.repositorio = new BaseRepository<Professor>(new ArrayList<Professor>());
        this.professorService = new Professores(this.repositorio);
        this.professor = ProfessorBuilder.mockProfessor().getProfessor();
    }

    @Test
    public void testMatricularProfessor() {
        assertEquals(this.professorService.matricularProfessor("Professor", Proficiencias.MATEMATICA, new Double(1200)).getNome(), "Professor");
    }

    @Test
    public void testProcurarProfessorDisponivelPorProficiencia() {
        this.professorService.getRepository().save(this.professor);
        assertEquals(this.professorService.procurarProfessorDisponivelPorProficiencia(Proficiencias.MATEMATICA), this.professor);
    }

    @Test
    public void testCalcularTempoDeCasa() {
        this.professor.setCreatedAt(new Date());
        assertEquals(this.professorService.calcularTempoDeCasa(this.professor), 0);
    }
}