package br.com.alves.scrum.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Projeto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String descricao;
    private String status;
    @Temporal(TemporalType.DATE)
    private Date dataInicial;
    @Temporal(TemporalType.DATE)
    private Date dataFinalEstimada;
    @Temporal(TemporalType.DATE)
    private Date dataFinal;

    public Projeto() {
        this.setId(0);
        this.setNome("");
        this.setDescricao("");
        this.setStatus("");
        this.setDataInicial(new Date());
        this.setDataFinalEstimada(new Date());
        this.setDataFinal(new Date());
    }
    public Projeto(String nome, String descricao, String status, Date dataInicial, Date dataFinalEstimada) {
        this.setNome(nome);
        this.setDescricao(descricao);
        this.setStatus(status);
        this.setDataInicial(dataInicial);
        this.setDataFinalEstimada(dataFinalEstimada);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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

    public Date getDataFinalEstimada() {
        return dataFinalEstimada;
    }

    public void setDataFinalEstimada(Date dataFinalEstimada) {
        this.dataFinalEstimada = dataFinalEstimada;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }
}
