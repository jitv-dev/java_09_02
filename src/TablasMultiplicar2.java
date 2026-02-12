import java.util.Scanner;

public class TablasMultiplicar2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int v;
        while(true){
            System.out.println("Ingrese valor");
            v = teclado.nextInt();
            if (v == -1) break;
            for (int f = v; f <= v*10; f +=v) {
                System.out.println(f + " - ");
            }
        }
    }
}
