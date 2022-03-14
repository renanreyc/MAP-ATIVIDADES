package subsistemas;

import entidades.Historico;
import entidades.RDM;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunosTest {
    private Alunos alunos;

    @BeforeEach
    public void setup() {
        this.alunos = new Alunos();
    }

    @Test
    void getRDMPeloIdAluno() {
        RDM rdm = this.alunos.getRDMPeloIdAluno("01");
        assertNotNull(rdm);
    }

    @Test
    void getHistoricoPeloIdAluno() {
        Historico historico = this.alunos.getHistoricoPeloIdAluno("02");
        assertNotNull(historico);
    }
}