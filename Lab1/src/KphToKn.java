/*
Denna kod konverterar Knop(kn) till Km/h. Beräkning görs genom att multiplicera den givna hastigheten i knop med
Km/h. Omvandlingsfaktorn är 1.852 Km/h per knop.
Detta program använder sig av float, vilket innebär att noggrannheten endast är 7 decimaler.
Dock så anser jag att noggrannhet inte behöver vara 15 decimaler vilket man hade fått genom att använda double.
Beräkningen: hastighetKnop * 1.852 = hastighetKm/h
Det finns ingen validering av input.
 */
import java.util.Scanner;
public class KphToKn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Skapar ett Scanner-objekt för input
        System.out.print("Skriv in en hastighet i knop: ");
        float hastighetKnop = scanner.nextFloat(); // Tar in input som en float
        System.out.println(hastighetKnop + " knop motsvarar " + (hastighetKnop * 1.852F) + " km/h"); // Skriver ut resultatet
        scanner.close(); // Stänger av skannern för att minimera resursläckage
    }
}