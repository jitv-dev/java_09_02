package HerenciaVehiculo;

public class Bicicleta extends Vehiculo{
    protected int numeroMarchas;
    protected String tipoBicicleta;

    public Bicicleta(String marca, String modelo, int anio, double precio, int numeroMarchas, String tipoBicicleta){
        super(marca, modelo, anio, precio);
        this.numeroMarchas = numeroMarchas;
        this.tipoBicicleta = tipoBicicleta;
    }

    public Bicicleta(){
        super();
    }

    public void cargarDatosBicicleta(){
        System.out.println("Ingrese numero de marchas:");
        numeroMarchas = teclado.nextInt();
        System.out.println("Ingrese el tipo de bicicleta:");
        tipoBicicleta = teclado.next();
    }

    public void mostrarDatosBicicleta(){
        super.mostrarDatos();
        System.out.println("Numero de marchas: " + numeroMarchas + " | Tipo de bicicleta: " + tipoBicicleta);
    }
}
