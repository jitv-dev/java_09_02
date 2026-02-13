import java.util.Scanner;

public class Operarios {
    private Scanner teclado;
    private int[] sueldos;

    // Al ser un constructor va sin class y en mayuscula
    // los metodos van en minuscula
    public Operarios(){
        teclado = new Scanner(System.in);
        sueldos = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese monto sueldo: ");
            sueldos[i] = teclado.nextInt();
            
        }
    }
    
    public void imprimir(){
        for (int i = 0; i < 5; i++) {
            System.out.println(sueldos[i]);
        }
    }

    public static void main(String[] args) {
        Operarios op = new Operarios();
        op.imprimir();
    }
}
