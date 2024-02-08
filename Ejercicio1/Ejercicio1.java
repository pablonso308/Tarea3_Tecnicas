package Ejercicio1;

public class Ejercicio1 {
    private static final double UMBRAL_POSITIVO = 0.5;
    private static final double UMBRAL_NEGATIVO = -0.5;

    public static String analizarSentimiento(String texto) {
        double sentimiento = analizarTexto(texto);
        if (sentimiento > UMBRAL_POSITIVO) {
            return "positivo";
        }
        if (sentimiento < UMBRAL_NEGATIVO) {
            return "negativo";
        }
        return "neutral";
    }
    public static void main(String[] args) {
        Publicacion[] redSocial = obtenerPublicaciones();
        for (Publicacion publicacion : redSocial) {
            String sentimiento = analizarSentimiento(publicacion.getTexto());
            System.out.println("Publicación: " + publicacion.getTexto() + " - Sentimiento: " + sentimiento);
        }
    }
}