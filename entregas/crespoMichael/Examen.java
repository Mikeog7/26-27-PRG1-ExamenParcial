package entregas.crespoMichael;
import java.util.Scanner;
public class Examen {
    public static void main(String[] args) {
        int edad;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Examen parcial PRG1");
        System.out.print("Ingrese su edad: ");
        edad = scanner.nextInt();

        if (edad >= 18) {
            System.out.println("Usted es mayor de edad.");
        } else {
            System.out.println("Usted es menor de edad.");
        }

        scanner.close();
    }
    
}
