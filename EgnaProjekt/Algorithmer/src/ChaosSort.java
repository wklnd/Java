import java.util.Arrays;
import java.util.Random;

/**
 * ChaosSort är en sorteringsalgoritm som sorterar en array av tal på ett otroligt o-optimerat sätt.
 * Algoritmen blandar först talen slumpmässigt tills de är sorterade, och räknar antalet byten som gjordes.
 */
public class ChaosSort {
    static int numberOfSwaps = 0;

    /**
     * Huvudmetoden för att köra ChaosSort.
     * @param args kommandoradsargumenten
     */
    public static void main(String[] args) {
        int[] numbers = {4, 2, 7, 1, 9, 5}; // Exempel på siffror att sortera, detta tar ungefär 200-500 Swaps(byten)
        //int numbers[] = {64, 34, 25, 12, 22, 11, 90, 55, 78, 2, 45, 89, 33, 67, 19, 42, 70, 88, 14, 39,1 ,51,1000}; // Tar iaf mer än 20 minuter :>
        chaosSort(numbers);
    }
    /**
     * Metoden för att utföra ChaosSort på en array av tal.
     * @param numbers arrayen av tal som ska sorteras
     */
    public static void chaosSort(int[] numbers) {
        boolean notSorted = true;

        // Sortera slumpmässigt
        while (notSorted) {
            notSorted = false;
            randomShuffle(numbers);

            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    notSorted = true;
                    numberOfSwaps++;
                    break;
                }
            }
        }

        // Sortera i storleksordning
        notSorted = true;
        while (notSorted) {
            notSorted = false;

            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    notSorted = true;
                    break;
                }
            }
        }

        System.out.println("Siffrorna i storleksordning: " + Arrays.toString(numbers));
        System.out.println("Antal byten: " + numberOfSwaps);
    }
    /**
     * Metoden för att slumpmässigt blanda en array av tal.
     * @param numbers arrayen av tal som ska blandas
     */
    public static void randomShuffle(int[] numbers) {
        Random rand = new Random();

        for (int i = numbers.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            int temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
        }
    }
}