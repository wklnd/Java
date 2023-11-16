/**
 * GnomeSort
 * He looks at the flower pot next to him and the previous one;
 * if they are in the right order he steps one pot forward, otherwise he swaps them and steps one pot backwards.
 * If there is no previous pot (he is at the starting of the pot line),
 * he steps forwards; if there is no pot next to him (he is at the end of the pot line), he is done.
 */

public class GnomeSort {
    static void gnomeSort(int numbers[], int n)
    {
        int index = 0;

        while (index < n) {
            if (index == 0)
                index++;
            if (numbers[index] >= numbers[index - 1])
                index++;
            else {
                int temp = 0;
                temp = numbers[index];
                numbers[index] = numbers[index - 1];
                numbers[index - 1] = temp;
                index--;
            }
        }
        return;
    }

}