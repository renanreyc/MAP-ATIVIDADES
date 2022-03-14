package subsistemas;

import entidades.Professor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ProfessoresTest {

    private Professores professores;

    @BeforeEach
    public void setup() {
        this.professores = new Professores();
    }

    @Test
    public void quantidadeDeProfessoresLecionamAMesmaDisciplina() {
        List<Professor> professores = this.professores.getProfessoresDeUmaDisciplina("Matematica");
        Assertions.assertEquals(2, professores.size());
    }

    @Test
    public void quantidadeDeProfessoresComMesmoTempoDeCasa() {
        List<Professor> professores = this.professores.getProfessoresComMesmoTempoDeCasa("1 Ano");
        Assertions.assertEquals(3, professores.size());
    }


}
