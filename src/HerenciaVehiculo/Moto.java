package HerenciaVehiculo;

public class Moto extends Vehiculo{
    protected int cilindrada;
    protected String tipoMoto;

    public Moto(String marca, String modelo, int anio, double precio, int cilindrada, String tipoMoto){
        super(marca, modelo, anio, precio);
        this.cilindrada = cilindrada;
        this.tipoMoto = tipoMoto;
    }

    public Moto(){
        super();
    }

    public void cargarDatosMoto(){
        System.out.println("Ingrese cantidad de cilindros:");
        cilindrada = teclado.nextInt();
        System.out.println("Ingrese el tipo de moto:");
        tipoMoto = teclado.next();
    }

    public void mostrarDatosMoto() {
        super.mostrarDatos();
        System.out.println("Numero de cilindros: " + cilindrada + " | Tipo de moto: " + tipoMoto);
    }
}
