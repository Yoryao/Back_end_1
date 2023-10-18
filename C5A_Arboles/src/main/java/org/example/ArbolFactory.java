package org.example;



import java.util.HashMap;
import java.util.Map;

public class ArbolFactory {


    public static int contador;

    //private static final Map<String, Arbol> arbolesMap = new HashMap<>();

    public static Arbol getArbol(String tipo) {
        String key = tipo;
        //obtengo el arbol que necesito del hashMap
        if (!Bosque.arbolesMap.containsKey(tipo)) {
            Arbol arbol = new Arbol(tipo);
            Bosque.arbolesMap.put(tipo, arbol);
            System.out.println("Arbol creado de tipo: " + tipo);
            contador++;
            System.out.println("Total Arboles: " + contador);

        } else {
            System.out.println("Ya hemos plantado arbol de ese tipo.");
            contador++;
            System.out.println("Total Arboles: " + contador);
        }



    return Bosque.arbolesMap.get(tipo);

    }


}
