package Labbar.Lab3;

import java.util.*;

/**
 * This class provides methods to read an arbitrary number of integers from the user,
 * calculate the mean of these numbers, and count how many of the entered numbers were unique.
 */
class MeanUniqueNumbersSimplified {
    /**
     * The main method creates an array, reads numbers from the user, calculates the mean,
     * and counts the number of unique numbers.
     */
    public static void main(String[] args) {
        int[] numbers = readNumbersFromUser();
        System.out.println("Medelvärde: " + calculateMean(numbers));
        System.out.println("Antal tal som endast angivits en gång: " + countUniqueNumbers(numbers));
    }

    /**
     * Reads integers from the user and returns an array with these numbers.
     *
     * @return an array of integers entered by the user
     */
    public static int[] readNumbersFromUser() {
        Scanner scanner = new Scanner(System.in); // Skapar skanner objektet
        int numberOfInts;
        // Denna while loop kontrollerar så att det är en int som skrivs in.
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
    /**
     * Calculates the mean of the numbers in the given array.
     *
     * @param numbers the array of numbers to calculate the mean of
     * @return the mean of the numbers in the array
     */
    public static float calculateMean(int[] numbers) {
        int sum = Arrays.stream(numbers).sum(); // Lagrar alla tal i en ström och summerar dem
        return (float) sum / numbers.length; // Delar summan (sum) med antalet tal (numbers.length)
    }

    /**
     * This method counts the number of unique numbers in an array.
     * It uses two arrays to keep track of the numbers that have been seen and the numbers that are duplicates.
     *
     * @param numbers the array of numbers to check for uniqueness
     * @return the count of unique numbers in the array
     */
    public static int countUniqueNumbers(int[] numbers) {
        // Array to store the numbers that have been seen
        int[] seenNumbers = new int[numbers.length];
        // Array to store the numbers that are duplicates
        int[] duplicateNumbers = new int[numbers.length];
        // Counter for the number of unique numbers seen
        int count = 0;
        // Counter for the number of duplicate numbers seen
        int duplicateCount = 0;

        // Iterate over each number in the input array
        for (int number : numbers) {
            // Flag to indicate if the current number is a duplicate
            boolean isDuplicate = false;
            // Check if the current number has been seen before
            for (int seenNumber : seenNumbers) {
                // If the number has been seen, it is a duplicate
                if (number == seenNumber) {
                    // Add the duplicate number to the duplicateNumbers array
                    duplicateNumbers[duplicateCount++] = number;
                    // Set the flag to indicate that the number is a duplicate
                    isDuplicate = true;
                    break;
                }
            }
            // If the number is not a duplicate, add it to the seenNumbers array
            if (!isDuplicate) {
                seenNumbers[count++] = number;
            }
        }
        // The number of unique numbers is the total number of numbers seen minus the number of duplicates
        return count - duplicateCount;
    }
}
