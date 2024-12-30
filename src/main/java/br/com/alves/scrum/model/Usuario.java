package br.com.alves.scrum.model;

import jakarta.persistence.*;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String login;
    private String senha;
    private String nome;
    private int permissao;
    private int ativo;

    public Usuario() {
        this.id = 0;
        this.login = "";
        this.senha = "";
        this.nome = "";
        this.permissao = 0;
        this.ativo = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPermissao() {
        return permissao;
    }

    public void setPermissao(int permissao) {
        this.permissao = permissao;
    }

    public int getAtivo() {
        return ativo;
    }

    public void setAtivo(int ativo) {
        this.ativo = ativo;
    }
}
