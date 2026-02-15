package CursoApp;

public class Estudiante {
    // Atributos: nombre, nota1, nota2, nota3 (privados)
    private String nombre;
    private float nota1, nota2, nota3;
    public float promedio;

    // Constructor: recibe nombre y 3 notas
    public Estudiante(String name, float n1, float n2, float n3){
        nombre = name;
        nota1 = n1;
        nota2 = n2;
        nota3 = n3;
        promedio = (n1 + n2 + n3) / 3;
    }

    // calcularPromedio(): retorna float con el promedio de las 3 notas
    public float calcularPromedio(){
        return promedio;
    }

    // aprobado(): retorna true si promedio >= 60
    public boolean aprobado(){
        return promedio >= 60;
    }

    // imprimir(): muestra nombre, las 3 notas y el promedio
    public void imprimir(){
        System.out.println("Nombre: " + nombre + " Nota 1: " + nota1 + " Nota 2: " + nota2 + " Nota 3: " + nota3 + " Promedio: " + promedio);
    }

    // getNombre(): retorna el nombre (lo necesitarás para mejorEstudiante)
    public String getNombre(){
        return nombre;
    }
}