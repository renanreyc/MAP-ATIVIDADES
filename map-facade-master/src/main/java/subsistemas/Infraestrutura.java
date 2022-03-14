package subsistemas;

import entidades.Sala;

import java.util.ArrayList;
import java.util.List;

public class Infraestrutura {

    public List<Sala> getAlocacaoDasSalas() {
        ArrayList<Sala> alocacoes = new ArrayList();

        alocacoes.add(new Sala("01","Disponivel" , "07:00"));
        alocacoes.add(new Sala("02", "Disponivel", "08:00"));
        alocacoes.add(new Sala("03", "Indisponivel", "09:00"));
        alocacoes.add(new Sala("04", "Disponivel", "10:00"));

        return alocacoes;
    }

}
