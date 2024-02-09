package Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {
    public List<libro> recommendBooks(usuario usuario) {
        List<libro> interestingBooks = getInterestingBooks(usuario);
        List<valoracion> ratings = getvaloracion(usuario);
        List<libro> recommendations = new ArrayList<>();
}
