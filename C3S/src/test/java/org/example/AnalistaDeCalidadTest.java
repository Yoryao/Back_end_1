//package org.example;
//
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class AnalistaDeCalidadTest {
//    private AnalistaDeCalidad analistaDeCalidad;
//    @Test
//        void verificarAnalistaCalidad(){
//            //arrange
//            AnalistaDeCalidad lote = new ControlLote();
//            AnalistaDeCalidad peso = new ControlPeso();
//            AnalistaDeCalidad enva = new ControlEnvasado();
//            peso.setSigControl(enva);
//            lote.setSigControl(peso);
//
//            //arrange articulos
//                Articulo art1 = new Articulo("Vaso", 900, 1250, "Sano");
//                Articulo art2 = new Articulo("Copa", 1100, 150, "Sano");
//                Articulo art3 = new Articulo("Plato", 1100, 1201, "Roto");
//                Articulo art4 = new Articulo("Taza", 1150, 1250, "Sano");
//
//        //act
//        String rtaEsperada1 = "No paso el control se descarta.";
//        String rtaEsperada2 = "No paso el control se descarta.";
//        String rtaEsperada3 = "No paso el control se descarta.";
//        String rtaEsperada4 = "Aprobo todos los controles. ";
//
//        String rta1 = lote.compruebaCalidad(art1);
//        String rta2 = lote.compruebaCalidad(art2);
//        String rta3 = lote.compruebaCalidad(art3);
//        String rta4 = lote.compruebaCalidad(art4);
//
//        //assert
//        assertEquals(rtaEsperada1, rta1);
//        assertEquals(rtaEsperada2, rta2);
//        assertEquals(rtaEsperada3, rta3);
//        assertEquals(rtaEsperada4, rta4);
//
//        }
//    }
