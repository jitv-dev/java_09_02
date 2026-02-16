package EquipoDeportivo;

public class Jugador {

    // ATRIBUTOS (todos privados):
    // - nombre (String)
    // - edad (int)
    // - posicion (String) - ejemplo: "Delantero", "Defensa", "Mediocampista", "Arquero"
    // - goles (int) - cantidad de goles anotados
    // - partidos (int) - cantidad de partidos jugados
    private String nombre;
    private int edad;
    private String posicion;
    private int goles;
    private int partidosJugados;

    // CONSTRUCTOR:
    // - Recibe: nombre, edad, posicion, goles, partidos
    // - Asigna todos los valores a los atributos
    public Jugador(String name, int age, String pos, int gol, int part){
        nombre = name;
        edad = age;
        posicion = pos;
        goles = gol;
        partidosJugados = part;
    }

    // MÉTODOS:

    // anotarGol():
    // - Incrementa la cantidad de goles en 1
    // - Muestra mensaje: "[nombre] anotó un gol! Total: [goles]"
    public void anotarGol(){
        goles ++;
        System.out.println(nombre + " anotó un gol! Total: " + goles);
    }

    // jugarPartido():
    // - Incrementa la cantidad de partidos en 1
    // - Muestra mensaje: "[nombre] jugó un partido. Total: [partidos]"
    public void jugarPartido(){
        partidosJugados++;
        System.out.println(nombre + " jugó un partido. Total: " + partidosJugados);
    }

    // promedioGoles():
    // - Retorna float con el promedio de goles por partido
    // - Formula: (float)goles / partidos
    // - Si partidos == 0, retornar 0 para evitar división por cero
    public float promedioGoles(){
        if (partidosJugados == 0) {
            return 0;
        } else {
            return (float) goles/partidosJugados;
        }
    }

    // esMayorDe30():
    // - Retorna true si edad > 30
    // - Retorna false si edad <= 30
    public boolean esMayorDe30(){
        if (edad > 30) {
            return true;
        } else {
            return false;
        }
    }

    // imprimir():
    // - Muestra: nombre, edad, posición, goles, partidos y promedio de goles
    // - Formato sugerido:
    //   Nombre: X | Edad: Y | Posición: Z
    //   Goles: A | Partidos: B | Promedio: C goles/partido
    public void imprimir(){
        System.out.println("Nombre: " + nombre + " Edad: " + edad + " Posición: " + posicion);
        System.out.println("Goles: " + goles + " Partidos: " + partidosJugados + " Promedio: " + promedioGoles());
    }

    // getNombre():
    // - Retorna el nombre del jugador
    // - Necesario para goleador() en Equipo.java
    public String getNombre(){
        return nombre;
    }

    // getGoles():
    // - Retorna la cantidad de goles
    // - Necesario para goleador() en Equipo.java
    public int getGoles(){
        return goles;
    }

    // getEdad():
    // - Retorna la edad
    // - Necesario para promedioEdad() en Equipo.java
    public int getEdad(){
        return edad;
    }

    // getPosicion():
    // - Retorna la posición
    // - Necesario para contarPorPosicion() en Equipo.java
    public String getPosicion(){
        return posicion;
    }
}