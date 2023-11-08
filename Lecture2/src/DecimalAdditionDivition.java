/*
Konstruera ett program som tar in två decimaltal från användaren, adderar de och dividerar summan med 1,8 och sedan skriver ut talen och kvoten.
 */

import java.util.Scanner;

public class DecimalAdditionDivition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Skriv in ett decimaltal: ");
        float a = scanner.nextFloat();
        System.out.print("Skriv in ett till decimaltal: ");
        float b = scanner.nextFloat();
        System.out.println("(" + a + "+" + b + ")" + "/1.8" + "=" + (a+b)/1.8);



    }
}
