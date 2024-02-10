package Ejercicio4;

public class juego {

    public static void jugarNivel(nivel nivel, jugador jugador) {
        System.out.println("Nivel de dificultad: " + nivel.getdificulatad());

        for (desafio desafio : nivel.getdesafio()) {
            boolean resultado = jugador.resolverdesafio(desafio);
            System.out.println("Desafío: " + desafio.getdescripcion() + " - Resultado: " + resultado);
        }
    }
}
