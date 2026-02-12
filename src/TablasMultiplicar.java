import java.util.Scanner;

public class TablasMultiplicar {
    public void cargarNro(){
        Scanner teclado = new Scanner(System.in);
        int valor;

        do {
            System.out.println("Ingrese su valor:");
            valor = teclado.nextInt();
            if (valor != -1) {
                calcular(valor);
            }
        } while (valor != -1);
    }

    public void calcular(int v){
        for (int f = v ; f <= v*10 ; f = f+v){
            System.out.println(f + " - ");
        }
    }

    public static void main(String[] args) {
        TablasMultiplicar valor1;
        valor1 = new TablasMultiplicar();
        valor1.cargarNro();
    }
}
