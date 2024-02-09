package Ejercicio1;

public class Ejercicio1 {
    public static String analizarSentimiento(String texto) {
        double sentimiento = analizarTexto(texto);
        double UMBRAL_POSITIVO = 0.5;
        double UMBRAL_NEGATIVO = -0.5;



        if (sentimiento > UMBRAL_POSITIVO) {
            return "positivo";
        }
        if (sentimiento < UMBRAL_NEGATIVO) {
            return "negativo";
        }
        return "neutral";
    }

    private static double analizarTexto(String texto) {
        // Aquí puedes utilizar una biblioteca de análisis de sentimientos o implementar tu propia lógica
        // para calcular el sentimiento del texto. Este es solo un ejemplo ficticio.
        // Puedes usar bibliotecas como Stanford NLP, Apache OpenNLP, etc.
        return Math.random(); // Valor de sentimiento aleatorio (sustituir con tu implementación real)
    }


    public static void main(String[] args) {
        Publicacion[] Publicacion = new Publicacion[] {
            new Publicacion("Me encanta el nuevo iPhone"),
            new Publicacion("Odio el tráfico de la ciudad"),
            new Publicacion("Hoy es un día soleado")
        };
        for (Publicacion publicacion : Publicacion) {
            String sentimiento = analizarSentimiento(publicacion.getTexto());
            System.out.println("Publicación: " + publicacion.getTexto() + " - Sentimiento: " + sentimiento);
        }
    }
}