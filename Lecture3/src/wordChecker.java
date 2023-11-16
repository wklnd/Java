/*
Konstruera ett program som tar in en mening och ett ord från användaren.
Programmet ska sedan skriva ut om meningen, börjar med ordet och om meningen avslutas med ordet.
Programmet ska inte ta hänsyn till stora och små bokstäver så 'Boll' och 'boll' ska bedömas som samma ord.
 */

import java.util.Scanner;

public class wordChecker {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Skriv in en mening: ");
        String sentence = scanner.nextLine();
        System.out.print("Skriv in ett ord: ");
        String word = scanner.nextLine();
        if (sentence.toLowerCase().startsWith(word.toLowerCase())){
            System.out.println("Meningen börjar med ordet "+ word);
        } else {
            System.out.println("Meningen börjar inte med ordet "+ word);
        }

        if(sentence.toLowerCase().endsWith(word.toLowerCase())){
            System.out.println("Meningen slutar med ordet " + word);
        } else {
            System.out.println("Meningen slutar inte med ordet " + word);
        }

    }
}
