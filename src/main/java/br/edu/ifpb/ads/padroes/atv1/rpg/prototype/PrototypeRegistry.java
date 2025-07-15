package br.edu.ifpb.ads.padroes.atv1.rpg.prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeRegistry {
    private static Map<PrototypeTypes, Prototype> prototipos = new HashMap<>();

    public static void register(PrototypeTypes chave, Prototype prototipo) {
        prototipos.put(chave, prototipo);
    }

    public static Prototype get(PrototypeTypes chave) {
        Prototype prototipo = prototipos.get(chave);
        if (prototipo == null) {
            throw new IllegalArgumentException("Protótipo de " + chave + " não encontrado!");
        }

        return prototipo.clone();
    }
}
