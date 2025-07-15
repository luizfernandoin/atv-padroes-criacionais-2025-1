package br.edu.ifpb.ads.padroes.atv1.rpg.personagem.factory;

import br.edu.ifpb.ads.padroes.atv1.rpg.model.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.model.Armadura;

import java.util.HashMap;
import java.util.Map;

public class HumanoMagoFactory implements PersonagemFactory {
    @Override
    public Arma criarArma() {
        return new Arma("Cajado Mágico", 15, "Cajado");
    }

    @Override
    public Armadura criarArmadura() {
        return new Armadura("Vestes Mágicas", 8, "Leve");
    }

    @Override
    public String[] criarHabilidades() {
        return new String[]{"Bola de Fogo", "Cura"};
    }

    @Override
    public Map<String, Integer> criarAtributos() {
        Map<String, Integer> atributos = new HashMap<>();
        atributos.put("forca", 6);
        atributos.put("inteligencia", 18);
        atributos.put("agilidade", 8);
        atributos.put("vida", 80);
        atributos.put("mana", 150);

        return atributos;
    }

    @Override
    public String getClasse() {
        return "Mago";
    }

    @Override
    public String getRaca() {
        return "Humano";
    }
}
