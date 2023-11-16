import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GlosGame glosGame = new GlosGame();
        boolean isRunning = true;

        while (isRunning) {
            // Visa meny
            System.out.println(AnsiDecoration.ANSI_GREEN + "** Glosövning - Engelska **" + AnsiDecoration.ANSI_RESET);
            System.out.println("1. Start");
            System.out.println("2. Inställningar");
            System.out.println("3. Avsluta");
            System.out.print("Välj: ");

            // Läs användarens val
            int choice = scanner.nextInt();
            scanner.nextLine(); // Rensa bufferten

            // Hantera användarens val
            switch (choice) {
                case 1:
                    glosGame.startExercise(scanner);
                    break;
                case 2:
                    // Öppna inställningar
                    // ToDo: Flytta till separat fil
                    // Hämtar och visar nuvarande tröskel frn LevenshteinStringComparator.java
                    System.out.println("Nuvarande tröskel: " + LevenshteinStringComparator.getThreshold());
                    System.out.println("Ange ny tröskel: ");
                    int newThreshold = scanner.nextInt();
                    // Sätter den nya tröskeln i LevenshteinStringComparator.java
                    LevenshteinStringComparator.setThreshold(newThreshold);
                    scanner.nextLine(); // Rensa bufferten
                    System.out.println("Ny tröskel: " + LevenshteinStringComparator.getThreshold());
                    break;
                case 3:
                    // Avsluta programmet
                    isRunning = false;
                    System.out.println("Programmet avslutas.");
                    break;
                default:
                    System.out.println("Ogiltigt val. Försök igen.");
            }
        }

        // Stäng scanner när du är klar med den
        scanner.close();
    }
}
