import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GlosGame {
    private Map<String, String> glossary;
    // Konstruktor för GlosGame-klassen
    public GlosGame() {
        glossary = new HashMap<>();
        loadGlossary("/Users/oscar/Documents/GitHub/Java/EgnaProjekt/glosor/src/glossary.txt");
    }
    // Metod för att ladda in glosorna från en textfil
    private void loadGlossary(String filename) {
        try {
            Scanner scanner = new Scanner(new File(filename));

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");

                if (parts.length == 2) {
                    glossary.put(parts[0].trim(), parts[1].trim());
                }
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println(AnsiDecoration.ANSI_RED + "Fel: Filen kunde inte hittas.");
        }
    }

    // Metod för att utföra glosövningen
    public void startExercise(Scanner scanner) {
        int correctCount = 0;
        int numberOfQuestions = 0;
        System.out.println(AnsiDecoration.ANSI_CYAN + "** Glosövning - Engelska **\nQ för att avsluta.");

        for (Map.Entry<String, String> entry : glossary.entrySet()) {
            System.out.print(AnsiDecoration.ANSI_RESET + "Översätt: " + entry.getKey() + " > ");
            numberOfQuestions++;
            String userTranslation = scanner.next();

            if (userTranslation.equalsIgnoreCase("Q")) {
                System.out.println("Glosövningen avslutas.");
                return; // Återgå till huvudloopen i Main.java
            }

            if (userTranslation.equalsIgnoreCase(entry.getValue())) {
                System.out.println("Rätt!");
                correctCount++;
            } else if (LevenshteinStringComparator.isAlmostCorrect(userTranslation, entry.getValue())) {
                System.out.println("Nästan rätt!");
            } else {
                System.out.println("Fel!");
            }

            System.out.println(AnsiDecoration.ANSI_GREEN + "Resultat: " + correctCount + " rätt av " + numberOfQuestions + " ord." + AnsiDecoration.ANSI_RESET);
        }
    }


}
