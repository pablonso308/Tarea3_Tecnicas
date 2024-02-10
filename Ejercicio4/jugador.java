package Ejercicio4;

import java.util.Scanner;

public class jugador {
    private Scanner scanner;

    public jugador() {
        scanner = new Scanner(System.in);
    }

    public boolean resolverdesafio(desafio desafio) { System.out.println("Resolviendo desafío: " + desafio.getdescripcion());
        System.out.print("¿El desafío se resuelve correctamente? (true/false): ");
        return scanner.nextBoolean();
    }

    public desafio crearDesafio() {
        System.out.print("Ingrese la descripción del nuevo desafío: ");
        String descripcion = scanner.next();
        return new desafio(descripcion);
    }
}
