package com.backend.clase.Test;

import com.backend.clase.model.Empleado;
import com.backend.clase.model.EmpleadoEfectivo;
import com.backend.clase.service.LiquidadorSueldo;
import com.backend.clase.service.LiquidarEfectivo;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LiquidadorSueldoTest {

    private LiquidadorSueldo liquidadorSueldo;

    @Test
    public void liquidarEfectivo() {
        //arrange
        Empleado empleado = new EmpleadoEfectivo("Jorge", "Rivera", "CA - 15", 190000, 5000, 2000);
        liquidadorSueldo = new LiquidarEfectivo();


        //act
        String esperada = "Recibo. Sueldo: 187000.0";
        String obtenida = liquidadorSueldo.liquidarSueldo(empleado);

        //assert
        assertEquals(esperada, obtenida);
    }
}