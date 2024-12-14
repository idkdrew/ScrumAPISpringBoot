package br.com.alves.scrum.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Sprint {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int idProjeto;
    private String status;
    @Temporal(TemporalType.DATE)
    private Date dataInicial;
    @Temporal(TemporalType.DATE)
    private Date dataFinal;

    public Sprint() {
        this.setId(0);
        this.setIdProjeto(0);
        this.setStatus("");
        this.setDataInicial(new Date());
        this.setDataFinal(new Date());
    }

    public Sprint(int idProjeto, String status, Date dataInicial, Date dataFinal) {
        this.setIdProjeto(idProjeto);
        this.setStatus(status);
        this.setDataInicial(dataInicial);
        this.setDataFinal(dataFinal);
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }
}
