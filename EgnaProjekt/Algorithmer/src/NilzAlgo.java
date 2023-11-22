/**
 *
 *
 */

public class NilzAlgo {
    static int iteration = 1;
    public static void nilzSort(int[] numbers) {
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                    sorted = false;
                }
            }
            if (sorted) {
                break; // Avbryter loopen om listan är sorterad
            }
            System.out.println("Efter iteration " + iteration + ":");
            for (int num : numbers) {
                System.out.print(num + " ");
            }
            System.out.println();
            iteration++;
        }
    }
    public static void main(String[] args) {
        //int[] numbers = {3, 8, 1, 6, 4, 9, 2, 7, 5, 10};
        int numbers[] = {1000, 64, 34, 25, 12, 22, 11, 90, 55, 78, 2, 45, 89, 33, 67, 19, 42, 70, 88, 14, 39,1 ,51};
        System.out.println("Listan före sortering:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        nilzSort(numbers);
        System.out.println("Det tog " + (iteration - 1) + " iterationer att sortera listan.");
        System.out.println("Listan efter sortering:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
