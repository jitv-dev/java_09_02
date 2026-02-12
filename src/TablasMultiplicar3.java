import java.util.Scanner;

public class TablasMultiplicar3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, calculo;

        while(true){
            System.out.println("Ingrese valor");
            numero = teclado.nextInt();
            if (numero == -1) break;
            for (int i = 1; i <= 10; i++) {
                calculo = numero * i;
                System.out.println(numero + " x " + i + " = " + calculo);
            }
        }
    }
}
