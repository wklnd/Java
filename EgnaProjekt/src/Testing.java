import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Skriv in förnamn: ");
        String firstName = scanner.nextLine();
        System.out.println("Skriv in efternamn: ");
        String lastName = scanner.nextLine();
        System.out.println("Hej " + firstName + " " + lastName + "!");
    }
}