package org.example;


public class Main {
    public static void main(String[] args) {

        final ComidaFactory comida = new ComidaFactory();

        Comida pastaVerdura = comida.getComida("Pastas");
        pastaVerdura.setPrecio(10000);

        final Comida pastaCarne = comida.getComida("Pastas");
        final Comida carne = comida.getComida("Carne");
        System.out.println(pastaCarne.descripcionDeLaComida());

    }
}