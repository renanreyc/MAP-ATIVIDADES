package subsistemas;

import entidades.Professor;

import java.util.ArrayList;
import java.util.List;

public class Professores {

    public List<Professor> getProfessoresDeUmaDisciplina(String disciplina) {
        List<Professor> professoresDeUmaDisciplina = new ArrayList<>();

        professoresDeUmaDisciplina.add(new Professor("01", "Antonio", "Matematica", "1 Ano"));
        professoresDeUmaDisciplina.add(new Professor("02", "Fábio", "Matematica", "5 Anos"));

        return professoresDeUmaDisciplina;
    }

    public List<Professor> getProfessoresComMesmoTempoDeCasa(String tempoDeCasa) {
        List<Professor> professoresComTempoDeCasa = new ArrayList<>();

        professoresComTempoDeCasa.add(new Professor("01", "Antonio", "Matematica", "1 Ano"));
        professoresComTempoDeCasa.add(new Professor("02", "José", "Criptografia", "1 Ano"));
        professoresComTempoDeCasa.add(new Professor("02", "Nathan", "Teste de Software", "1 Ano"));

        return professoresComTempoDeCasa;
    }

}
