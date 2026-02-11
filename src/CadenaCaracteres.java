import java.util.Scanner;

public class CadenaCaracteres {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Variables
        String nombre1, nombre2;
        int edad1, edad2;

        System.out.println("Ingrese el primer nombre");
        nombre1 = teclado.next();
        System.out.println("Ingrese edad");
        edad1 = teclado.nextInt();

        System.out.println("Ingrese el segundo nombre");
        nombre2 = teclado.next();
        System.out.println("Ingrese edad");
        edad2 = teclado.nextInt();

        System.out.println("La persona mayor de edad es: ");
        if (edad1 > edad2) {
            System.out.println(nombre1);
        } else {
            System.out.println(nombre2);
        }
    }
}
