/*
Omvandlar från binärt till hexadecimalt
 */
import java.util.Scanner;
public class BinaryToHex {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Skriv in ett binärt tal: ");
        String binary = scanner.nextLine();
        int decimal = Integer.parseInt(binary, 2);
        String hex = Integer.toString(decimal, 16);
        System.out.println("Binärtal: " + binary + " = " + "Hexadecimalt tal: " + hex.toUpperCase());
        scanner.close();


    }

}
