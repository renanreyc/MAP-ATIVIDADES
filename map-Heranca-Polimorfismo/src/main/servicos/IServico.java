package main.servicos;

import main.entidades.Entidade;

import java.util.List;
import java.util.UUID;

public interface IServico<T extends Entidade> {

    T save(T entity);
    List<T> getAll();
    T getById(UUID id);
}