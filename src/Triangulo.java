import java.util.Scanner;

public class Triangulo {
    private Scanner teclado;
    private int lado1, lado2, lado3;

    public void inicializar(){
        teclado = new Scanner(System.in);
        System.out.println("Ingrese el valor del primer lado");
        lado1 = teclado.nextInt();
        System.out.println("Ingrese el valor del segundo lado");
        lado2 = teclado.nextInt();
        System.out.println("Ingrese el valor del tercer lado");
        lado3 = teclado.nextInt();
    }

    public void imprimir(){
        if (lado1 > lado2 && lado1 > lado3) {
            System.out.println("El lado mayor es: " + lado1);
        } else if (lado2 > lado3) {
            System.out.println("El lado mayor es: " + lado2);
        } else {
            System.out.println("El lado mayor es: " + lado3);
        }
    }

    public void tipoTriangulo(){
        if (lado1 == lado2 && lado1 == lado3) {
            System.out.println("El triangulo es equilatero");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("El triangulo es isosceles");
        } else {
            System.out.println("El triangulo es escaleno");
        }
    }

    public static void main(String[] args) {
        Triangulo triangulo1;
        triangulo1 = new Triangulo();
        triangulo1.inicializar();
        triangulo1.imprimir();
        triangulo1.tipoTriangulo();
    }
}
