import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 100) + 1; // Generates a random number between 1 and 100
        int numberOfGuesses = 0;
        boolean hasWon = false;
        System.out.println("Number guessing game");
        Scanner scanner = new Scanner(System.in);
        while (true){ // Infinite loop until user guesses the correct number
            System.out.print("Enter a number between 1 and 100: ");
            int guess = scanner.nextInt();
            if (guess == randomNumber) {
                hasWon = true;
                System.out.println("You won!");
                System.out.println("Number of guesses: " + numberOfGuesses);
                break;

            } else if (guess > randomNumber) {
                System.out.println("Number is too large");
                numberOfGuesses++;
            } else {
                System.out.println("Number is too small");
                numberOfGuesses++;
            }
        }
    }
}
