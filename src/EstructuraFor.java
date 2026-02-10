import java.util.Scanner;

public class EstructuraFor {
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);

        float acumulador = 0;

        for (int x = 1; x <= 10; x++) {
            System.out.print("Ingrese un número (" + x + "/10): ");
            acumulador += teclado.nextFloat();
        }

        float promedio = acumulador / 10;

        System.out.println("La suma total es: " + acumulador);
        System.out.println("El promedio es: " + promedio);

        teclado.close();
    }
}
