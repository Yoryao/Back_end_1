import java.util.HashMap;

public class CancionFactory {

    public static final HashMap<String, Cancion> listaMap = new HashMap<>();

    public static Cancion getCancion(String nombre, String artista, String genero) {

        String key = "Key:"+nombre+artista;

        if(!listaMap.containsKey(key)){
            Cancion cancion = new Cancion(nombre, artista, genero);
            System.out.println("Se creo la canción: " + nombre);
            listaMap.put(key, cancion);
        } else System.out.println("La canción: '" + listaMap.get(key).getNombre() + "' ya existia");

        return listaMap.get(key);
    }
}
