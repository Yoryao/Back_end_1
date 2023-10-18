import java.util.HashMap;
import java.util.List;

public class ListaReproduccion {
    private String nombre;
    public List<Cancion> canciones;


    public void agregarCancion(Cancion cancion){
        canciones.add(1,
                cancion);
    }

    public List<Cancion> getCanciones() {
        return canciones;
    }



    public ListaReproduccion(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
