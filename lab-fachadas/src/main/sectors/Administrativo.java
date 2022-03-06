package main.sectors;

import main.entities.Compromisso;
import main.BaseRepository;
import main.enums.Compromissos;
import main.enums.Setores;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Administrativo {

    private BaseRepository<Compromisso> repository;

    public Administrativo(BaseRepository<Compromisso> repository) {
        this.repository = repository;
    }

    public Compromisso criarCompromisso(Date data, Setores setor, Compromissos tipo) {
        Compromisso novo = new Compromisso(data, tipo, setor);
        this.repository.save(novo);

        return novo;
    }

    public List<Compromisso> recuperarCompromissoPorSetor(Setores setor) {
        return this.repository.getAll().stream().filter(e -> e.getSetor().equals(setor)).collect(Collectors.toList());
    }

    public List<Compromisso> recuperarCompromissoPorTipo(Compromissos tipo) {
        return this.repository.getAll().stream().filter(e -> e.getCompromisso().equals(tipo)).collect(Collectors.toList());
    }

    public BaseRepository<Compromisso> getRepository() {
        return repository;
    }
}
