package br.edu.ifpb.ads.padroes.atv1.rpg.personagem.factory;

import br.edu.ifpb.ads.padroes.atv1.rpg.model.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.model.Armadura;

import java.util.HashMap;
import java.util.Map;

public class OrcMagoFactory implements PersonagemFactory {
    @Override
    public Arma criarArma() {
        return new Arma("Cajado Tribal", 12, "Cajado");
    }

    @Override
    public Armadura criarArmadura() {
        return new Armadura("Vestes Xamânicas", 6, "Leve");
    }

    @Override
    public String[] criarHabilidades() {
        return new String[]{"Magia Sombria", "Invocação"};
    }

    @Override
    public Map<String, Integer> criarAtributos() {
        Map<String, Integer> atributos = new HashMap<>();
        atributos.put("forca", 10);
        atributos.put("inteligencia", 14);
        atributos.put("agilidade", 6);
        atributos.put("vida", 100);
        atributos.put("mana", 120);

        return atributos;
    }

    @Override
    public String getClasse() {
        return "Mago";
    }

    @Override
    public String getRaca() {
        return "Orc";
    }
}
