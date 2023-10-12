package org.example;

public class ControlLote extends AnalistaDeCalidad{
    @Override
    public void compruebaCalidad(Articulo articulo) {
        if(articulo.lote > 1000 && articulo.lote < 2000) {
            System.out.println("Lote Ok. Pasa a siguiente Control.");
            if(getSigControl() != null){
                getSigControl().compruebaCalidad(articulo);
            } else {
                System.out.println("Aprobo todos los controles. ");
            }

        } else {
            System.out.println("No paso el control de Lote, se descarta.");
        }

    }
}
