package TiendaProductos;

import java.util.Scanner;

public class Tienda {
    // Atributos: array de productos (size 5), Scanner
    Scanner teclado;
    private Producto[] productos;

    // Constructor: pide datos de 5 productos al usuario
    public Tienda(){
        teclado = new Scanner(System.in);
        productos = new Producto[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese nombre de producto");
            String nombre = teclado.nextLine();

            System.out.println("Ingrese precio:");
            float precio = teclado.nextFloat();

            System.out.println("Ingrese stock:");
            int stock = teclado.nextInt();
            teclado.nextLine(); // La IA me dijo que agregara esto para limpiar el buffer

            productos[i] = new Producto(nombre, precio, stock);
        }
    }

    // listarProductos(): muestra todos
    public void listarProductos(){
        System.out.println("Todos los productos");
        for (int i = 0; i < productos.length; i++) {
            productos[i].imprimir();
        }
    }

    // productoMasCaro(): encuentra y muestra el más caro
    public void productoMasCaro(){
        float productoPrecio = productos[0].getPrecio();
        int indiceActual = 0;

        for (int i = 1; i < productos.length ; i++) {
            if (productos[i].getPrecio() > productoPrecio){
                productoPrecio = productos[i].getPrecio();
                indiceActual = i;
            }
        }
        System.out.println("Producto mas caro");
        productos[indiceActual].imprimir();
    }

    // productosSinStock(): cuenta cuántos tienen stock 0
    public void productosSinStock(){
        int contador = 0;
        System.out.println("Productos sin stock");

        for (int i = 0; i < productos.length; i++) {
            if (!productos[i].hayStock()) {
                productos[i].imprimir();
                contador ++;
            }
        }
        System.out.println("Hay un total de " + contador + " productos sin stock");
    }

    // main: crea tienda y ejecuta operaciones
    public static void main(String[] args) {
        Tienda tienda1 = new Tienda();
        tienda1.listarProductos();
        tienda1.productoMasCaro();
        tienda1.productosSinStock();
    }
}