package org.example;

import java.util.HashMap;
import java.util.HashSet;

public class ComidaFactory {
    private static final HashMap<String, Comida> comidaMap = new HashMap();

    public static Comida getComida(String tipoComida){
        Comida comida = (Comida) comidaMap.get(tipoComida);

        if(comida == null) {
            comida = new Comida(tipoComida);
            comidaMap.put(tipoComida, comida);
            System.out.println("Creando comida de tipo " + tipoComida);
        }
        return comida;
    }
}
