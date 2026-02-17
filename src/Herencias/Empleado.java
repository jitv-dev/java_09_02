package Herencias;

public class Empleado extends Persona{
    protected int sueldo;

    public Empleado(String nombre, int edad, int sueldo){
        super(nombre, edad);
        this.sueldo = sueldo;
    }

    public Empleado(){
        super();
    }

    public void cargarSueldo(){
        System.out.println("Ingrese el sueldo: ");
        sueldo = teclado.nextInt();
    }

    public void imprimirSueldo(){
        System.out.println("Sueldo: " + sueldo);
    }

    public void imprimirTodo(){
        super.imprimirDatosPersonales();
        imprimirSueldo();
    }
}
