package Ejercicio4;

import java.util.ArrayList;

public class Ejercicio4 {
    public static void main(String[] args) {
        desafio loop = new desafio("Implementa un bucle");
        desafio condicional = new desafio("Añade una estructura condicional");

        ArrayList<desafio> desafiosNivel1 = new ArrayList<>();
        desafiosNivel1.add(loop);
        desafiosNivel1.add(condicional);

        nivel nivel = new nivel(1, desafiosNivel1);

        jugador jugador = new jugador();

        desafio nuevoDesafio = jugador.crearDesafio();
        boolean resultadoNuevoDesafio = jugador.resolverdesafio(nuevoDesafio);
        System.out.println("Nuevo desafío: " + nuevoDesafio.getdescripcion() + " - Resultado: " + resultadoNuevoDesafio);

        jugarnivel(jugador, nivel);
    }

    public static void jugarnivel(jugador jugador, nivel nivel) {
        System.out.println("Nivel de dificultad: " + nivel.getdificulatad());

        for (desafio desafio : nivel.getdesafio()) {
            boolean resultado = jugador.resolverdesafio(desafio);
            System.out.println("Desafío: " + desafio.getdescripcion() + " - Resultado: " + resultado);
        }
    }





}






