package br.edu.ifpb.ads.padroes.atv1.rpg.model;

public class Armadura {

    private String nome;
    private int defesa;
    private String tipo;

    public Armadura(String nome, int defesa, String tipo) {
        this.nome = nome;
        this.defesa = defesa;
        this.tipo = tipo;
    }

    public Armadura(Armadura original) {
        this.nome = original.nome;
        this.defesa = original.defesa;
        this.tipo = original.tipo;
    }

    public String getNome() {
        return nome;
    }

    public int getDefesa() {
        return defesa;
    }

    public String getTipo() {
        return tipo;
    }

}
