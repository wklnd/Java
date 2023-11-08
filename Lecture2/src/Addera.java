/*
Konstruera ett program som tar in två heltal från användaren, adderar de och sedan skriver ut talen och summan.
 */
import java.util.Scanner;
public class Addera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Skriv in ett heltal: ");
        int a = scanner.nextInt();
        System.out.print("Skriv in ett till heltal: ");
        int b = scanner.nextInt();
        System.out.println(a+b);
    }
}
