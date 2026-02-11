import java.util.Scanner;

public class CompararApellido {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String apellido1, apellido2;

        System.out.println("Ingrese el primer apellido");
        apellido1 = teclado.next();

        System.out.println("Ingrese el segundo apellido");
        apellido2 = teclado.next();

//        if (apellido1.equalsIgnoreCase(apellido2)) {
        if (apellido1.toLowerCase().equals(apellido2.toLowerCase())) {
            System.out.println("Tienen el mismo apellido");
        } else {
            System.out.println("Tienen distinto apellido, " + apellido1 + " es disntito a " + apellido2);
        }
    }
}
