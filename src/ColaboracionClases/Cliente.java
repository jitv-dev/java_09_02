package ColaboracionClases;

public class Cliente {
    private String nombre;
    private int monto;

    public Cliente(String nom){
        nombre = nom;
        monto = 0;
    }

    public void depositar(int m){
        monto = monto + m;
    }

    public void girar(int m){
        monto = monto - m;
    }

    public int retornarMonto(){
        return monto;
    }

    public void imprimir(){
        System.out.println(nombre + " tiene en su cuenta la suma de: " + monto);
    }
}
