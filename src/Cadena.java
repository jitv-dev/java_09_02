import java.util.Scanner;

public class Cadena {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cadena1;
        String cadena2;
        System.out.println("Ingrese la primera cadena");
        cadena1 = teclado.nextLine();
        System.out.println("Ingrese la segunda cadena");
        cadena2 = teclado.nextLine();

        System.out.println("-- Ejemplo equals --");
        if (cadena1.equals(cadena2) == true) {
            System.out.println(cadena1 + " es igual a " + cadena2);
        } else {
            System.out.println(cadena1 + " NO es igual a " + cadena2);
        }

        System.out.println("-- Ejemplo equalsIgnoreCase --");
        if (cadena1.equalsIgnoreCase(cadena2) == true) {
            System.out.println(cadena1 + " es igual a " + cadena2);
        } else {
            System.out.println(cadena1 + " NO es igual a " + cadena2);
        }

        System.out.println("-- Ejemplo compareTo --");
        if (cadena1.compareTo(cadena2) == 0) {
            System.out.println(cadena1 + " es EXACTAMENTE igual a " + cadena2);
        } else if (cadena1.compareTo(cadena2) > 0){
            System.out.println(cadena1 + " es MAYOR ALFABETICAMENTE que " + cadena2);
        } else {
            System.out.println(cadena2 + " es MAYOR ALFABETICAMENTE que " + cadena1);
        }

        char caract1 = cadena1.charAt(0);
        System.out.println("El primer caracter de " + cadena1 + " es " + caract1);

        int largo1 = cadena1.length();
        System.out.println("El cantidad de letras de " + cadena1 + " es " + largo1);

        String cadena3 = cadena1.substring(0, 3);
        System.out.println("Los primeros 3 caractedes de " + cadena1 + " son " + cadena3);

        int posicion = cadena1.indexOf(cadena2);
        if (posicion == -1) {
            System.out.println(cadena2 + " no esta contenido en " + cadena1);
        } else {
            System.out.println(cadena2 + " no esta contenido en " + cadena1 + " a partir de la posicion " + posicion);
        }

        System.out.println(cadena1 + " convertido a mayusculas es " + cadena1.toUpperCase());
        System.out.println(cadena1 + " convertido a minuscula es " + cadena1.toLowerCase());
    }
}
