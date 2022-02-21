package main.entidades;

import java.util.UUID;

public abstract class Entidade {

    private UUID id;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}