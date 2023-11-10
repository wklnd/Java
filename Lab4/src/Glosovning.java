/*
Ett program där användaren kan öva på engelska glosor.
Användaren får en ett ord, sen ska skriva in översättningen.
Glosorna ska läsas in från en textfil.
Om användaren skriver in rätt översättning så ska programmet skriva ut "Rätt svar!".
Om gissningen är nära (1-2 bokstäver fel) så ska programmet skriva ut "Nästan rätt!".
Annars ska programmet skriva ut "Fel Svar!".
Programmet ska fortsätta ställa frågor tills användaren skriver "Q".
 */
import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Glosovning {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Skapar ett skanner objekt
        Random random = new Random();
        try {
            File wordFile = new File("filename.txt");
            Scanner myReader = new Scanner(wordFile);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();

        System.out.println(ANSI_GREEN + "Välkommen till glosövaren!");
        System.out.println(ANSI_GREEN + "Skriv in 'Q' för att avsluta programmet.");




    }
}
}
