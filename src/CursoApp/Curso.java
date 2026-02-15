package CursoApp;

import java.util.Scanner;
import java.util.Vector;

public class Curso {
    // Atributos: Vector<Estudiante> estudiantes, Scanner teclado (privados)
    private Scanner teclado;
    private Vector<Estudiante> estudiantes;

    // Constructor: inicializa el Vector y el Scanner
    public Curso(){
        teclado = new Scanner(System.in);
        estudiantes = new Vector<>();
    }

    // cargarEstudiantes(): pide cantidad de estudiantes,
    //                      luego pide nombre y 3 notas de cada uno
    public void cargarEstudiantes(){
        System.out.println("Ingrese la cantidad de estudiantes");
        int cantidad = teclado.nextInt();
        teclado.nextLine();

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Nombre: ");
            String nombre = teclado.nextLine();

            System.out.print("Nota 1: ");
            float nota1 = teclado.nextFloat();

            System.out.print("Nota 2: ");
            float nota2 = teclado.nextFloat();

            System.out.print("Nota 3: ");
            float nota3 = teclado.nextFloat();
            teclado.nextLine();

            // Creo el objeto estudiante
            Estudiante est = new Estudiante(nombre, nota1, nota2, nota3);

            // Lo agrego al vector
            estudiantes.add(est);
        }
    }

    // listarEstudiantes(): muestra todos usando  imprimir()
    public void listarEstudiantes(){
        System.out.println("Lista de Estudiantes");
        for (int i = 0; i < estudiantes.size(); i++) {
            estudiantes.get(i).imprimir();
        }
    }

    // promedioGeneral(): calcula y muestra el promedio de TODO el curso
    //                    (suma todos los promedios y divide por cantidad de estudiantes)
    public void promedioGeneral(){
        float promedioGeneral = 0;
        for (int i = 0; i < estudiantes.size(); i++) {
            promedioGeneral = promedioGeneral + estudiantes.get(i).calcularPromedio();
        }
        promedioGeneral = promedioGeneral / estudiantes.size();
        System.out.println("El promedio general de todo el curso es: " + promedioGeneral);
    }

    // cantidadAprobados(): cuenta y muestra cuántos estudiantes aprobaron
    public void cantidadAprobados(){
        int contador = 0;
        for (int i = 0; i < estudiantes.size(); i++) {
            if (estudiantes.get(i).aprobado()){
                contador++;
            }
        }
        System.out.println("Cantidad de estudiantes aprobados: " + contador);
    }

    // mejorEstudiante(): encuentra y muestra el estudiante con mejor promedio
    public void mejorEstudiante(){
        float mejorPromedio = estudiantes.get(0).calcularPromedio();
        int indiceMejorPromedio = 0;

        for (int i = 1; i < estudiantes.size(); i++) {
            float promedioActual = estudiantes.get(i).calcularPromedio();
            if (promedioActual > mejorPromedio){
                mejorPromedio = promedioActual;
                indiceMejorPromedio = i;
            }
        }

        System.out.println("Mejor promedio");
        estudiantes.get(indiceMejorPromedio).imprimir();
    }

    // main: crea un objeto Curso, carga estudiantes, y ejecuta todos los métodos
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.cargarEstudiantes();
        curso1.listarEstudiantes();
        curso1.promedioGeneral();
        curso1.cantidadAprobados();
        curso1.mejorEstudiante();
    }
}