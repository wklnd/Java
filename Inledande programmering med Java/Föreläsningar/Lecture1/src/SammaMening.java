import java.util.Scanner;

public class SammaMening {
    public static void main(String[] args) {
        System.out.println("Samma mening");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Skriv in en mening: ");
        String meningEtt = scanner.nextLine();
        System.out.print("Skriv in en mening till: ");
        String meningTva = scanner.nextLine();
        if (meningEtt.equals(meningTva)) {
            System.out.println("Meningarna är lika");
        } else {
            System.out.println("Meningarna är inte lika");
        }
    }
}
