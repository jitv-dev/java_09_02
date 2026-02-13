import java.util.Scanner;

public class Alumnos {
    /**
     * atributos: nombre y edad
     * construtor: carga datos
     * 2 metodos : imprimir - es mayo o menos de edad
     * main
     */

    private Scanner teclado;
    private String nombre;
    private int edad;

    public Alumnos(){
        teclado = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        nombre = teclado.next();
        System.out.println("Ingrese su edad");
        edad = teclado.nextInt();
    }

    public void imprimir(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    public void mayorEdad(){
        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
    }

    public static void main(String[] args) {
        Alumnos alumn1 = new Alumnos();
        alumn1.imprimir();
        alumn1.mayorEdad();
    }
}
