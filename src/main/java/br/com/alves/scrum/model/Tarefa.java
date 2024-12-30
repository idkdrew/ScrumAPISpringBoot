package br.com.alves.scrum.model;

import jakarta.persistence.*;

@Entity
@Table (name = "tarefa")
public class Tarefa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String descricao;
    private int status;
    @Column(name = "id_projeto")
    private int idProjeto;
    private int prioridade;

    public Tarefa() {
        this.setId(0);
        this.setNome("");
        this.setDescricao("");
        this.setStatus(0);
        this.setIdProjeto(0);
        this.setPrioridade(0);
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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getIdProjeto() {
        return idProjeto;
    }

    public void setIdProjeto(int idProjeto) {
        this.idProjeto = idProjeto;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

}