package Ejercicio2;

public class valoracion {
    private usuario usuario;

    private libro libro;

    private int puntuacion;

public valoracion(usuario usuario, libro libro ){
    this.usuario = usuario;
    this.libro = libro;
    this.puntuacion = 0;
}


public usuario getUsuario() {
    return this.usuario;
}

public libro getLibro() {
    return this.libro;
}

public int getPuntuacion() {
    return this.puntuacion;
}
}
