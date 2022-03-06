package main.sectors;

import main.entities.Disciplina;
import main.enums.Proficiencias;
import main.BaseRepository;

public class Disciplinas {

    private BaseRepository<Disciplina> repository;

    public Disciplinas(BaseRepository<Disciplina> repository) {
        this.repository = repository;
    }

    public Disciplina registrarDisciplina(String nome, Proficiencias proficiencia) {
        Disciplina disciplina = new Disciplina(nome, proficiencia);
        return this.repository.save(disciplina);
    }

    public BaseRepository<Disciplina> getRepository() {
        return repository;
    }
}
