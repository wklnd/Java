/*
Konstruera ett program som tar in tre heltal från användaren, adderar de två första med varandra för att sedan multiplicera summan med det tredje och sedan skriver ut talen och produkten.
 */
import java.util.Scanner;
public class AdditionMultiplikation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Skriv in ett heltal: ");
        int a = scanner.nextInt();
        System.out.print("Skriv in ett till heltal: ");
        int b = scanner.nextInt();
        System.out.print("Skriv in ännu ett heltal: ");
        int c = scanner.nextInt();
        System.out.println("(" + a + "+" + b + ")" + "*" + c + "=" + (a+b)*c);

    }

}
