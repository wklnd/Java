import java.util.*;

/**
 * Detta program läser in ett godtyckligt antal heltal från användaren och beräknar medelvärdet av dessa.
 * Samt beräknar hur många av de inmatade talen som endast angivits en gång.
 */
class MeanUniqueNumbersSimplified {
    // Main metoden, skapar en Array, läser in tal från användaren, beräknar medelvärdet och antalet unika tal
    public static void main(String[] args) {
        int[] numbers = readNumbersFromUser();
        System.out.println("Medelvärde: " + calculateMean(numbers));
        System.out.println("Antal tal som endast angivits en gång: " + countUniqueNumbers(numbers));
    }
    // Läser in heltal från användaren och returnerar en Array med dessa tal
    public static int[] readNumbersFromUser() {
        Scanner scanner = new Scanner(System.in); // Skapar skanner objektet
        int numberOfInts;
        // Denna while loop kontrollerar så att det är int som skrivs in.
        while (true) {
            System.out.print("Ange antalet heltal: ");
            try {
                numberOfInts = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Felaktig input, försök igen");
                scanner.next(); // Rensa bufferten för felaktig input
            }
        }

        int[] numbers = new int[numberOfInts];// Denna del definerar längden på listan (längden = numberOfInts)
        for (int i = 0; i < numberOfInts; i++) { // Sedan lägger in respektive tal på rätt plats i listan
            System.out.print("Ange heltal " + (i+1) + ":" ); // Skriver ut vilket tal som ska skrivas in (i+1)
            while (true) {
                try {
                    numbers[i] = scanner.nextInt();
                    break; // Är siffran en int så bryts loopen, och körs om från början för nästa tal
                } catch (InputMismatchException e) {
                    System.out.println("Felaktig input, försök igen");
                    scanner.next(); // Rensa bufferten för felaktig input
                }
            }
        }
        return numbers;
    }
    // Beräknar medelvärdet av talen
    public static float calculateMean(int[] numbers) {
        int sum = Arrays.stream(numbers).sum(); // Lagrar alla tal i en ström och summerar dem
        return (float) sum / numbers.length; // Delar summan (sum) med antalet tal (numbers.length)
    }
    // Räknar antalet unika tal
    /**
        public static int countUniqueNumbers(int[] numbers) {
            // Skapar en array för att lagra sett unika tal
            int[] seenNumbers = new int[numbers.length]; // Längden på denna array är samma som längden på numbers
            int seenIndex = 0;

            // Skapar en array för att lagra duplicerade tal
            int[] duplicateNumbers = new int[numbers.length]; //Längden på denna array är samma som längden på numbers
            int duplicateIndex = 0;

            // Loopar igenom varje tal i den givna arrayen
            for (int number : numbers) {
                // Om talet redan har setts och inte redan lagts till i duplicerade tal-arrayen
                if (containsNumber(seenNumbers, seenIndex, number) && !containsNumber(duplicateNumbers, duplicateIndex, number)) {
                    // Lägger till talet i duplicerade tal-arrayen
                    duplicateNumbers[duplicateIndex++] = number;
                }
                // Om talet inte har setts tidigare
                else if (!containsNumber(seenNumbers, seenIndex, number)) {
                    // Lägger till talet i set unika tal-arrayen
                    seenNumbers[seenIndex++] = number;
                }
            }

            // Returnerar antalet unika tal genom att subtrahera antalet duplicerade tal från antalet sett unika tal
            return seenIndex - duplicateIndex;
        }

        // Hjälpmetod för att kontrollera om ett tal redan finns i en array
        private static boolean containsNumber(int[] array, int length, int number) {
            for (int i = 0; i < length; i++) {
                if (array[i] == number) {
                    return true;
                }
            }
            return false;
        }

*/

    public static int countUniqueNumbers(int[] numbers) {
        // Skapar en lista för att lagra sett unika tal
        List<Integer> seenNumbers = new ArrayList<>();
        // Skapar en lista för att lagra duplicerade tal
        List<Integer> duplicateNumbers = new ArrayList<>();

        // Loopar igenom varje tal i den givna arrayen
        for (int number : numbers) {
            // Om talet redan har setts och inte redan lagts till i duplicerade tal-listan
            if (seenNumbers.contains(number) && !duplicateNumbers.contains(number)) {
                // Lägger till talet i duplicerade tal-listan
                duplicateNumbers.add(number);
            }
            // Om talet inte har setts tidigare
            else if (!seenNumbers.contains(number)) {
                // Lägger till talet i set unika tal-listan
                seenNumbers.add(number);
            }
        }
        // Returnerar antalet unika tal genom att subtrahera antalet duplicerade tal från antalet sett unika tal
        return seenNumbers.size() - duplicateNumbers.size();
    }
    
}