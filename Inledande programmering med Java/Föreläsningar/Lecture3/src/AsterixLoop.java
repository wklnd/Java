import java.util.Scanner;
public class AsterixLoop {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int count = 0;
            System.out.print("Hur många asterixer vill du skriva ut? ");
            int numberOfAsterix = scanner.nextInt();
            while (count < numberOfAsterix) {
                System.out.print("*");
                count++;

        }
            scanner.close();
    }
}
