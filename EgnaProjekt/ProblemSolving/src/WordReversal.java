import java.util.Scanner;

public class WordReversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Skriv en mening: ");
        String sentence = scanner.nextLine();
        String[] words = sentence.split(" ");
        String reversedSentence = "";
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence += words[i] + " ";
        }
        System.out.println("Reversed sentence: " + reversedSentence);
    }
}
