import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Välj operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraktion");
            System.out.println("3. Multiplikation");
            System.out.println("4. Division");
            System.out.println("5. Avsluta");

            int choice = scanner.nextInt();

            if (choice == 5) {
                break; // Avsluta programmet om användaren väljer 5
            }

            System.out.print("Ange det första talet: ");
            double num1 = scanner.nextDouble();
            System.out.print("Ange det andra talet: ");
            double num2 = scanner.nextDouble();

            switch (choice) {
                case 1:
                    System.out.println("Resultat: " + add(num1, num2));
                    break;
                case 2:
                    System.out.println("Resultat: " + subtract(num1, num2));
                    break;
                case 3:
                    System.out.println("Resultat: " + multiply(num1, num2));
                    break;
                case 4:
                    if (num2 != 0) {
                        System.out.println("Resultat: " + divide(num1, num2));
                    } else {
                        System.out.println("Kan inte dividera med noll.");
                    }
                    break;
                default:
                    System.out.println("Ogiltigt val. Försök igen.");
            }

        } while (true);

        System.out.println("Programmet avslutas.");
        scanner.close();
    }

    private static double add(double a, double b) {
        return a + b;
    }

    private static double subtract(double a, double b) {
        return a - b;
    }

    private static double multiply(double a, double b) {
        return a * b;
    }

    private static double divide(double a, double b) {
        return a / b;
    }
}
