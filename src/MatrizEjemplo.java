import java.util.Scanner;

public class MatrizEjemplo {
    private Scanner teclado;
    private int [][] matr;

    public void cargar(){
        teclado = new Scanner(System.in);
        matr = new int[3][5];
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 5; y++) {
                System.out.println("Ingrese numero");
                matr[x][y] = teclado.nextInt();
            }
        }
    }

    public void imprimir(){
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 5; y++) {
                System.out.print(matr[x][y] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MatrizEjemplo ma1 = new MatrizEjemplo();
        ma1.cargar();
        ma1.imprimir();
    }
}
