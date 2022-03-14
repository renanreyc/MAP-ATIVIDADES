package subsistemas;

import entidades.Sala;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InfraestruturaTest {
    private Infraestrutura infraestrutura;

    @BeforeEach
    public void setup(){ this.infraestrutura = new Infraestrutura();}

    @Test
    void getAlocacaoDasSalas() {
        List<Sala> salas = this.infraestrutura.getAlocacaoDasSalas();
        assertEquals(4, salas.size());
    }
}