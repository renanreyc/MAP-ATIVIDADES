package tests.mainTests;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import tests.builders.DisciplinaBuilder;
import tests.builders.ProfessorBuilder;
import tests.builders.SalaBuilder;
import main.entities.Disciplina;
import main.entities.Professor;
import main.entities.Sala;
import main.BaseRepository;
import main.sectors.Salas;

public class SalasTest {

    private Salas salasServices;
    private BaseRepository<Sala> repositorio;
    private Sala sala;
    private Professor professor;
    private Disciplina disciplina;

    @Before
    public void setUp(){
        this.repositorio = new BaseRepository<Sala>(new ArrayList<Sala>());
        this.salasServices = new Salas(this.repositorio);
        this.sala = SalaBuilder.mockSala().getSala();
        this.professor = ProfessorBuilder.mockProfessor().getProfessor();
        this.disciplina = DisciplinaBuilder.mockDisciplina().getDisciplina();
    }

    @Test
    public void testCriarSala() {
        assertEquals(this.salasServices.criarSala(this.sala.getCodigo()).getCodigo(), this.sala.getCodigo());
    }

    @Test
    public void testAlocarSala() {
        this.salasServices.getRepository().save(this.sala);
        assertEquals(this.salasServices.alocarSala(this.sala.getCodigo(), this.professor, this.disciplina), this.sala);
    }
}