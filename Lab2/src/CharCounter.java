import java.util.Scanner;

public class CharCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Skapar ett Scanner-objekt
        String input, sentence;
        int occurrenceCount = 0;

        // Loopar tills användaren skriver en mening som inte är tom
        do {
            System.out.print("Enter a sentence: ");
            sentence = scanner.nextLine();
        } while (sentence.isEmpty()); // Om meningen är tom tecken, fortsätt loopen
        // Loopar tills användaren skriver in endast ett tecken
        do {
            System.out.print("Enter a character: ");
            input = scanner.nextLine();
        } while (input.length() != 1); // Medans inputen inte är ett tecken, fortsätt loopa
        char character = input.charAt(0);

        // Loopar igenom strängen och räknar antalet förekomster av tecknet
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == character) {
                occurrenceCount++;
            }
        }
        // Skriver ut resultatet
        System.out.println("Tecknet " + character + " förekommer " + occurrenceCount + " gånger i meningen: " + sentence);
        System.out.println("Första gången på indexplats: " + sentence.indexOf(character));
        System.out.println("Sista gången på indexplats:  " + sentence.lastIndexOf(character));
    }
}