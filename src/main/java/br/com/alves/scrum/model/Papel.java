package br.com.alves.scrum.model;

import jakarta.persistence.*;

@Entity
public class Papel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int idUsuario;
    private int idProjeto;
    private String permissao;

    public Papel() {
        this.setId(0);
        this.setIdUsuario(0);
        this.setIdProjeto(0);
        this.setPermissao("");
    }
    public Papel(int id, int idUsuario, int idProjeto, String permissao) {
        this.setId(id);
        this.setIdUsuario(idUsuario);
        this.setIdProjeto(idProjeto);
        this.setPermissao(permissao);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdProjeto() {
        return idProjeto;
    }

    public void setIdProjeto(int idProjeto) {
        this.idProjeto = idProjeto;
    }

    public String getPermissao() {
        return permissao;
    }

    public void setPermissao(String permissao) {
        this.permissao = permissao;
    }
}
