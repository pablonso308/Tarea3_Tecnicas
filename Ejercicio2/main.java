package Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Ejercicio2 recomendaciones = new Ejercicio2();
        usuario usuarioactual = getusuarioactual();
        List<libro> recomendacion = recomendaciones.librorecomendado(usuarioactual);
        System.out.println("recomendacion: " + recomendacion);
    }


    private static usuario getusuarioactual() {
        return new usuario();
    }


}