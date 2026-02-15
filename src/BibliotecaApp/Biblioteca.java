package BibliotecaApp;

public class Biblioteca {
    // Atributos: libro1, libro2, libro3 (objetos de tipo Libro)
    private Libro[] libros;

    // Constructor: crea 3 libros con títulos y autores a tu elección
    public Biblioteca(){
        libros = new Libro[3];
        libros[0] = new Libro("Condorito", "Pepo");
        libros[1] = new Libro("Papelucho", "Marcela Paz");
        libros[2] = new Libro("Lord of the mysteries" , "Cuttlefish");
    }

    // listarLibros(): muestra todos los libros
    public void listarLibros(){
        System.out.println("Todos los libros");
        for (int i = 0; i < libros.length; i++) {
            libros[i].imprimir();
        }
    }

    // prestarLibro(int numeroLibro): presta el libro 1, 2 o 3
    // -1 usado para no pensar que el libro 3 corresponde al 3 en la lista, cuando en verdad seria el 4 por indice
    public void prestarLibro(int numeroLibro){
        libros[numeroLibro - 1].prestar();
    }

    // devolverLibro(int numeroLibro): devuelve el libro
    public void devolverLibro(int numeroLibro){
        libros[numeroLibro - 1].devolver();
    }

    // cantidadPrestados(): cuenta cuántos libros están prestados
    public void cantidadPrestados(){
        int contador = 0;
        for (int i = 0; i < libros.length; i++) {
            if (libros[i].estaPrestado()){
                contador++;
            }
        }
        if (contador == 1) {
            System.out.println("Hay un total de " + contador + " libro prestado");
        } else if (contador == 0) {
            System.out.println("No hay libros prestados");
        } else {
            System.out.println("Hay un total de " + contador + " libros prestados");
        }
    }

    // main: crea biblioteca, presta algunos libros, muestra estado
    public static void main(String[] args) {
        Biblioteca biblioteca1 = new Biblioteca();
        biblioteca1.prestarLibro(2);
        biblioteca1.devolverLibro(2);
        biblioteca1.cantidadPrestados();
        biblioteca1.prestarLibro(1);
        biblioteca1.cantidadPrestados();
    }
}
