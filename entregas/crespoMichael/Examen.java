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

        scanner.close();
    }
    
}
