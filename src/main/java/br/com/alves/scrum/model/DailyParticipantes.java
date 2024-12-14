package br.com.alves.scrum.model;

import jakarta.persistence.*;

@Entity
public class DailyParticipantes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int idDaily;
    private int idUsuario;

    public DailyParticipantes() {
        this.setId(0);
        this.setIdDaily(0);
        this.setIdUsuario(0);
    }
    public DailyParticipantes(int id, int idDaily, int idUsuario) {
        this.setId(id);
        this.setIdDaily(idDaily);
        this.setIdUsuario(idUsuario);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdDaily() {
        return idDaily;
    }

    public void setIdDaily(int idDaily) {
        this.idDaily = idDaily;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
}
