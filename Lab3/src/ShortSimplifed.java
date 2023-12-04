import java.util.*;
/**
 * This class provides methods to read a set of integers from the user, calculate the mean of these integers,
 * and count the number of unique integers.
 * The main method orchestrates the flow of the program, invoking the methods in the correct order and printing the results.
 * The readNumbersFromUser method prompts the user to input a series of integers, and returns an array of these integers.
 * It handles invalid input by catching InputMismatchException and prompting the user to try again.
 * The calculateMean method takes an array of integers as input and returns the mean of these integers as a float.
 * The countUniqueNumbers method takes an array of integers as input and returns the count of unique integers in the array.
 * It uses a Set to keep track of unique and duplicate numbers.
 * @author OscarWiklundJonsson
 */
class MeanUniqueNumbersShortened {
    /**
     * The main method of the program.
     * It reads a set of integers from the user, calculates the mean of these integers,
     * and counts the number of unique integers, then prints the results.
     */
    public static void main(String[] args) {
        int[] numbers = readNumbersFromUser();
        System.out.println("Medelvärde: " + calculateMean(numbers));
        System.out.println("Antal tal som endast angivits en gång: " + countUniqueNumbers(numbers));
    }
    /**
     * Reads a set of integers from the user.
     * It prompts the user to input a series of integers, and returns an array of these integers.
     * It handles invalid input by catching InputMismatchException and prompting the user to try again.
     *
     * @return An array of integers input by the user.
     */
    public static int[] readNumbersFromUser() {
        Scanner scanner = new Scanner(System.in);
        int numberOfInts = 0;

        // Loop until a valid number of integers is input by the user.
        while (true) {
            try {
                System.out.print("Ange antalet heltal: ");
                numberOfInts = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Felaktig input, försök igen");
                scanner.next();
            }
        }

        int[] numbers = new int[numberOfInts];

        // Loop to read the specified number of integers from the user.
        for (int i = 0; i < numberOfInts; i++) {
            while (true) {
                try {
                    System.out.print("Ange heltal " + (i + 1) + ":");
                    numbers[i] = scanner.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Felaktig input, försök igen");
                    scanner.next();
                }
            }
        }
        return numbers;
    }

    /**
     * Calculates the mean of a set of integers.
     *
     * @param numbers An array of integers.
     * @return The mean of the integers as a float.
     */
    public static float calculateMean(int[] numbers) {
        int sum = Arrays.stream(numbers).sum(); // Stores all numbers in a stream and sums them
        return (float) sum / numbers.length; // Divides the sum by the number of integers
    }
    /**
     * Counts the number of unique integers in a set of integers.
     *
     * @param numbers An array of integers.
     * @return The count of unique integers in the array.
     */
    public static int countUniqueNumbers(int[] numbers) {
        Set<Integer> uniqueNumbers = new HashSet<>();
        Set<Integer> duplicateNumbers = new HashSet<>();
        // Loop through the array of integers, adding each integer to the set of unique numbers.
        // If an integer is already in the set of unique numbers, it is added to the set of duplicate numbers.
        for (int number : numbers) {
            if (!uniqueNumbers.add(number)) {
                duplicateNumbers.add(number);
            }
        }
        // The count of unique integers is the size of the set of unique numbers minus the size of the set of duplicate numbers.
        return uniqueNumbers.size() - duplicateNumbers.size();
    }
}