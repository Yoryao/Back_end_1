package com.backend.clase;

import com.backend.clase.model.Empleado;
import com.backend.clase.model.EmpleadoContratado;
import com.backend.clase.model.EmpleadoEfectivo;
import com.backend.clase.service.LiquidadorSueldo;
import com.backend.clase.service.LiquidarContratado;
import com.backend.clase.service.LiquidarEfectivo;

public class Main {
    public static void main(String[] args) {

        Empleado emp1 = new EmpleadoEfectivo("jorge", "Rivera", "CA1", 10000, 2000, 1000);
        Empleado emp2 = new EmpleadoContratado("Juan", "Perez", "CA2", 134, 1300);
        Empleado emp3 = new EmpleadoEfectivo("john", "Ria", "CA", 100, 2000, 1000);

        LiquidarEfectivo liqEfec = new LiquidarEfectivo();
        LiquidarContratado liqCont = new LiquidarContratado();

        System.out.println("Efec-Efec");
        liqEfec.liquidarSueldo(emp1);
        System.out.println("Cont-Cont");
        liqCont.liquidarSueldo(emp2);
        System.out.println("Cont-Efec");
        liqCont.liquidarSueldo(emp3);




    }
}