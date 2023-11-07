import java.util.Scanner;
/* Detta program läser in ett textstycke och sedan ett enskilt tecken från användaren.
Sedan räknar det antalet förekomster av tecknet i meningen, och visar även
indexplatsen för den första och sista förekomsten av tecknet om det finns några förekomster.
Programmet hanterar även ogiltig inmatning och stänger Scanner-objektet korrekt.*/
public class CharCounter {
    public static void main(String[] args) {
        // Skriver ut en inledande hälsning
        System.out.println("CharCounter");

        // Skapar ett Scanner-objekt för att läsa in användarinput
        Scanner textInput = new Scanner(System.in);

        // Läser in en mening från användaren och omvandlar den till små bokstäver
        System.out.print("Skriv in en mening: ");
        String mening = textInput.nextLine().toLowerCase();

        // Läser in ett enskilt tecken från användaren och omvandlar det till små bokstäver
        System.out.print("Skriv in ett tecken: ");
        String teckenInput = textInput.nextLine().toLowerCase();

        // Kontrollerar om användaren har skrivit in ett enskilt tecken
        if (teckenInput.length() != 1) {
            System.out.println("Du får bara skriva in ett tecken!");
            textInput.close();
            return;
        }

        System.out.println(mening.length());

        // Hämtar det första tecknet från användarinputen
        char tecken = teckenInput.charAt(0);

        // Räknar antalet förekomster av tecknet i meningen
        int antalForekomster = 0;

        // Loopar igenom varje tecken i meningen för att räkna förekomster
        for (int i = 0; i < mening.length(); i++) {
            if (mening.charAt(i) == tecken) {
                antalForekomster++;

                // Skriver ut indexplatsen för den första förekomsten av tecknet
                if (antalForekomster == 1) {
                    System.out.println("Indexplatsen för den första förekomsten av tecknet '" + tecken + "' är: " + i);
                }
            }
        }

        // Om tecknet förekommer i meningen, skriv ut indexplatsen för den sista förekomsten
        if (antalForekomster > 0) {
            int sistaForekomstIndex = mening.lastIndexOf(tecken);
            System.out.println("Indexplatsen för den sista förekomsten av tecknet '" + tecken + "' är: " + sistaForekomstIndex);
        } else {
            // Om tecknet inte förekommer i meningen, skriv ut ett meddelande om detta
            System.out.println("Tecknet '" + tecken + "' fanns inte i meningen.");
        }

        // Stänger Scanner-objektet när det inte längre används för att undvika resursläckage.
        textInput.close();
    }
}