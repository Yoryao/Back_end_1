package org.example;

public class ControlPeso extends AnalistaDeCalidad{
    @Override
    public void compruebaCalidad(Articulo articulo) {
        if(articulo.peso > 1200 && articulo.peso < 1300) {
            System.out.println("Peso Ok. Pasa a siguiente Control.");
            if(getSigControl() != null){
                getSigControl().compruebaCalidad(articulo);
            } else {
                System.out.println("Aprobo todos los controles. ");
            }

        } else {
            System.out.println("No paso el control de Peso, se descarta.");
        }

    }
}
