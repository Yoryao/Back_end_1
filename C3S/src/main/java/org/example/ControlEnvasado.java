package org.example;

public class ControlEnvasado extends AnalistaDeCalidad{
    @Override
    public String compruebaCalidad(Articulo articulo) {
        if(articulo.envasado.equalsIgnoreCase("Sano") || articulo.envasado.equalsIgnoreCase("Casi sano")) {
            System.out.println("Envase Ok. Pasa a siguiente Control.");
            return "Paso todos los Controles.";

        } else {
            return "No paso el control se descarta.";
        }

    }
}
