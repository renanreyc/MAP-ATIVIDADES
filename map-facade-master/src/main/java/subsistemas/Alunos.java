package subsistemas;

import entidades.Historico;
import entidades.RDM;

import java.util.ArrayList;
import java.util.List;

public class Alunos {

    public RDM getRDMPeloIdAluno(String idAluno) {
        List<String> disciplinas = new ArrayList<String>();

        disciplinas.add("Sociologia");
        disciplinas.add("Biologia");
        disciplinas.add("MAP");
        disciplinas.add("Paradigmas");

        return new RDM("01", idAluno, disciplinas);
    }
    public Historico getHistoricoPeloIdAluno(String idAluno) {
        List<String> disciplinas = new ArrayList<String>();

        disciplinas.add("Etica");
        disciplinas.add("OAC");
        disciplinas.add("MAP");

        return new Historico("02", idAluno, disciplinas);
    }
}
