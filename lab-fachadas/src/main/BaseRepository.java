package main;

import main.entities.Entity;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public class BaseRepository<T extends Entity> implements IRepository<T> {

    private final List<T> repository;

    public BaseRepository(List<T> repository) {
        this.repository = repository;
    }

    @Override
    public T save(T entity) {
        entity.setId(UUID.randomUUID());
        entity.setCreatedAt(new Date());
        this.repository.add(entity);

        return entity;
    }

    @Override
    public T getById(UUID id) {

        for (Entity entity : this.repository) {
            if (entity.getId().equals(id))
                return (T) entity;
        }

        return null;
    }

    @Override
    public List<T> getAll() {
        return this.repository;
    }
}

