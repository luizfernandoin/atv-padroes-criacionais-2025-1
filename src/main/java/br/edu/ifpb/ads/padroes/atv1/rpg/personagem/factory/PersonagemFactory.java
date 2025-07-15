package br.edu.ifpb.ads.padroes.atv1.rpg.personagem.factory;

import br.edu.ifpb.ads.padroes.atv1.rpg.model.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.model.Armadura;

import java.util.Map;

public interface PersonagemFactory {
     Arma criarArma();
     Armadura criarArmadura();
     String[] criarHabilidades();
     Map<String, Integer> criarAtributos();

     String getClasse();
     String getRaca();
}
