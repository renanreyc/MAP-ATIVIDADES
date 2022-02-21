package tests.classesTests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import main.servicos.FuncionarioServico;
import org.junit.Before;
import org.junit.Test;

import tests.builders.FuncionarioBuilder;
import main.entidades.Funcionario;

public class FuncionarioTest {

    private FuncionarioServico funcionarioService;

    private Funcionario funcionario;


    @Before
    public void setUp(){
        this.funcionarioService = new FuncionarioServico();
        this.funcionario = FuncionarioBuilder.mockFuncionario().getFuncionario();
    }

    @Test
    public void getAll() {
        this.funcionarioService.save(this.funcionario);
        this.funcionarioService.save(this.funcionario);

        assertFalse(this.funcionarioService.getAll().isEmpty());
        assertEquals(this.funcionarioService.getAll().size(),2);
    }

    @Test
    public void getById() {
        this.funcionarioService.save(this.funcionario);
        assertEquals(this.funcionarioService.getById(this.funcionario.getId()), this.funcionario);
    }

    @Test
    public void save() {
        assertEquals(this.funcionarioService.save(this.funcionario), this.funcionario);
    }
}
