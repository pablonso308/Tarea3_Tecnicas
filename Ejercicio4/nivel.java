package Ejercicio4;

import java.util.ArrayList;



public class nivel {
    private int dificultad;
    private ArrayList<desafio> desafio;
    public nivel(int dificultad, ArrayList<desafio> desafio) {
        this.dificultad = dificultad;
        this.desafio = desafio;
    }
    public int getdificulatad() {
        return dificultad;
    }
public ArrayList<desafio> getdesafio() {
        return desafio;
}


}
