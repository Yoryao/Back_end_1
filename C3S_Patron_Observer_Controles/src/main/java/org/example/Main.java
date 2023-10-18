package org.example;
public class Main {
    public static void main(String[] args) {

        AnalistaDeCalidad lote = new ControlLote();
        AnalistaDeCalidad peso = new ControlPeso();
        AnalistaDeCalidad enva = new ControlEnvasado();

        peso.setSigControl(enva);
        lote.setSigControl(peso);

        Articulo art1 = new Articulo("Vaso", 900, 1250, "Sano");
        Articulo art2 = new Articulo("Copa", 1100, 150, "Sano");
        Articulo art3 = new Articulo("Plato", 1100, 1201, "Roto");
        Articulo art4 = new Articulo("Taza", 1150, 1250, "Sano");

        System.out.println("Control de la .... Vaso");
        lote.compruebaCalidad(art1);
        System.out.println("Control de la .... Copa");
        lote.compruebaCalidad(art2);
        System.out.println("Control de la ....Plato");
        lote.compruebaCalidad(art3);
        System.out.println("Control de la ....Taza");
        lote.compruebaCalidad(art4);




    }
}