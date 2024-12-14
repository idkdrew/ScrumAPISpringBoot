package br.com.alves.scrum.model;

import jakarta.persistence.*;

@Entity
public class SpringBacklog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int idTarefa;
    private int idSprint;

    public SpringBacklog() {
        this.setId(0);
        this.setIdTarefa(0);
        this.setIdSprint(0);
    }
    public SpringBacklog(int id, int idTarefa, int idSprint) {
        this.setId(id);
        this.setIdTarefa(idTarefa);
        this.setIdSprint(idSprint);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdTarefa() {
        return idTarefa;
    }

    public void setIdTarefa(int idTarefa) {
        this.idTarefa = idTarefa;
    }

    public int getIdSprint() {
        return idSprint;
    }

    public void setIdSprint(int idSprint) {
        this.idSprint = idSprint;
    }
}
