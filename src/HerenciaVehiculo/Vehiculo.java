package HerenciaVehiculo;

import java.util.Scanner;

public class Vehiculo {
    protected static Scanner teclado = new Scanner(System.in);
    protected String marca;
    protected String modelo;
    protected int anio;
    protected double precio;

    public Vehiculo(String marca, String modelo, int anio, double precio){
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precio = precio;
    }

    public Vehiculo(){

    }

    public void cargarDatos(){
        System.out.println("Ingrese marca:");
        marca = teclado.next();
        System.out.println("Ingrese modelo:");
        modelo = teclado.next();
        System.out.println("Ingrese año:");
        anio = teclado.nextInt();
        System.out.printf("Ingrese precio:");
        precio = teclado.nextDouble();
    }

    public void mostrarDatos(){
        System.out.println("Vehículo");
        System.out.println("Marca: " + marca + " | Modelo: " + modelo + " | Año: " + anio + " | Precio: " + precio);
    }
}
