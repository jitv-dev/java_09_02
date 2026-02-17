package HerenciaVehiculo;

public class Auto extends Vehiculo{
    protected int numeroPuertas;
    protected String tipoCombustible;

    public Auto(String marca, String modelo, int anio, double precio, int numeroPuertas, String tipoCombustible){
        super(marca, modelo, anio, precio);
        this.numeroPuertas = numeroPuertas;
        this.tipoCombustible = tipoCombustible;
    }

    public Auto(){
        super();
    }

    public void cargarDatosAuto(){
        System.out.println("Ingrese el numero de puertas:");
        numeroPuertas = teclado.nextInt();
        System.out.println("Ingrese el tipo de combustible:");
        tipoCombustible = teclado.next();
    }

    public void mostrarDatosAuto() {
        super.mostrarDatos();
        System.out.println("Numero de puertas: " + numeroPuertas + " | Tipo de combustible: " + tipoCombustible);
    }
}
