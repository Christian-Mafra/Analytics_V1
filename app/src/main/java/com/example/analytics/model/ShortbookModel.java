package com.example.analytics.model;

public class ShortbookModel {
    private int foto;
    private String nome;
    private String desc;

    public ShortbookModel() {
    }

    public ShortbookModel(int foto, String nome, String desc) {
        this.foto = foto;
        this.nome = nome;
        this.desc = desc;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
