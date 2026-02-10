import java.util.Scanner;

public class ForCreativo {
    /*
    Informacion:
    - Edades de 10 estudiantes jornada mañana
    - Edades de 15 estudiantes jornada tarde
    - Edades de 18 estudiantes jornada noche
    - Ingresar edades por teclado
    - 1. Obtener el promedio de las edades de cada jornada
    - 2. Imprimir promedio de cada jornada
    - 3. Imprimir un mensaje que indique cual de las 3 jornadas tiene un promedio de edad menor
     */
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);

        float suma1, suma2, suma3, prom1, prom2, prom3;
        suma1 = 0;
        suma2 = 0;
        suma3 = 0;

        // Jornada mañana
        for (int i = 1; i <= 10; i++){
            System.out.print("Ingrese edad estudiante (" + i + "/10): ");
            suma1 += teclado.nextFloat();
        }
        prom1 = suma1/10;
        System.out.println("El promedio de la jornada mañana es: " + prom1);

        // Jornada tarde
        for (int i = 1; i <= 15; i++){
            System.out.print("Ingrese edad estudiante (" + i + "/15): ");
            suma2 += teclado.nextFloat();
        }
        prom2 = suma2/15;
        System.out.println("El promedio de la jornada tarde es: " + prom2);

        // Jornada noche
        for (int i = 1; i <= 18; i++){
            System.out.print("Ingrese edad estudiante (" + i + "/18): ");
            suma3 += teclado.nextFloat();
        }
        prom3 = suma3/18;
        System.out.println("El promedio de la jornada noche es: " + prom3);

        if (prom1<prom2 && prom1<prom3) {
            System.out.println("El menor promedio de todas las jornadas es: " + prom1);
        } else if (prom2 < prom3){
            System.out.println("El menor promedio de todas las jornadas es: " + prom2);
        } else {
            System.out.println("El menor promedio de todas las jornadas es: " + prom3);
        }

        teclado.close();
    }
}
