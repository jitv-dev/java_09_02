import java.util.Scanner;

public class EstructuraWhile {
    // Mostrar por consola los numeros del 1 al 100
//    public static void main (String[] args){
//        int x;
//        x=1;
//        while (x <= 100) {
//            System.out.print(x + " - ");
//            x = x + 1;
//        }
//    }

    // While por teclado se ingresen 10 numeros, luego mostrar suma y promedio
//    public static void main (String[] args){
//        Scanner teclado = new Scanner(System.in);
//
//        int x;
//        float numIngresado, acumulador, promedio;
//        x = 1;
//        acumulador = 0;
//
//        while (x <= 10) {
//            System.out.println("Ingrese un número (" + x + "/10): ");
//            numIngresado = teclado.nextFloat();
//            acumulador = acumulador + numIngresado;
//            x = x + 1;
//        }
//
//        promedio = acumulador / 10;
//
//        System.out.println("La suma total es: " + acumulador);
//        System.out.println("El promedio es: " + promedio);
//    }

    // Numeros de empleados, sueldos entre 100 y 500
    // Informar empleados que cobren entre 100 y 300 || + de 300 || + de 400 || cuanto es el total que pagare
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);

        //Variables
        int empleados, cont1, cont2, cont3, x;
        float sueldo, gastos;
        x = 1;
        cont1 = 0;
        cont2 = 0;
        cont3 = 0;
        gastos = 0;

        System.out.println("Ingrese el numero de empleados: ");
        empleados = teclado.nextInt();

        while (x <= empleados) {
            System.out.println("Ingrese el sueldo del empleado: $");
            sueldo = teclado.nextFloat();
            if (sueldo <= 300){
                cont1 = cont1 + 1;
            } else if (sueldo > 300 && sueldo <= 400){
                cont2 = cont2 + 1;
            } else {
                cont3 = cont3 + 1;
            }
            gastos =  gastos + sueldo;
            x = x +1;
        }

        System.out.println("Cantidad de empleados con sueldos entre 100 y 300: " + cont1);
        System.out.println("Cantidad de empleados con sueldos entre 300 y 400: " + cont2);
        System.out.println("Cantidad de empleados con sueldos mayores a 400: " + cont3);
        System.out.println("Total a pagar: " + gastos);
    }
}
