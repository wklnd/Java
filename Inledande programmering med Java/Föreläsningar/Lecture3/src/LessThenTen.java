/*
Ett javaprogram som tar in en input (int), därefter kontrollerar om input är > eller < än 10.
 */

import java.util.Scanner;
public class LessThenTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Skriv in ett heltal: ");
        int heltal = scanner.nextInt();
        if (heltal < 10) {
            System.out.println("Talet är mindre än 10");
        }
        else if (heltal == 10) {
            System.out.println("Talet är 10");
        }
        else {
            System.out.println("Talet är större än 10");
        }
    }
}
