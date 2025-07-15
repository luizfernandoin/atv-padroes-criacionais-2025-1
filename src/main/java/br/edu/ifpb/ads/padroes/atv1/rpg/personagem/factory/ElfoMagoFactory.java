package br.edu.ifpb.ads.padroes.atv1.rpg.personagem.factory;

import br.edu.ifpb.ads.padroes.atv1.rpg.model.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.model.Armadura;

import java.util.HashMap;
import java.util.Map;

public class ElfoMagoFactory implements PersonagemFactory {
    @Override
    public Arma criarArma() {
        return new Arma("Cajado da Natureza", 18, "Cajado");
    }

    @Override
    public Armadura criarArmadura() {
        return new Armadura("Mantos Élficos", 10, "Leve");
    }

    @Override
    public String[] criarHabilidades() {
        return new String[]{"Magia da Natureza", "Teleporte"};
    }

    @Override
    public Map<String, Integer> criarAtributos() {
        Map<String, Integer> atributos = new HashMap<>();
        atributos.put("forca", 4);
        atributos.put("inteligencia", 20);
        atributos.put("agilidade", 14);
        atributos.put("vida", 70);
        atributos.put("mana", 180);

        return atributos;
    }

    @Override
    public String getClasse() {
        return "Mago";
    }

    @Override
    public String getRaca() {
        return "Elfo";
    }
}
