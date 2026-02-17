package Herencias;

import java.util.Scanner;

public class Persona {
    // Protected permite que los datos sean usados en el package y las clases asociadas a este
    // Se usa generalmente en herencias
    protected static Scanner teclado = new Scanner(System.in);
    protected String nombre;
    protected int edad;

    public Persona(String n, int ed){
        this.nombre = n;
        this.edad = ed;
    }

    // Constructor vacio permite crear objetos sin necesidad de pasar datos de forma inmediata
    public Persona(){
    }

    public void cargarDatosPersonales(){
        System.out.println("Ingrese nombre: ");
        nombre = teclado.next();
        System.out.println("Ingrese edad: ");
        edad = teclado.nextInt();
    }

    public void imprimirDatosPersonales(){
        System.out.println("Nombre: " + nombre + " | Edad: " + edad);
    }
}
