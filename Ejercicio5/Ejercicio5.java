package Ejercicio5;

import java.util.ArrayList;
import java.util.List;
public class Ejercicio5 {
    public static rendimiento obtenerRendimiento(aplicacion aplicacion) {
        // Lógica para obtener el rendimiento de la aplicación (simulación)
        double cpu = Math.random() * 100;
        double memoria = Math.random() * 100;
        return new rendimiento(cpu, memoria);
    }

    public static void monitorearAplicacion(aplicacion aplicacion) {
        rendimiento rendimiento = obtenerRendimiento(aplicacion);
        System.out.println("Aplicación: " + aplicacion.nombre + " - CPU: " + rendimiento.cpu + " - Memoria: " + rendimiento.memoria);
    }

    public static List<aplicacion> obtenerAplicaciones() {
        // Lógica para obtener la lista de aplicaciones (simulación)
        List<aplicacion> listaDeAplicaciones = new ArrayList<>();
        listaDeAplicaciones.add(new aplicacion("App1"));
        listaDeAplicaciones.add(new aplicacion("App2"));
        listaDeAplicaciones.add(new aplicacion("App3"));
        return listaDeAplicaciones;
    }


    public static void main(String[] args) {
        List<aplicacion> aplicaciones = obtenerAplicaciones();

        for (aplicacion app : aplicaciones) {
            monitorearAplicacion(app);
        }
    }
}

