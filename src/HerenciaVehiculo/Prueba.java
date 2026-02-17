package HerenciaVehiculo;

public class Prueba {
    public static void main(String[] args) {

        System.out.println("=== PRUEBA DE AUTO ===");
        Auto auto1 = new Auto("Toyota", "Corolla", 2023, 25000.50, 4, "Gasolina");
        auto1.mostrarDatosAuto();

        System.out.println("\n=== PRUEBA DE MOTO ===");
        Moto moto1 = new Moto("Yamaha", "R15", 2024, 8500.00, 150, "Deportiva");
        moto1.mostrarDatosMoto();

        System.out.println("\n=== PRUEBA DE CAMION ===");
        Camion camion1 = new Camion("Volvo", "FH16", 2022, 95000.00, 25.5, 6);
        camion1.mostrarDatosCamion();

        System.out.println("\n=== PRUEBA DE BICICLETA ===");
        Bicicleta bici1 = new Bicicleta("Trek", "Marlin-7", 2023, 850.00, 21, "Montaña");
        bici1.mostrarDatosBicicleta();

        System.out.println("\n=== TODAS LAS PRUEBAS COMPLETADAS ===");
    }
}
