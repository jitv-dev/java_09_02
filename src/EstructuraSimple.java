import java.util.Scanner;

public class EstructuraSimple {
    //Pago de impuestos
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float sueldo;
        System.out.println("Ingrese su sueldo: ");
        sueldo = teclado.nextFloat();
        if (sueldo > 4000) {
            System.out.println("Debe pagar impuestos");
        }
    }
}
