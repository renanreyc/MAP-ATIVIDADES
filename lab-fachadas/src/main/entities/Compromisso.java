package main.entities;

import main.enums.Compromissos;
import main.enums.Setores;

import java.util.Date;

public class Compromisso extends Entity {

    private Date date;
    private Compromissos compromisso;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Compromissos getCompromisso() {
        return compromisso;
    }

    public void setCompromisso(Compromissos compromisso) {
        this.compromisso = compromisso;
    }

    public Setores getSetor() {
        return setor;
    }

    public void setSetor(Setores setor) {
        this.setor = setor;
    }

    private Setores setor;

    public Compromisso(Date date, Compromissos compromisso, Setores setor) {
        this.date = date;
        this.compromisso = compromisso;
        this.setor = setor;
    }

}