package com.backend.clase.service;

import com.backend.clase.model.Empleado;
import com.backend.clase.model.EmpleadoEfectivo;

public class LiquidarEfectivo extends LiquidadorSueldo {
    @Override
    protected double calcularSueldo(Empleado empleado) {
        double sueldo = 0;

        if(empleado instanceof EmpleadoEfectivo empleadoEfectivo){
            sueldo = empleadoEfectivo.getSueldoBasico() * empleadoEfectivo.getPremios() - empleadoEfectivo.getDescuentos() ;
        }

        return sueldo;
    }

    @Override
    protected String generarRecibo(Empleado empleado) {
        return "Recibo generado en formato digital.";
    }
}
