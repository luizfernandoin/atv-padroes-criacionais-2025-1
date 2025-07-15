package br.edu.ifpb.ads.padroes.atv1.rpg.personagem.factory;

import br.edu.ifpb.ads.padroes.atv1.rpg.model.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.model.Armadura;

import java.util.HashMap;
import java.util.Map;

public class ElfoArqueiroFactory implements PersonagemFactory {
    @Override
    public Arma criarArma() {
        return new Arma("Arco Longo Élfico", 28, "Arco");
    }

    @Override
    public Armadura criarArmadura() {
        return new Armadura("Armadura de Couro Élfico", 14, "Média");
    }

    @Override
    public String[] criarHabilidades() {
        return new String[]{"Tiro Múltiplo", "Camuflagem"};
    }

    @Override
    public Map<String, Integer> criarAtributos() {
        Map<String, Integer> atributos = new HashMap<>();
        atributos.put("forca", 8);
        atributos.put("inteligencia", 16);
        atributos.put("agilidade", 20);
        atributos.put("vida", 90);
        atributos.put("mana", 100);

        return atributos;
    }

    @Override
    public String getClasse() {
        return "Arqueiro";
    }

    @Override
    public String getRaca() {
        return "Elfo";
    }
}
