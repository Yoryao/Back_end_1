import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        final CancionFactory canciones = new CancionFactory();

        Cancion cancion = canciones.getCancion("Uno", "gardel", "tango");
        Cancion cancion2 = canciones.getCancion("Uno", "gardel", "tango");
        Cancion cancion3 = canciones.getCancion("dos", "gardel", "tango");

        ListaReproduccion tango = new ListaReproduccion("Tangos");



        }
    }
