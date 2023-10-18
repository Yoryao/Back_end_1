package org.example;

public class ControlPeso extends AnalistaDeCalidad{
    @Override
    public String compruebaCalidad(Articulo articulo) {
        if(articulo.peso > 1200 && articulo.peso < 1300) {
            System.out.println("Peso Ok. Pasa a siguiente Control.");
            return getSigControl().compruebaCalidad(articulo);

        } else {
            return "No paso el control se descarta.";
        }

    }
}
