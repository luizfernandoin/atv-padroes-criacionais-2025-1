package br.edu.ifpb.ads.padroes.atv1.rpg.personagem.factory;

import br.edu.ifpb.ads.padroes.atv1.rpg.model.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.model.Armadura;

import java.util.HashMap;
import java.util.Map;

public class ElfoGuerreiroFactory implements PersonagemFactory {
    @Override
    public Arma criarArma() {
        return new Arma("Lâmina Élfica", 22, "Espada");
    }

    @Override
    public Armadura criarArmadura() {
        return new Armadura("Cota de Malha Élfica", 15, "Média");
    }

    @Override
    public String[] criarHabilidades() {
        return new String[]{"Dança das Lâminas", "Agilidade Élfica"};
    }

    @Override
    public Map<String, Integer> criarAtributos() {
        Map<String, Integer> atributos = new HashMap<>();
        atributos.put("forca", 12);
        atributos.put("inteligencia", 14);
        atributos.put("agilidade", 16);
        atributos.put("vida", 100);
        atributos.put("mana", 60);

        return atributos;
    }

    @Override
    public String getClasse() {
        return "Guerreiro";
    }

    @Override
    public String getRaca() {
        return "Elfo";
    }
}
