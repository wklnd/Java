/*
Detta program tar in en mening(sentence) och en bokstav (character) från användaren.
Programmet skriver ut hur många tecken det är i meningen.
Programmet räknar sedan antalet förekomster av bokstaven i meningen och skriver ut resultatet.
Programmet skriver även ut indexplatsen för första och sista förekomsten av bokstaven i meningen.
 */
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
        } while (sentence.isEmpty()); // Om meningen är tom, fortsätt loopen

        // Loopar tills användaren skriver in endast ett tecken
        do {
            System.out.print("Enter a character: ");
            input = scanner.nextLine();
        } while (input.length() != 1); // Medans inputen inte är ett tecken, fortsätt loopen
        char character = input.charAt(0);

        // Loopar igenom strängen och räknar antalet förekomster av tecknet 'character' i strängen 'sentence'
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == character) {
                occurrenceCount++;
            }
        }
        // Skriver ut resultatet
        System.out.println("Meningen har totalt " + sentence.length() + " tecken.");
        System.out.println("Tecknet " + character + " förekommer " + occurrenceCount + " gånger i meningen.");
        System.out.println("Första gången på indexplats: " + sentence.indexOf(character));
        System.out.println("Sista gången på indexplats:  " + sentence.lastIndexOf(character));
        scanner.close(); // Stänger Scanner-objektet
    }

}