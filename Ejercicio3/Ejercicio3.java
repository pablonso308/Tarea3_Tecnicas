package Ejercicio3;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Ejercicio3 {

    public static void main(String[] args) {
        int cantidadNodos = 10;
        List<nodo> nodos = new ArrayList<>();

        for (int i = 1; i <= cantidadNodos; i++) {
            nodos.add(new nodo(i));
        }

        double tasaDeTrafico = 0.5;
        simulacion.simularRed(nodos, tasaDeTrafico);
    }
}

class nodo {
    int id;
    double trafico;

    public nodo(int id) {
        this.id = id;
        this.trafico = 0.0;
    }
}

class red {
    List<nodo> nodos;

    public red(int cantidadNodos) {
        nodos = new ArrayList<>();
        for (int i = 1; i <= cantidadNodos; i++) {
            nodos.add(new nodo(i));
        }
    }
}

class simulacion {

    static void simularTrafico(nodo nodo, double tasaDeTrafico) {
        Random rand = new Random();
        double traficoGenerado = rand.nextDouble() * tasaDeTrafico;
        nodo.trafico = traficoGenerado;
    }

    static void simularRed(List<nodo> nodos, double tasaDeTrafico) {
        red red = new red(nodos.size());

        for (nodo nodo : nodos) {
            simularTrafico(nodo, tasaDeTrafico);
            System.out.println("Nodo: " + nodo.id + " - Tráfico: " + nodo.trafico);
        }
    }
}


