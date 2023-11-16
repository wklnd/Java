import java.util.*;

/**
 * En enkel Java-applikation för att hantera heltal.
 * Användaren kan ange ett antal heltal, och programmet kommer att beräkna medelvärdet
 * samt hur många av de angivna talen som endast angivits en gång.
 *
 * @author Oscar Wiklund Jonsson
 * @author Filip Johansson
 * @version 1.0
 * @since 2023-09-09
 */
public class Lab3 {

    /**
     * Huvudmetod som körs när programmet startas..
     */
    public static void main(String[] args) {
        boolean validInput = false;
        System.out.println("** HELTALSHANTERARE **");
        Scanner scanner = new Scanner(System.in);

        int antalHeltal = getNumberOfIntegers(scanner);
        List<Integer> allaTal = getIntegerList(scanner, antalHeltal);

        // Beräkna och skriv ut antalet tal som angivits en gång
        printNumbersThatAreAlone(allaTal);

        // Beräkna och skriv ut summan och medelvärdet av alla tal
        calculateAndPrintAverage(allaTal, antalHeltal);
    }

    /**
     * Hämtar antalet heltal från användaren.
     *
     * @param scanner Scanner-objekt för att läsa användarinput.
     * @return Antalet heltal som användaren vill ange.
     */
    private static int getNumberOfIntegers(Scanner scanner) {
        boolean validInput = false;
        int antalHeltal = 0;

        while (!validInput) {
            System.out.print("Hur många heltal vill du ange? ");
            if (scanner.hasNextInt()) {
                antalHeltal = scanner.nextInt();
                validInput = true;
            } else {
                System.out.println("Felaktig input. Vänligen ange endast ett heltal.");
                scanner.next(); // för att rensa skannern.
            }
        }

        return antalHeltal;
    }

    /**
     * Läser in angivna heltal från användaren och returnerar en lista med dessa heltal.
     *
     * @param scanner       Scanner-objekt för att läsa användarinput.
     * @param antalHeltal   Antalet heltal som ska läsas in.
     * @return              En lista med de angivna heltalen.
     */
    private static List<Integer> getIntegerList(Scanner scanner, int antalHeltal) {
        List<Integer> allaTal = new ArrayList<>();
        int counter = antalHeltal;

        while (counter > 0) {
            System.out.print("Ange heltal: ");
            if (scanner.hasNextInt()) {
                allaTal.add(scanner.nextInt());
            } else {
                System.out.println("Felaktig input. Vänligen ange ett heltal.");
                scanner.next(); // för att rensa skannern.
                counter++;
            }
            counter--;
        }

        return allaTal;
    }

    /**
     * Beräknar och skriver ut antalet tal som angivits en gång.
     *
     * @param allaTal Lista med heltal.
     */
    private static void printNumbersThatAreAlone(List<Integer> allaTal) {
        Map<Integer, Integer> numberCountMap = new HashMap<>();

        for (int number : allaTal) {
            int currentCount = numberCountMap.getOrDefault(number, 0);
            numberCountMap.put(number, currentCount + 1);
        }

        long numbersThatAreAlone = numberCountMap.values().stream().filter(count -> count == 1).count();
        System.out.println("\u001B[32m" + numbersThatAreAlone + " av talen angavs bara en gång");
    }

    /**
     * Beräknar och skriver ut summan och medelvärdet av alla tal.
     *
     * @param allaTal       Lista med heltal.
     * @param antalHeltal   Antalet heltal som angivits.
     */
    private static void calculateAndPrintAverage(List<Integer> allaTal, int antalHeltal) {
        int sum = 0;

        for (int number : allaTal) {
            sum += number;
        }

        System.out.println("\u001B[36m" + "Summan av alla tal är " + sum);
        System.out.print("\u001B[33m" + "Medelvärdet av talen är " + (sum / antalHeltal));
    }
}
