/*
Skriv ett program som med hjälp av kommandofönstret tar in ett antal heltal för att sedan skriva ut
medelvärdet och hur många av de angivna talen som endast angetts en gång.
Programmet ska även kunna hantera felaktig input.
 */
import java.util.Scanner;
import java.util.*;
import java.util.ArrayList;
public class Lab3 {
    public static void main(String[] args) {
        boolean validInput = false;
        System.out.println("** HELTALSHANTERARE **");
        Scanner scanner = new Scanner(System.in); // Skapar ett skanner objekt'
        List<Integer> allaTal = new ArrayList<Integer> ();

        int antalHeltal = 0; // Hur många heltal som ska anges
        while (!validInput) {
            // När användaren anger ett heltal, sätts validInput till true
            // och därmed bryts loopen eftersom !validInput blir falskt
            // Utropstecknet "!" används för att invertera det logiska uttrycket.
            System.out.print("Hur många heltal vill du ange? ");
            if (scanner.hasNextInt()) {
                antalHeltal = scanner.nextInt();
                validInput = true;
            } else {
                System.out.println("Felaktig input. Vänligen ange endast ett heltal.");
                scanner.next(); // för att rensa skannern.
            }
        }

        int counter = antalHeltal; // Skapar en räknare för att hålla koll på hur många heltal som angetts
        // Lägg till alla angivna heltal i en lista, sluta ta input när counter är 0
        while (counter > 0) {
            System.out.print("Ange heltal: ");
            if (scanner.hasNextInt()) {
                allaTal.add(scanner.nextInt());
            } else {
                System.out.println("Felaktig input. Vänligen ange ett heltal.");
                scanner.next(); // för att rensa skannern.
                counter ++;
            }
            counter--;
        }
        // Bedömt Sjukt oklart
        // ------------------------------------------------------------------------------------------------------------
        Map<Integer, Integer> numberCountMap = new HashMap<>();
        // Iterera över varje heltal i allaTal-listan
        for (int number : allaTal) {
            // Hämta det aktuella antalet för det nuvarande heltalet, om det finns, annars sätt till 0
            int currentCount = numberCountMap.getOrDefault(number, 0);

            // Öka antalet med 1 och uppdatera det i numberCountMap
            numberCountMap.put(number, currentCount + 1);
        }
        // Skriv ut hur många av de angivna talen som endast angetts en gång.
        long numbersThatAreAlone = numberCountMap.values().stream().filter(count -> count == 1).count();
        System.out.println("\u001B[32m" +numbersThatAreAlone + " tal angavs bara en gång");
        // ------------------------------------------------------------------------------------------------------------

        //medelvärdet av alla tal
        int sum = allaTal.stream().mapToInt(Integer::intValue).sum();
        System.out.println("\u001B[36m" +"Summan av alla tal är " + sum);
        System.out.print("\u001B[33m"+"Medelvärdet av talen är " + (sum/antalHeltal));
    }
}