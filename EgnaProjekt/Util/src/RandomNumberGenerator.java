import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class RandomNumberGenerator {
    private static int upperLimit =1000000;
    static int count = 1000000;

    static void generateRandomNumbers(String filePath, int count) {
        Random random = new Random();
        try (PrintWriter writer = new PrintWriter(filePath)) {
            for (int i = 0; i < count; i++) {;
                writer.println(random.nextInt(upperLimit)); // generates a random number between 0 (inclusive) and 100 (exclusive)
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filePath);
            System.exit(1);
        }
    }
}