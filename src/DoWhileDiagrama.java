import java.util.Scanner;

public class DoWhileDiagrama {
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        float peso;
        int cant1, cant2, cant3, suma;
        cant1 = 0;
        cant2 = 0;
        cant3 = 0;

        do {
            System.out.print("Ingrese peso: ");
            peso = teclado.nextFloat();
            if (peso > 10.2) {
                cant1 += 1;
            } else if (peso >= 9.2) {
                cant2 += 1;
            } else if (peso > 0) {
                cant3 += 1;
            }
        } while (peso != 0);

        suma = cant1+cant2+cant3;
        System.out.println("Cantidad > 10.2: " + cant1);
        System.out.println("Cantidad 9.2-10.2: " + cant2);
        System.out.println("Cantidad < 9.2: " + cant3);
        System.out.println("Total: " + suma);
    }
}
