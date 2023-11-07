/*
Denna kod konverterar Knop(kn) till Km/h. Beräkning görs genom att multiplicera den givna hastigheten i knop med
Km/h. Omvandlingsfaktorn är 1.852 Km/h per knop.
Detta program använder sig av float, vilket innebär att noggrannheten endast är 7 decimaler.
Dock så anser jag att noggrannhet inte behöver vara 15 decimaler vilket man hade fått genom att använda double.

Beräkningen:
(omvandlingsfaktor knop) * (hastigheten i  knop) = (hastigheten I km/h)

Det finns validering av input. Görs genom "matches("\\d+")" för att kontrollera om inputen innehåller siffror
 */

import java.util.Scanner;  // Importerar scanner klassen, använder den för att läsa av User-input

public class KphToKn2 {
    public static void main(String[] args) {
        System.out.println("Knop till Km/H konverterare!");

        float omvandlingsfaktor = 1.852F;
        float hastighet;
        Scanner scanner = new Scanner(System.in);  // Skapar ett Scanner-objekt för input

        System.out.print("Skriv in en hastighet i knop:");//Använder Print istället för Println så input är på samma rad
        String knop = scanner.nextLine();  // Läser av inmatning som en string, sparar i variabeln knop.

        // Denna del kontrollerar om inputen endast innehåller siffror, annars så kör den om loopen.
        while (true) {
            if (knop.matches("\\d+")) { // regex: \d = siffra, + = 1 eller fler
                break;
            } else {
                System.out.println("Ogiltig input. Ange endast siffror.");
                System.out.print("Skriv in en hastighet i knop:");
                knop = scanner.nextLine();
            }
        }
        float hastighetIKnop = Float.parseFloat(knop); // Konvertera knop till float
        hastighet = hastighetIKnop * omvandlingsfaktor;
        System.out.println(knop + " knop motsvarar: " + hastighet + " km/h");
        scanner.close(); // Stäng Scanner-objektet när det inte längre används för att undvika resursläckage
    }
}

