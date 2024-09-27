package com.softelse.src.GassociacaoAtividades.dominio;

public class Jogadores {
    private String apelido;
    private String nomeCampeao;
    private String rota;

    public Jogadores() {
    }

    public Jogadores(String apelido, String nomeCampeao) {
        this.apelido = apelido;
        this.nomeCampeao = nomeCampeao;
    }

    public Jogadores(String apelido, String nomeCampeao, String rota) {
        this.apelido = apelido;
        this.nomeCampeao = nomeCampeao;
        this.rota = rota;
    }

    public String getRota() {
        return rota;
    }

    public void setRota(String rota) {
        this.rota = rota;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getNomeCampeao() {
        return nomeCampeao;
    }

    public void setNomeCampeao(String nomeCampeao) {
        this.nomeCampeao = nomeCampeao;
    }
}
