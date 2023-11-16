import java.util.Scanner;

public class NumberReversal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("** Number Reversal **");
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        System.out.println("Reversed number: " + reversedNumber);
    }
}
