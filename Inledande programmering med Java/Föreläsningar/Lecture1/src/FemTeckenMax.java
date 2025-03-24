/*
Konstruera ett program som tar in en mening från användaren och skriver ut de fem första tecknen i meningen.
 */
import java.util.Scanner;
public class FemTeckenMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Skriv in en mening: ");
        String text = scanner.nextLine();
        System.out.println(text.substring(0,5));
    }
}