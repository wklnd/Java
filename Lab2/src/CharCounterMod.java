/*
Skriv ett program som först läser in en mening och sedan ett tecken.
Programmet ska sedan visa upp ett meddelande som beskriver hur många tecken meningen hade totalt,
hur många gånger det angivna tecknet fanns i meningen,
indexplatsen för den första förekomsten av tecknet och indexplatsen för den sista förekomsten av tecknet.
Programmet ska även kontrollera så att meningen inte är tom och tecknet bara består av ett tecken.
 */
import java.util.Scanner;

public class CharCounterMod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Skapar Scanner Objektet
        System.out.print("Ange en mening: ");
        String mening = scanner.nextLine(); // Läser in meningen från användaren

        // Kontrollera om meningen är tom, isåfall avsluta programmet
        while (mening.isEmpty()) {
            System.out.print("Ange en mening: ");
            mening = scanner.nextLine();

            if (mening.isEmpty()) {
                System.out.println("Meningen är tom. Försök igen.");
            }
        }
        // Läs in ett tecken
        System.out.print("Ange ett tecken: ");
        String tecken = scanner.nextLine();
        // Kontrollera att tecknet endast består av ett tecken
        while((tecken.length() > 1 )){
            System.out.print("Ange ett tecken: ");
            tecken = scanner.nextLine();
            if (tecken.length() != 1) {
                System.out.println("Du får bara skriva in ett tecken!");
            }
        }

        char teckenChar = tecken.charAt(0);
        int totaltAntalTecken = mening.length();

        // Beräkna antalet förekomster av tecknet
        int antalForekomster = 0;
        int forstaForekomstIndex = -1;
        int sistaForekomstIndex = -1;

        // Loopar igenom varje tecken i strängen mening

        for (int i = 0; i < totaltAntalTecken; i++) {
            // Kontrollerar om det aktuella tecknet är lika med det sökta tecknet ('targetChar')
            if (mening.charAt(i) == teckenChar) {
                // Ökar antalet förekomster av det sökta tecknet
                antalForekomster++;

                // Om detta är den första förekomsten, spara indexet som första förekomstindex
                if (forstaForekomstIndex == -1) {
                    forstaForekomstIndex = i;
                }

                // Spara alltid det aktuella indexet som det sista förekomstindexet
                sistaForekomstIndex = i;
            }
        }
        // Visa resultatet
        System.out.println("Totalt antal tecken i meningen: " + totaltAntalTecken);
        System.out.println("Antal gånger tecknet '" + teckenChar + "' förekommer i meningen: " + antalForekomster);
        if (antalForekomster > 0) {
            System.out.println("Indexplatsen för den första förekomsten av tecknet: " + forstaForekomstIndex);
            System.out.println("Indexplatsen för den sista förekomsten av tecknet: " + sistaForekomstIndex);
        } else {
            System.out.println("Tecknet '" + teckenChar + "' förekommer inte i meningen.");
        }
    }
}