package tests.mainTests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import main.entities.Disciplina;
import main.enums.Proficiencias;
import main.BaseRepository;
import main.sectors.Disciplinas;

public class DisciplinasTest {

    private Disciplinas disciplinaService;
    private BaseRepository<Disciplina> repositorio;

    @Before
    public void setUp(){
        this.repositorio = new BaseRepository<Disciplina>(new ArrayList<Disciplina>());
        this.disciplinaService = new Disciplinas(this.repositorio);
    }

    @Test
    public void testRegistrarDisciplina() {
        assertEquals(this.disciplinaService.registrarDisciplina("Disciplina", Proficiencias.MATEMATICA).getNome(), "Disciplina");
    }

    @Test
    public void testGetRepository() {
        assertTrue(this.disciplinaService.getRepository().getAll().isEmpty());
    }
}
