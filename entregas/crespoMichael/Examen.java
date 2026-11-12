package entregas.crespoMichael;
import java.util.Scanner;
public class Examen {
    public static void main(String[] args) {
        int edad;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Examen parcial PRG1");
        System.out.print("Ingrese su edad: ");
        edad = scanner.nextInt();

        if (edad < 16) {
            System.out.println("La edad no es valida");
        } 
        if (edad >= 99) {
            System.out.println("La edad no es valida");
        }
        if (edad >= 16 && edad <= 99) {
            System.out.println("La edad es valida");
        }

        System.out.print("Cuantas asignaturas cursa? ");
        int asignaturas = scanner.nextInt();
        System.out.println("Cursa " + asignaturas + " asignaturas.");

        if (asignaturas < 1) {
            System.out.println("No es un numero valido de asignaturas.");
        } else if (asignaturas >= 1 && asignaturas <= 10) {
            System.out.println("Numero valido de asignaturas.");
        } else if (asignaturas > 10) {
            System.out.println("No es un numero valido de asignaturas.");
        }
        
        if (asignaturas < 1) {
            asignaturas = 0;
        } 
        else if (asignaturas > 10) {
            asignaturas = 0;
        }
        
        System.out.print("Ingrese la nota de cada asignatura: ");
        
        int NOTAS[] = new int[asignaturas];
        
        for (int i = 0; i < asignaturas; i++) {
            System.out.print("Ingrese la nota de la asignatura " + (i + 1) + ": ");
            NOTAS[i] = scanner.nextInt();
        }

        double promedio;

        promedio = 0;
        for (int i = 0; i < asignaturas; i++) {
            promedio += NOTAS[i];
        }
        promedio = promedio / asignaturas;

        System.out.println("El promedio de las notas es: " + promedio);


        for (int i = 0; i < asignaturas; i++) {
            if (NOTAS[i] < 5) {
                System.out.println("El alumno reprueba la asignatura " + (i + 1) + " con nota: " + NOTAS[i]);

                int reprobadas = i++;
                System.out.println("El reprueba " + reprobadas + "asignaturas.");
                
            } else {
                System.out.println("El alumno aprueba la asignatura " + (i + 1) + " con nota: " + NOTAS[i]);
                int aprobadas = i++;
                System.out.println("El aprueba " + aprobadas + "asignaturas.");
            }
            

            
        }

        if (promedio >= 5) {
            System.out.println("El alumno aprueba.");
        } else {
            System.out.println("El alumno reprueba.");
        }


        scanner.close();
    }
    
}
