package tests.classesTests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import main.servicos.FilmeServico;
import org.junit.Before;
import org.junit.Test;

import tests.builders.FilmeBuilder;
import main.entidades.Filme;

public class FilmeTest {

    private FilmeServico filmeService;

    private Filme filme;


    @Before
    public void setUp(){
        this.filmeService = new FilmeServico();
        this.filme = FilmeBuilder.mockFilme().getFilme();
    }

    @Test
    public void getAllIsEmpty() {
        this.filmeService.save(this.filme);
        assertFalse(this.filmeService.getAll().isEmpty());
        getAll();
    }

    public void getAll() {
        assertEquals(this.filmeService.getAll().size(),1);
    }

    @Test
    public void getById() {
        this.filmeService.save(this.filme);
        assertEquals(this.filmeService.getById(this.filme.getId()), this.filme);
    }

    @Test
    public void save() {
        assertEquals(this.filmeService.save(this.filme), this.filme);
    }


}
