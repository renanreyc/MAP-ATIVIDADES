package main.sectors;

import main.entities.Professor;
import main.enums.Proficiencias;
import main.BaseRepository;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Professores {

    private BaseRepository<Professor> repository;

    public Professores(BaseRepository<Professor> professores) {
        this.repository = professores;
    }

    public Professor matricularProfessor(String nome, Proficiencias proficiencia, double salario) {
        Professor professor = new Professor(nome, proficiencia, salario);
        return this.repository.save(professor);
    }

    public Professor procurarProfessorDisponivelPorProficiencia(Proficiencias proficiencia) {
        for (Professor professor : this.repository.getAll()) {
            if (professor.getProficiencia().equals(proficiencia) && !professor.isAlocado())
                return professor;
        }

        return null;
    }

    public long calcularTempoDeCasa(Professor professor) {
        long resultado = (new Date().getTime()) - professor.getCreatedAt().getTime();
        TimeUnit timeUnit = TimeUnit.DAYS;
        return timeUnit.convert(resultado, TimeUnit.MILLISECONDS);
    }

    public BaseRepository<Professor> getRepository() {
        return repository;
    }
}
