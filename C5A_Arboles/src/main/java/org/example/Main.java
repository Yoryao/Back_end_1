package org.example;


import org.junit.platform.commons.logging.Logger;

public class Main {
    public static void main(String[] args) {


        
        Arbol arbol1 = ArbolFactory.getArbol("Ornamentales");
        Arbol arbol2 = ArbolFactory.getArbol("Frutales");
        Arbol arbol3 = ArbolFactory.getArbol("Florales");
        Arbol arbol4 = ArbolFactory.getArbol("Ornamentales");
        Arbol arbol5 = ArbolFactory.getArbol("Ornamentales");
        Arbol arbol6 = ArbolFactory.getArbol("Florales");
        Arbol arbol11 = ArbolFactory.getArbol("Ornamentales");
        Arbol arbol12 = ArbolFactory.getArbol("Frutales");
        Arbol arbol13 = ArbolFactory.getArbol("Florales");
        Arbol arbol14 = ArbolFactory.getArbol("Ornamentales");
        Arbol arbol15 = ArbolFactory.getArbol("Ornamentales");
        Arbol arbol16 = ArbolFactory.getArbol("Florales");

    Runtime runtime = Runtime.getRuntime();
        System.out.println("Memoria Usada: " + (runtime.totalMemory() - runtime.freeMemory()) / (1024 * 1024 ));





    }
}