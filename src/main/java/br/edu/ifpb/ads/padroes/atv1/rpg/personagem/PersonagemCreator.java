package br.edu.ifpb.ads.padroes.atv1.rpg.personagem;

import br.edu.ifpb.ads.padroes.atv1.rpg.model.Personagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.personagem.builder.PersonagemBuilder;
import br.edu.ifpb.ads.padroes.atv1.rpg.personagem.factory.PersonagemFactory;

import java.util.Map;

public abstract class PersonagemCreator {
    public static Personagem criar(String nome, PersonagemFactory factory) {
        Map<String, Integer> atr = factory.criarAtributos();

        return new PersonagemBuilder()
                .comNome(nome)
                .comRaca(factory.getRaca())
                .comClasse(factory.getClasse())
                .comAtributos(
                        atr.get("forca"),
                        atr.get("inteligencia"),
                        atr.get("agilidade"),
                        atr.get("vida"),
                        atr.get("mana")
                )
                .comArma(factory.criarArma())
                .comArmadura(factory.criarArmadura())
                .comHabilidades(factory.criarHabilidades())
                .build();
    }
}
