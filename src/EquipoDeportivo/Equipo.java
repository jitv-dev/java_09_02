package EquipoDeportivo;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Vector;

public class Equipo {

    // ATRIBUTOS (privados):
    // - nombreEquipo (String)
    // - Vector<Jugador> jugadores
    // - Scanner teclado
    private String nombreEquipo;
    private Vector<Jugador> jugadores;
    private Scanner teclado;

    // CONSTRUCTOR:
    // - Recibe el nombre del equipo como parámetro
    // - Inicializa nombreEquipo con el parámetro recibido
    // - Inicializa el Vector: jugadores = new Vector<>();
    // - Inicializa el Scanner
    public Equipo(String nE){
        nombreEquipo = nE;
        teclado = new Scanner(System.in);
        jugadores = new Vector<>();
    }

    // MÉTODOS:

    // cargarJugadores():
    // - Pide la cantidad de jugadores
    // - Usa teclado.nextLine() después de nextInt() para limpiar buffer
    // - Usa un for para pedir datos de cada jugador:
    //   * Nombre (nextLine)
    //   * Edad (nextInt)
    //   * teclado.nextLine() para limpiar buffer
    //   * Posición (nextLine)
    //   * Goles (nextInt)
    //   * Partidos (nextInt)
    //   * teclado.nextLine() para limpiar buffer
    // - Crea el objeto: new Jugador(nombre, edad, posicion, goles, partidos)
    // - Lo agrega al Vector: jugadores.add(jug);

    public void cargarJugadores(){
        System.out.println("Ingrese la cantidad de jugadores:");
        int cantidad = teclado.nextInt();
        teclado.nextLine();

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Nombre:");
            String nombre = teclado.nextLine();
            System.out.println("Edad:");
            int edad = teclado.nextInt();
            teclado.nextLine();

            System.out.println("Posición:");
            String posicion = teclado.nextLine();
            System.out.println("Goles:");
            int goles = teclado.nextInt();
            System.out.println("Partidos jugados:");
            int partidosJugados = teclado.nextInt();
            teclado.nextLine();

            Jugador jug = new Jugador(nombre, edad, posicion, goles, partidosJugados);
            jugadores.add(jug);
        }
    }

    // listarJugadores():
    // - Muestra: "=== Equipo [nombreEquipo] ==="
    // - Usa un for: for (int i = 0; i < jugadores.size(); i++)
    // - Llama a: jugadores.get(i).imprimir()
    public void listarJugadores(){
        System.out.println("Equipo " + nombreEquipo);
        for (int i = 0; i < jugadores.size(); i++) {
            jugadores.get(i).imprimir();
        }
    }

    // goleador():
    // - Encuentra y muestra el jugador con más goles
    // - int maxGoles = jugadores.get(0).getGoles();
    // - int indiceGoleador = 0;
    // - Recorre desde i=1 hasta jugadores.size()
    // - Si jugadores.get(i).getGoles() > maxGoles, actualiza ambos
    // - Muestra: "=== Goleador del equipo ==="
    // - Imprime: jugadores.get(indiceGoleador).imprimir()
    public void goleador(){
        int maxGoles = jugadores.get(0).getGoles();
        int indiceGoleador = 0;

        for (int i = 1; i < jugadores.size(); i++) {
            if (jugadores.get(i).getGoles() > maxGoles){
                maxGoles = jugadores.get(i).getGoles();
                indiceGoleador = i;
            }
        }
        System.out.println("Mejor goleador del equipo:");
        jugadores.get(indiceGoleador).imprimir();
    }

    // promedioEdad():
    // - Calcula y muestra el promedio de edad del equipo
    // - float sumaEdades = 0;
    // - Recorre todos los jugadores sumando: sumaEdades += jugadores.get(i).getEdad()
    // - Calcula: float promedio = sumaEdades / jugadores.size()
    // - Muestra: "Promedio de edad del equipo: X años"
    public void promedioEdad(){
        float sumaEdades = 0;
        for (int i = 0; i < jugadores.size(); i++) {
            sumaEdades += jugadores.get(i).getEdad();
        }
        float promedio = sumaEdades / jugadores.size();
        System.out.println("Promedio edad del equipo: " + promedio);
    }

    // jugadoresMayoresDe30():
    // - Cuenta cuántos jugadores tienen más de 30 años
    // - int contador = 0;
    // - Recorre todos: if (jugadores.get(i).esMayorDe30()) contador++
    // - Muestra: "Jugadores mayores de 30 años: X"
    public void jugadoresMayoresDe30(){
        int contador = 0;
        for (int i = 0; i < jugadores.size(); i++) {
            if (jugadores.get(i).esMayorDe30()){
                contador++;
            }
        }
        System.out.println("Cantidad de jugadores mayores a 30 años: " + contador);
    }

    // contarPorPosicion(String pos):
    // - Recibe una posición como parámetro
    // - int contador = 0;
    // - Recorre todos los jugadores
    // - if (jugadores.get(i).getPosicion().equalsIgnoreCase(pos)) contador++
    // - Muestra: "Jugadores en [pos]: X"
    public void contarPorPosicion(String pos){
        int contador = 0;
        for (int i = 0; i < jugadores.size(); i++) {
            if (jugadores.get(i).getPosicion().equalsIgnoreCase(pos)){
                contador++;
            }
        }
        System.out.println("Cantidad de jugadores que juegan de " + pos + " : " + contador);
    }

    // mejorPromedio():
    // - Encuentra el jugador con mejor promedio de goles
    // - float maxPromedio = jugadores.get(0).promedioGoles();
    // - int indiceMejor = 0;
    // - Recorre desde i=1
    // - float promedioActual = jugadores.get(i).promedioGoles();
    // - Si promedioActual > maxPromedio, actualiza
    // - Muestra: "=== Jugador con mejor promedio ==="
    // - Imprime el jugador
    public void mejorPromedio(){
        float maxPromedio = jugadores.get(0).promedioGoles();
        int indiceMejor = 0;

        for (int i = 1; i < jugadores.size(); i++) {
            float promedioActual = jugadores.get(i).promedioGoles();
            if (promedioActual > maxPromedio) {
                maxPromedio = promedioActual;
                indiceMejor = i;
            }
        }
        System.out.println("Jugador con mejor promedio");
        jugadores.get(indiceMejor).imprimir();
    }

    // main:
    // - Crea: Equipo equipo1 = new Equipo("Barcelona");
    //   (el nombre puede ser el que quieras)
    // - equipo1.cargarJugadores();
    // - equipo1.listarJugadores();
    // - equipo1.goleador();
    // - equipo1.promedioEdad();
    // - equipo1.jugadoresMayoresDe30();
    // - equipo1.contarPorPosicion("Delantero");
    // - equipo1.contarPorPosicion("Defensa");
    // - equipo1.mejorPromedio();
    public static void main(String[] args) {
        Equipo equipo1 = new Equipo("Barcelona");
        equipo1.cargarJugadores();
        equipo1.listarJugadores();
        equipo1.goleador();
        equipo1.promedioEdad();
        equipo1.jugadoresMayoresDe30();
        equipo1.contarPorPosicion("Delantero");
        equipo1.contarPorPosicion("Defensa");
        equipo1.mejorPromedio();
    }

}