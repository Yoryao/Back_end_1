package org.example;

public class Arbol {
    private String tipo;
    private int alto;
    private int ancho;
    private String color;

    public Arbol() {
    }

    public Arbol(String tipo) {
        this.tipo = tipo;
    }

    public Arbol(int alto, int ancho, String tipo, String color) {
        this.alto = alto;
        this.ancho = ancho;
        this.tipo = tipo;
        this.color = color;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        ancho = ancho;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
