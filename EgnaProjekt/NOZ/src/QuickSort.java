import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        String filePath = "/Users/oscar/Documents/GitHub/Java/EgnaProjekt/NOZ/src/numbers.txt";
        int[] numbers = loadNumbers(filePath);
        quickSort(numbers, 0, numbers.length - 1);
        saveNumbers(filePath, numbers);
        System.out.print("Sorted " + numbers.length + " numbers in " + filePath + ".");

    }

    static int[] loadNumbers(String filePath) {
        List<Integer> numbers = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File(filePath));
            while (scanner.hasNextInt()) {
                numbers.add(scanner.nextInt());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filePath);
            System.exit(1);
        }
        return numbers.stream().mapToInt(i -> i).toArray();
    }

    static void saveNumbers(String filePath, int[] numbers) {
        try (PrintWriter writer = new PrintWriter(filePath)) {
            for (int number : numbers) {
                writer.println(number);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filePath);
            System.exit(1);
        }
    }

    static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            if (pi > 1) {
                quickSort(arr, low, pi - 1);
            }
            if (pi + 1 < high) {
                quickSort(arr, pi + 1, high);
            }
        }
    }
}