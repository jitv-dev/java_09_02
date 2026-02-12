import java.util.Scanner;

public class MatrizIrregularEjemplo {
    private Scanner teclado;
    private int [][] matr;

    public void cargar(){
        teclado = new Scanner(System.in);
        matr = new int[3][];

        for (int x = 0; x < 3; x++) {
            System.out.println("Columnas para la fila " + (x+1));
            int columnas = teclado.nextInt();

            matr[x] = new int[columnas];

            for (int y = 0; y < columnas; y++) {
                System.out.println("Ingrese numero");
                matr[x][y] = teclado.nextInt();
            }
        }
    }

    public void imprimir(){
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < matr[x].length; y++) {
                System.out.print(matr[x][y] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MatrizIrregularEjemplo ma1 = new MatrizIrregularEjemplo();
        ma1.cargar();
        ma1.imprimir();
    }
}
