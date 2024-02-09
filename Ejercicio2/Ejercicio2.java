package Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {
    public List<libro> librorecomendado(usuario usuario) {
        List<libro> interestingBooks = getlibrosinteresantes(usuario);
        List<valoracion> ratings = getvaloracion(usuario);
        List<libro> recomendaciones = new ArrayList<>();

        for (libro libro : interestingBooks) {
            if (!valorado(libro, ratings)) {
                recomendaciones.add(libro);
            }
        }
        return recomendaciones;
    }

    private List<libro> getlibrosinteresantes(usuario usuario) {

        return new ArrayList<>();
    }

    private List<valoracion> getvaloracion(usuario usuario) {

        return new ArrayList<>();
    }

    private boolean valorado(libro libro, List<valoracion> valoraciones) {


        return false;
    }


}