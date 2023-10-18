package org.example;

public class ControlLote extends AnalistaDeCalidad{

    String respuesta = "";
    @Override
    public String compruebaCalidad(Articulo articulo) {
        if(articulo.lote > 1000 && articulo.lote < 2000) {
            System.out.println("Lote Ok. Pasa a siguiente Control.");
            return getSigControl().compruebaCalidad(articulo);

        } else {
            return "No paso el control se descarta.";
        }

    }
}
