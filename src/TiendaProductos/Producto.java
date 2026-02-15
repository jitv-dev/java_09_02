package TiendaProductos;

public class Producto {
    // Atributos: nombre, precio, stock
    private String nombre;
    private float precio;
    private int stock;

    // Constructor: recibe nombre, precio y stock inicial
    public Producto(String name, float price, int stockInicial){
        nombre = name;
        precio = price;
        stock = stockInicial;
    }

    // vender(int cantidad): reduce el stock
    public void vender(int cantidad){
        stock = stock - cantidad;
    }

    // reponer(int cantidad): aumenta el stock
    public void reponer(int cantidad){
        stock = stock + cantidad;
    }

    // hayStock(): retorna true si stock > 0
    public boolean hayStock(){
        return stock > 0;
    }

    public float getPrecio(){
        return precio;
    }


    // imprimir(): muestra datos del producto
    public void imprimir(){
        System.out.println("Nombre: " + nombre + " | " + "Precio: " + precio + " | " + "Stock: " + stock);
    }
}