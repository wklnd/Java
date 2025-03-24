import java.util.Scanner;

public class MenyVal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Samtalsbokning\n2. Avbokning\n3. Telefonist\n4. Avsluta");
        System.out.print("Välj ett av följande alternativ: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Samtalsbokning");
                break;
            case 2:
                System.out.println("Avbokning");
                break;
            case 3:
                System.out.println("Telefonist");
                break;
            case 4:
                System.out.println("Avsluta");
                break;
            default:
                System.out.println("Felaktigt val");
        }

    }
}
