package br.edu.ifpb.ads.padroes.atv1.rpg.personagem.factory;

import br.edu.ifpb.ads.padroes.atv1.rpg.model.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.model.Armadura;

import java.util.HashMap;
import java.util.Map;

public class OrcArqueiroFactory implements PersonagemFactory {
    @Override
    public Arma criarArma() {
        return new Arma("Arco de Osso", 24, "Arco");
    }

    @Override
    public Armadura criarArmadura() {
        return new Armadura("Couro de Besta", 16, "Média");
    }

    @Override
    public String[] criarHabilidades() {
        return new String[]{"Tiro Brutal", "Intimidação"};
    }

    @Override
    public Map<String, Integer> criarAtributos() {
        Map<String, Integer> atributos = new HashMap<>();
        atributos.put("forca", 14);
        atributos.put("inteligencia", 8);
        atributos.put("agilidade", 12);
        atributos.put("vida", 120);
        atributos.put("mana", 40);

        return atributos;
    }

    @Override
    public String getClasse() {
        return "Arqueiro";
    }

    @Override
    public String getRaca() {
        return "Orc";
    }
}
