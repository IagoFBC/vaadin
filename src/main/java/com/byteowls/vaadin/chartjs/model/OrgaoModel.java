package com.byteowls.vaadin.chartjs.model;

public class OrgaoModel {

    private int id_org;
    private String nome;
    private String sigla;
    private String descricao;
    private String tag;

    public OrgaoModel() {
    }

    public OrgaoModel(int id_org, String nome) {
        this.id_org = id_org;
        this.nome = nome;
    }

    public OrgaoModel(int id_org, String nome, String sigla, String descricao, String tag) {
        this.id_org = id_org;
        this.nome = nome;
        this.sigla = sigla;
        this.descricao = descricao;
        this.tag = tag;
    }

    public int getId_org() {
        return id_org;
    }

    public void setId_org(int id_org) {
        this.id_org = id_org;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
