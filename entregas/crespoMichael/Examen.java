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
        
        scanner.close();
    }
    
}
