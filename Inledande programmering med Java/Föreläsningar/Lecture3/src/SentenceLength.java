import java.util.Scanner;
public class SentenceLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Skriv in en mening: ");
        String sentenceOne = scanner.nextLine();
        System.out.print("Skriv in en mening till: ");
        String sentenceTwo = scanner.nextLine();
        if (sentenceOne.length() == sentenceTwo.length()) {
            System.out.println("Meningarna är lika långa");
        } else {
            System.out.println("Meningarna är olika långa");
        }
    }

}
