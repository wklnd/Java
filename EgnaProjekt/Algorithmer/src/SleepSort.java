import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.*;

public class SleepSort {
    public static void main(String[] args) {
        int[] numbers = {4, 2, 7, 1, 9, 5}; // Example numbers to sort
        sleepSort(numbers);
    }

    public static void sleepSort(int[] numbers) {
        ExecutorService executor = Executors.newFixedThreadPool(numbers.length);
        List<Future<Integer>> futures = new ArrayList<>();

        long startTime = System.currentTimeMillis();

        for (int number : numbers) {
            Future<Integer> future = executor.submit(new Sleeper(number));
            futures.add(future);
        }

        executor.shutdown();

        try {
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        long endTime = System.currentTimeMillis();

        List<Integer> sortedNumbers = new ArrayList<>();
        futures.forEach(future -> {
            try {
                sortedNumbers.add(future.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        });

        Collections.sort(sortedNumbers);

        System.out.println("Sorterade nummer: " + sortedNumbers);
        System.out.println("Sorteringen tog " + (endTime - startTime) / 1000.0 + " sekunder.");
    }

    static class Sleeper implements Callable<Integer> {
        private final int number;

        public Sleeper(int number) {
            this.number = number;
        }

        @Override
        public Integer call() {
            try {
                Thread.sleep(number * 1000L);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            return number;
        }
    }
}