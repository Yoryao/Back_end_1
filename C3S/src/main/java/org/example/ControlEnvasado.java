package org.example;

public class ControlEnvasado extends AnalistaDeCalidad{
    @Override
    public void compruebaCalidad(Articulo articulo) {
        if(articulo.envasado.equalsIgnoreCase("Sano") || articulo.envasado.equalsIgnoreCase("Casi sano")) {
            System.out.println("Envase Ok. Pasa a siguiente Control.");
            if(getSigControl() != null){
                getSigControl().compruebaCalidad(articulo);
            } else {
                System.out.println("Aprobo todos los controles. ");
            }

        } else {
            System.out.println("No paso el control de Envase, se descarta.");
        }

    }
}
