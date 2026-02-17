package Herencias;

public class Prueba {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Javier", 25, 0);
        empleado1.imprimirTodo();
        Empleado empleado2 = new Empleado();
        empleado2.cargarDatosPersonales();
        empleado2.cargarSueldo();
        empleado2.imprimirTodo();
    }
}
