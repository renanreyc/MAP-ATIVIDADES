package tests.classesTests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import main.servicos.EscalaServico;
import org.junit.Before;
import org.junit.Test;

import tests.builders.EscalaBuilder;
import tests.builders.FuncaoBuilder;
import main.entidades.Escala;

public class EscalaTest {

    private EscalaServico escalaService;

    private Escala escala;

    @Before
    public void setUp(){
        this.escalaService = new EscalaServico();
        this.escala = EscalaBuilder.mockEscala().getEscala();
    }

    @Test
    public void getAll() {
        this.escalaService.save(this.escala);
        this.escalaService.save(this.escala);

        assertFalse(this.escalaService.getAll().isEmpty());
        assertEquals(this.escalaService.getAll().size(),2);
    }

    @Test
    public void getById() {
        this.escalaService.save(this.escala);
        assertEquals(this.escalaService.getById(this.escala.getId()), this.escala);
    }

    @Test
    public void save() {
        assertEquals(this.escalaService.save(this.escala), this.escala);
    }

    @Test
    public void findByFuncionarioAndFuncao() {
        assertTrue(this.escalaService.findByFuncionarioAndFuncao(escala.getFuncionario().getNome(), FuncaoBuilder.mockFuncao().getFuncao().getFuncao()).isEmpty());
    }
}
