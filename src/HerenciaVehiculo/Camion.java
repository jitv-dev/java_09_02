package HerenciaVehiculo;

public class Camion extends Vehiculo{
    protected double capacidadCarga;
    protected int numeroEjes;

    public Camion(String marca, String modelo, int anio, double precio, double capacidadCarga, int numeroEjes){
        super(marca, modelo, anio, precio);
        this.capacidadCarga = capacidadCarga;
        this.numeroEjes = numeroEjes;
    }

    public Camion(){
        super();
    }

    public void cargarDatosCamion(){
        System.out.println("Ingrese capacidad de carga:");
        capacidadCarga = teclado.nextDouble();
        System.out.println("Ingrese el numero de ejes:");
        numeroEjes = teclado.nextInt();
    }

    public void mostrarDatosCamion() {
        super.mostrarDatos();
        System.out.println("Capacidad de carga: " + capacidadCarga + " | Numero de ejes: " + numeroEjes);
    }
}
