package br.edu.ifpb.ads.padroes.atv1.rpg.model;

public class Arma {

    private String nome;
    private int dano;
    private String tipo;

    public Arma(String nome, int dano, String tipo) {
        this.nome = nome;
        this.dano = dano;
        this.tipo = tipo;
    }

    public Arma(Arma original) {
        this.nome = original.nome;
        this.dano = original.dano;
        this.tipo = original.tipo;
    }

    public String getNome() {
        return nome;
    }

    public int getDano() {
        return dano;
    }

    public String getTipo() {
        return tipo;
    }
}
