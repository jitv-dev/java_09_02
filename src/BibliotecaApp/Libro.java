package BibliotecaApp;

public class Libro {
    // Atributos: titulo, autor, prestado (boolean)
    private String titulo;
    private String autor;
    private boolean prestado;

    // Constructor: recibe titulo y autor, prestado empieza en false
    public Libro(String title, String aut){
        titulo = title;
        autor = aut;
        prestado = false;
    }

    // prestar(): marca el libro como prestado
    public void prestar(){
        prestado = true;
        System.out.println("Libro " + titulo + " ha sido prestado");
    }

    // devolver(): marca el libro como disponible
    public void devolver(){
        prestado = false;
        System.out.println("Libro " + titulo + " devuelto a la biblioteca");
    }

    // imprimir(): muestra título, autor y si está prestado
    public void imprimir(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Prestado: " + prestado);
    }

    // estaPrestado(): retorna boolean
    public boolean estaPrestado(){
        return prestado;
    }
}
