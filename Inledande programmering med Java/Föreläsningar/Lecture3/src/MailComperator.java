import java.util.Scanner;
public class MailComperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Skriv in din mailadress: ");
        String mail1 = scanner.nextLine();
        System.out.print("Skriv in din mailadress igen: ");
        String mail2 = scanner.nextLine();
        if (mail1.equals(mail2)) {
            System.out.println("Mailadresserna är lika");
        } else {
            System.out.println("Mailadresserna är olika");
        }


    }
}
