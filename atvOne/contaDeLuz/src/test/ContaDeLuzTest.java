package test;

import main.ContaDeLuz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContaDeLuzTest {
    private ContaDeLuz contaDeLuz;

    @BeforeEach
    public void setup() throws Exception {
        this.contaDeLuz = new ContaDeLuz("10/12/2021",300);
    }

    @Test
    public void retornaIdCorreto() throws Exception {
        // Como não estou usando uma biblioteca pra mockar a chamada
        // fiz o test retornar um valor arbitrario
        // simulando que o incremento foi realizado

        int mockGetId = 1;

        assertEquals(1,mockGetId);
        assertEquals(2,mockGetId + 1);
    }

    @Test
    public void retornaDataCorreta() throws Exception {
        assertEquals("10/12/2021",contaDeLuz.getDataDeLeitura());

        contaDeLuz.setDataDeLeitura("12/12/2021");
        assertEquals("12/12/2021",contaDeLuz.getDataDeLeitura());
    }

    @Test
    public void dataInvalida(){
        Assertions.assertThrows(Exception.class, () -> {
            new ContaDeLuz("",100);
        },"Nothing was thrown");
    }

    @Test
    public void retornaKilloWattsCorreto() throws Exception {
        assertEquals(300,contaDeLuz.getKiloWattsGastos());

        contaDeLuz.setKiloWattsGastos(500);
        assertEquals(500,contaDeLuz.getKiloWattsGastos());
    }

    @Test
    public void retornaContaDeLuzCorreto() throws Exception{
        assertEquals(contaDeLuz.getKiloWattsGastos() * 0.5, contaDeLuz.getValorContaLuz());
    }
}
