package br.edu.ifpb.ads.padroes.atv1.rpg.personagem.factory;

import br.edu.ifpb.ads.padroes.atv1.rpg.model.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.model.Armadura;

import java.util.HashMap;
import java.util.Map;

public class HumanoGuerreiroFactory implements PersonagemFactory {
    @Override
    public Arma criarArma() {
        return new Arma("Espada de Ferro", 25, "Espada");
    }

    @Override
    public Armadura criarArmadura() {
        return new Armadura("Armadura de Placas", 20, "Pesada");
    }

    @Override
    public String[] criarHabilidades() {
        return new String[]{"Investida", "Bloqueio"};
    }

    @Override
    public Map<String, Integer> criarAtributos() {
        Map<String, Integer> atributos = new HashMap<>();
        atributos.put("forca", 15);
        atributos.put("inteligencia", 8);
        atributos.put("agilidade", 10);
        atributos.put("vida", 120);
        atributos.put("mana", 30);
        return atributos;
    }

    @Override
    public String getClasse() {
        return "Guerreiro";
    }

    @Override
    public String getRaca() {
        return "Humano";
    }
}
