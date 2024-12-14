package br.com.alves.scrum.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class DailyScrum {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int idProjeto;
    @Temporal(TemporalType.DATE)
    private Date data;

    public DailyScrum() {
        this.setId(0);
        this.setIdProjeto(0);
        this.setData(new Date());
    }
    public DailyScrum(int id, int idProjeto, Date data) {
        this.setId(id);
        this.setIdProjeto(idProjeto);
        this.setData(data);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdProjeto() {
        return idProjeto;
    }

    public void setIdProjeto(int idProjeto) {
        this.idProjeto = idProjeto;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
