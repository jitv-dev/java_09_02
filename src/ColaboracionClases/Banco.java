package ColaboracionClases;

public class Banco {
    private Cliente cliente1, cliente2, cliente3;

    public Banco(){
        cliente1 = new Cliente("Juan");
        cliente2 = new Cliente("Juanito");
        cliente3 = new Cliente("Juanete");
    }

    public void operar(){
        cliente1.depositar(100);
        cliente2.depositar(400);
        cliente3.depositar(1000);
        cliente3.girar(200);
    }

    public void depositosTotales(){
        int t = cliente1.retornarMonto() + cliente2.retornarMonto() + cliente3.retornarMonto();
        System.out.println("El total del dinero en el banco es: " + t);
        cliente1.imprimir();
        cliente2.imprimir();
        cliente3.imprimir();
    }

    public static void main(String[] args) {
        Banco banco1 = new Banco();
        banco1.operar();
        banco1.depositosTotales();
    }
}
