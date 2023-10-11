package com.backend.clase.service;

import com.backend.clase.model.Empleado;

public abstract class LiquidadorSueldo {

    public String liquidarSueldo(Empleado empleado){
        String respuesta = "No se pudo liquidar el sueldo.";

        //calcularSueldo
        double sueldo = calcularSueldo(empleado);

        //generarRecibo
        if(sueldo > 0 ) {
            String recibo = generarRecibo(empleado);
            respuesta = recibo + ". Sueldo: " + sueldo;
            //depositar
            System.out.println(depositar(empleado));
        }

        return respuesta;
    }

    protected abstract double calcularSueldo(Empleado empleado);
    protected abstract String generarRecibo(Empleado empleado);
    private String depositar(Empleado empleado){
        String respuesta = "Se deposito el Sueldo a " + empleado.getNombre();
        return respuesta;
    };




}
