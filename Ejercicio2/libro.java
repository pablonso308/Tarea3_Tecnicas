package Ejercicio2;

public class libro {
    private String Titulo;
    private String Autor;
    private String id;

    public libro(String Titulo, String Autor, String id) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.id = id;
    }

    public String getTitulo(){

            return this.Titulo;
        }

        public String getAutor(){

            return this.Autor;
        }

        public String getId(){

            return this.id;
        }

}
