package Ejercicio2;

public class usuario {
    private String nombre;

    private String id;

    public usuario(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getId() {
        return this.id;
    }
}
