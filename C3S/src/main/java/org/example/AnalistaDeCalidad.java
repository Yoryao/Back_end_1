package org.example;

public abstract class AnalistaDeCalidad {
    private AnalistaDeCalidad sigControl;

    public AnalistaDeCalidad() {
    }

    public abstract void compruebaCalidad(Articulo articulo);

    public AnalistaDeCalidad getSigControl() {
        return sigControl;
    }

    public void setSigControl(AnalistaDeCalidad sigControl) {
        this.sigControl = sigControl;
    }
}
