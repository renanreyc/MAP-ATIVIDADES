package subsistemas;

import entidades.Entrevista;
import entidades.Reuniao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class AdministrativoTest {

    private Administrativo administrativo;

    @BeforeEach
    public void setup() {
        this.administrativo = new Administrativo();
    }

    @Test
    public void agendamentosEstaoRetornandoCorretamente() {
        List<Reuniao> reunioes = this.administrativo.getAgendamentosComADiretoria();
        Assertions.assertEquals(4, reunioes.size());
    }

    @Test
    public void primeiraReuniaoComecaNoPrimeiroHorarioDisponivel() {
        List<Reuniao> reunioes = this.administrativo.getAgendamentosComADiretoria();
        Assertions.assertEquals("07:00", reunioes.get(0).getHorario());
    }

    @Test
    public void entrevistasEstaoRetornandoCorretamente() {
        List<Entrevista> entrevistas = this.administrativo.getEntrevistas();
        Assertions.assertEquals(4, entrevistas.size());
    }

    @Test
    public void primeiraEntrevistaComecaNoPrimeiroHorarioDisponivel() {
        List<Reuniao> reunioes = this.administrativo.getAgendamentosComADiretoria();
        Assertions.assertEquals("07:00", reunioes.get(0).getHorario());
    }
}
