import java.util.Scanner;
public class GemenTillVersal {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Skriv in en text: ");
        String text = scanner.nextLine();
        System.out.println("Texten med endast versaler: " + text.toUpperCase());
        System.out.println("Texten med endast gemener: " + text.toLowerCase());
    }
}
