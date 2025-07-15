package br.edu.ifpb.ads.padroes.atv1.rpg.model;

import br.edu.ifpb.ads.padroes.atv1.rpg.prototype.Prototype;

public class Personagem implements Prototype {

    private String nome;
    private String raca;
    private String classe;
    private int forca;
    private int inteligencia;
    private int agilidade;
    private int vida;
    private int mana;
    private Arma arma;
    private Armadura armadura;
    private String[] habilidades;

    public Personagem(String nome, String raca, String classe, int forca,
                      int inteligencia, int agilidade, int vida, int mana,
                      Arma arma, Armadura armadura, String[] habilidades) {
        this.nome = nome;
        this.raca = raca;
        this.classe = classe;
        this.forca = forca;
        this.inteligencia = inteligencia;
        this.agilidade = agilidade;
        this.vida = vida;
        this.mana = mana;
        this.arma = arma;
        this.armadura = armadura;
        this.habilidades = habilidades;
    }

    public Personagem(Personagem original) {
        this.nome = original.nome;
        this.raca = original.raca;
        this.classe = original.classe;
        this.forca = original.forca;
        this.inteligencia = original.inteligencia;
        this.agilidade = original.agilidade;
        this.vida = original.vida;
        this.mana = original.mana;

        this.arma = new Arma(original.arma);
        this.armadura = new Armadura(original.armadura);
        this.habilidades = original.habilidades.clone();
    }


    // Getters e Setters básicos
    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public String getClasse() {
        return classe;
    }

    public int getForca() {
        return forca;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public int getAgilidade() {
        return agilidade;
    }

    public int getVida() {
        return vida;
    }

    public int getMana() {
        return mana;
    }

    public Arma getArma() {
        return arma;
    }

    public Armadura getArmadura() {
        return armadura;
    }

    public String[] getHabilidades() {
        return habilidades;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return String.format("%s - %s %s (F:%d, I:%d, A:%d, V:%d, M:%d)",
                nome, raca, classe, forca, inteligencia, agilidade, vida, mana);
    }

    @Override
    public Prototype clone() {
        return new Personagem(this);
    }
}
