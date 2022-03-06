package tests.mainTests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.ArrayList;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import tests.builders.CompromissoBuilder;
import main.entities.Compromisso;
import main.enums.Compromissos;
import main.enums.Setores;
import main.BaseRepository;
import main.sectors.Administrativo;

public class AdministrativoTest {

    private Administrativo administrativo;
    private BaseRepository<Compromisso> repositorio;
    private Compromisso compromisso;

    @Before
    public void setUp(){
        this.repositorio = new BaseRepository<Compromisso>(new ArrayList<Compromisso>());
        this.administrativo = new Administrativo(this.repositorio);
        this.compromisso = CompromissoBuilder.mockCompromisso().getCompromisso();
    }

    @Test
    public void testCriarCompromisso() {
        assertEquals(this.administrativo.criarCompromisso(new Date(), Setores.Diretoria, Compromissos.ENTREVISTA).getSetor(), Setores.Diretoria);
    }

    @Test
    public void testRecuperarCompromissoPorSetor() {
        this.administrativo.getRepository().save(this.compromisso);
        assertFalse(this.administrativo.recuperarCompromissoPorSetor(Setores.Diretoria).isEmpty());
    }

    @Test
    public void testRecuperarCompromissoPorTipo() {
        this.administrativo.getRepository().save(this.compromisso);
        assertFalse(this.administrativo.recuperarCompromissoPorTipo(Compromissos.ENTREVISTA).isEmpty());
    }
}
