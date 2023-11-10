import java.util.Scanner;
public class KnotToKph3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Skapar ett Scanner-objekt för input
        boolean validInput = false; // En bool för att kolla om input är ett heltal eller inte
        float knop = 0;
        while (!validInput) {
            // När användaren anger ett heltal, sätts validInput till true
            // och därmed bryts loopen eftersom !validInput blir falskt
            // Utropstecknet "!" används för att invertera det logiska uttrycket.
            System.out.print("Skriv in en hastighet i knop: ");
            if (scanner.hasNextFloat()) {
                knop = scanner.nextFloat();
                validInput = true;
            } else {
                System.out.println("Felaktig input. Vänligen ange ett heltal.");
                scanner.next(); // för att rensa skannern.
            }
        }
        // Gör beräkningen.
        System.out.println("Du angav hastigheten: " + knop + " knop");
        System.out.println(knop+" knop motsvarar "+ knop * 1.852F + " km/h");
        scanner.close(); // Stänger av skannern för att minimera resursläckage
    }
}