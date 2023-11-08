/*
Konstruera ett program som tar in två meningar från användaren, kombinerar de och sedan skriver ut de.
 */
import java.util.Scanner;
public class KombineraMening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Skriv in en mening: ");
        String meningEtt = scanner.nextLine();
        System.out.print("Skriv in en mening till: ");
        String meningTva = scanner.nextLine();
        System.out.println(meningEtt + " " + meningTva);
    }
}
