import java.util.Arrays;
import java.util.Random;

public class ChaosSortShort {
    static int numberOfSwaps = 0;
    static Random rand = new Random();

    public static void main(String[] args) {
       // int[] numbers = {4, 2, 7, 1, 9, 5};
        int numbers[] = {64, 34, 25, 12, 22, 11, 90, 55, 78, 2, 45, 89, 33, 67, 19, 42, 70, 88, 14, 39,1 ,51,1000};

        chaosSort(numbers);
    }
    public static void chaosSort(int[] numbers) {
        while (!isSorted(numbers)) {
            randomShuffle(numbers);
        }
        System.out.println("Sorted numbers: " + Arrays.toString(numbers));
        System.out.println("Number of swaps: " + numberOfSwaps);
    }

    public static boolean isSorted(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                numberOfSwaps++;
                System.out.print("Current swaps: " + numberOfSwaps + "\n");
                return false;
            }
        }
        return true;
    }
    public static void randomShuffle(int[] numbers) {

        for (int i = numbers.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            int temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;

        }
    }
}