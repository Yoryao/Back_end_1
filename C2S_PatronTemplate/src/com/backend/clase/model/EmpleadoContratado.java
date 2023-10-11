package com.backend.clase.model;

import com.backend.clase.model.Empleado;

public class EmpleadoContratado extends Empleado {
    private double cantHoras;
    private double valorHora;

    public EmpleadoContratado(String nombre, String apellido, String numeroCuenta) {
        super(nombre, apellido, numeroCuenta);
    }


    public double getCantHoras() {
        return cantHoras;
    }

    public void setCantHoras(double cantHoras) {
        this.cantHoras = cantHoras;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
}
