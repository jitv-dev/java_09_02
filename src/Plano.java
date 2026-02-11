import java.util.Scanner;

public class Plano {
    private Scanner teclado;
    private int cordx, cordy;

    public void inicializar(){
        teclado = new Scanner(System.in);
        System.out.println("Ingrese el valor de x");
        cordx = teclado.nextInt();
        System.out.println("Ingrese el valor de y");
        cordy = teclado.nextInt();
    }
    
    public void imprimirCuadrante(){
        if (cordx > 0 && cordy >0){
            System.out.println("La coordenada (" + cordx + "," + cordy + ") se encuentra en el cuadrante 1");
        } else if (cordx < 0 && cordy > 0) {
            System.out.println("La coordenada (" + cordx + "," + cordy + ") se encuentra en el cuadrante 2");
        } else if (cordx < 0 && cordy < 0) {
            System.out.println("La coordenada (" + cordx + "," + cordy + ") se encuentra en el cuadrante 3");
        } else {
            System.out.println("La coordenada (" + cordx + "," + cordy + ") se encuentra en el cuadrante 4");
        }
    }

    public static void main(String[] args) {
        Plano punto1;
        punto1 = new Plano();
        punto1.inicializar();
        punto1.imprimirCuadrante();
    }
}
