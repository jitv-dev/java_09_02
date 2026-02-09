import java.util.Scanner;

public class ErrorSintaxis {
    // calcular la superficie de un cuadrado
    public static void main (String[] args){
        // El usuario ingresa informacion
        Scanner teclado = new Scanner(System.in);
        // Variables
        int lado;
        int superficie;

        // Solicitd al usuario que ingrese los datos
        // Si este fuera system en minuscula arrojaria error
        System.out.println("Ingrese el valor del lado del cuadrado: ");
        lado = teclado.nextInt();
        superficie = lado * lado;
        System.out.println("La superficie del cuadrado es: ");
        System.out.println(superficie);
    }
}

// Error de sintaxis es no respetar CamelCase o hacer calculos errados