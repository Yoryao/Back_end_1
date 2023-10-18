package com.backend.clase.service;

import com.backend.clase.model.Empleado;
import com.backend.clase.model.EmpleadoContratado;

public class LiquidarContratado extends LiquidadorSueldo {


    @Override
    protected double calcularSueldo(Empleado empleado) {
        double sueldo = 0;

        if (empleado instanceof EmpleadoContratado empleadoContratado) {
            sueldo = empleadoContratado.getCantHoras() * empleadoContratado.getValorHora();
        } else {
            System.out.println("No es un Empleado valido.");
        }

        return sueldo;
    }

    @Override
    protected String generarRecibo(Empleado empleado) {
        return "Recibo Impreso";
    }
}
