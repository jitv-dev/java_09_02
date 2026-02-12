import java.util.Scanner;
import java.util.Vector;

public class VectorEjemplo {
    private Scanner teclado;
    private Vector<Integer> sueldos;

    public void cargar(){
        teclado = new Scanner(System.in);
        sueldos = new Vector<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese monto:");
            sueldos.add(teclado.nextInt());
        }
    }

    public void imprimir(){
        System.out.println("Cantidad de sueldos: " + sueldos.size());
        for (int i = 0; i < sueldos.size(); i++) {
            System.out.println("Sueldo " + (i+1) + " - " + sueldos.get(i));
        }
    }

    public static void main(String[] args) {
        VectorEjemplo vc1 = new VectorEjemplo();
        vc1.cargar();
        vc1.imprimir();
    }
}