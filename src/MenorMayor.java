import java.util.Arrays;
import java.util.Scanner;

public class MenorMayor {
    private Scanner teclado;
    private int[] numeros;
    private int cantidadNumeros;

    public void inicializar(){
        teclado = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros a ordenar");
        cantidadNumeros = teclado.nextInt();
        numeros = new int[cantidadNumeros];

        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.println("Ingrese su numero " + (i+1) + " de " + cantidadNumeros);
            numeros[i] = teclado.nextInt();
        }
    }

    public void menorMayor(){
        Arrays.sort(numeros);

        int menor = numeros[0];
        int mayor = numeros[numeros.length-1];

        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El numero menor es: " + menor);
    }

    public static void main(String[] args) {
        MenorMayor intento1;
        intento1 = new MenorMayor();
        intento1.inicializar();
        intento1.menorMayor();
    }
}
