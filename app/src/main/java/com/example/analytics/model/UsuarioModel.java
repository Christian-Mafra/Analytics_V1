package com.example.analytics.model;

import com.google.firebase.database.Exclude;

public class UsuarioModel {
    private String nome;
    private String email;
    private String senha;

    public UsuarioModel(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public UsuarioModel(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    public UsuarioModel() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @Exclude
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
