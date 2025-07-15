package br.edu.ifpb.ads.padroes.atv1.rpg.personagem.factory;

import br.edu.ifpb.ads.padroes.atv1.rpg.model.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.model.Armadura;

import java.util.HashMap;
import java.util.Map;

public class HumanoArqueiroFactory implements PersonagemFactory {
    @Override
    public Arma criarArma() {
        return new Arma("Arco Élfico", 20, "Arco");
    }

    @Override
    public Armadura criarArmadura() {
        return new Armadura("Armadura de Couro", 12, "Média");
    }

    @Override
    public String[] criarHabilidades() {
        return new String[]{"Tiro Certeiro", "Chuva de Flechas"};
    }

    @Override
    public Map<String, Integer> criarAtributos() {
        Map<String, Integer> atributos = new HashMap<>();
        atributos.put("forca", 10);
        atributos.put("inteligencia", 12);
        atributos.put("agilidade", 16);
        atributos.put("vida", 100);
        atributos.put("mana", 70);

        return atributos;
    }

    @Override
    public String getClasse() {
        return "Arqueiro";
    }

    @Override
    public String getRaca() {
        return "Humano";
    }
}
