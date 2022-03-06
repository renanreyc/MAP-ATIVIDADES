package main;

import main.entities.Entity;

import java.util.List;
import java.util.UUID;

public interface IRepository<T extends Entity> {

    T save(T entity);
    T getById(UUID id);
    List<T> getAll();
}