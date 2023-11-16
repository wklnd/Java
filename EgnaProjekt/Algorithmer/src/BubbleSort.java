class BubbleSort {

    // An optimized version of Bubble Sort
    static void bubbleSort(int numbers[], int n) {
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were
            // swapped by inner loop, then break
            if (!swapped)
                break;
        }
    }

    // Function to print an array
    static void printArray(int numbers[], int size) {
        for (int i = 0; i < size; i++)
            System.out.print(numbers[i] + " ");
        System.out.println();
    }
    public static void main(String args[]) {
        //int numbers[] = {64, 34, 25, 12, 22, 11, 90, 55, 78, 2, 45, 89, 33, 67, 19, 42, 70, 88, 14, 39,1 ,51,};
        int numbers[] = {64, 34, 25, 12, 22, 11, 90, 55, 78, 2, 45, 89, 33, 67, 19, 42, 70, 88, 14, 39, 1, 51, 1000, 64, 34, 25, 12, 22, 11, 90, 55, 78, 2, 45, 89, 33, 67, 19, 42, 70, 88, 14, 39, 1, 51, 1000};
        int n = numbers.length;

        System.out.println("Original array: ");
        printArray(numbers, n);

        bubbleSort(numbers, n);

        System.out.println("Sorted array: ");
        printArray(numbers, n);
    }
}
