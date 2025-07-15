package br.edu.ifpb.ads.padroes.atv1.rpg.personagem.factory;

import br.edu.ifpb.ads.padroes.atv1.rpg.model.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.model.Armadura;

import java.util.HashMap;
import java.util.Map;

public class OrcGuerreiroFactory implements PersonagemFactory {
    @Override
    public Arma criarArma() {
        return new Arma("Machado de Guerra", 30, "Machado");
    }

    @Override
    public Armadura criarArmadura() {
        return new Armadura("Armadura Brutal", 25, "Pesada");
    }

    @Override
    public String[] criarHabilidades() {
        return new String[]{"Fúria", "Pancada Devastadora"};
    }

    @Override
    public Map<String, Integer> criarAtributos() {
        Map<String, Integer> atributos = new HashMap<>();
        atributos.put("forca", 20);
        atributos.put("inteligencia", 6);
        atributos.put("agilidade", 8);
        atributos.put("vida", 150);
        atributos.put("mana", 20);

        return atributos;
    }

    @Override
    public String getClasse() {
        return "Guerreiro";
    }

    @Override
    public String getRaca() {
        return "Orc";
    }
}
