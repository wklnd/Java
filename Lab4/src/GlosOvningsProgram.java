import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Klassen WordPair representerar en översättning mellan två språk.
 */
class WordPair {
    private String swedishWord;
    private String englishWord;

    public WordPair(String swedishWord, String englishWord) {
        this.swedishWord = swedishWord;
        this.englishWord = englishWord;
    }

    public String getSwedishWord() {
        return swedishWord;
    }

    public String getEnglishWord() {
        return englishWord;
    }
}

/**
 * Klassen WordGame hanterar glosövningsprogrammet.
 */
class WordGame {
    private List<WordPair> wordPairs;
    private int correctCount;

    public WordGame(List<WordPair> wordPairs) {
        this.wordPairs = wordPairs;
        this.correctCount = 0;
    }

    /**
     * Startar glosövningsprogrammet.
     */
    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Välkommen till glosövningen!");

        for (WordPair wordPair : wordPairs) {
            System.out.println("Översätt: " + wordPair.getSwedishWord());
            String userTranslation = scanner.nextLine().toLowerCase();

            if (isTranslationCorrect(userTranslation, wordPair.getEnglishWord())) {
                System.out.println("Rätt!");
                correctCount++;
            } else {
                System.out.println("Fel. Det rätta svaret är: " + wordPair.getEnglishWord());
            }

            if (userTranslation.equals("q")) {
                break; // Avsluta om användaren skriver "q"
            }
        }

        printStatistics();
        scanner.close();
    }

    /**
     * Kontrollerar om användarens översättning är korrekt, fel eller nästan korrekt.
     */
    private boolean isTranslationCorrect(String userTranslation, String correctTranslation) {
        if (userTranslation.equals(correctTranslation)) {
            return true; // Direkt matchning
        }

        int correctLettersCount = 0;
        int minLength = Math.min(userTranslation.length(), correctTranslation.length());

        for (int i = 0; i < minLength; i++) {
            if (userTranslation.charAt(i) == correctTranslation.charAt(i)) {
                correctLettersCount++;
            }
        }

        // Bedöm som nästan korrekt om majoriteten av bokstäverna är rätt
        return correctLettersCount >= minLength / 2;
    }

    /**
     * Skriver ut statistik över antalet rätt svar.
     */
    private void printStatistics() {
        System.out.println("Glosövningen är avslutad.");
        System.out.println("Antal rätt: " + correctCount);
    }
}

public class GlosOvningsProgram {

    public static void main(String[] args) {
        List<WordPair> wordPairs = readWordPairsFromFile("/glosor.txt");

        if (wordPairs.isEmpty()) {
            System.out.println("Ingen glosa hittades. Avslutar programmet.");
            return;
        }

        WordGame wordGame = new WordGame(wordPairs);
        wordGame.startGame();
    }

    /**
     * Läser in ordpar från en textfil.
     */
    private static List<WordPair> readWordPairsFromFile(String filePath) {
        List<WordPair> wordPairs = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] pair = line.split(":");
                if (pair.length == 2) {
                    wordPairs.add(new WordPair(pair[0].trim(), pair[1].trim()));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return wordPairs;
    }
}
