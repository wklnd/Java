/*
Modifiera programmet så att det istället tar in en temperatur i Fahrenheit från användaren och konverterar till Kelvin.
Formel för konverteringen: (Fahrenheit - 32) / 1.8 +  273.15.
 */
import java.util.Scanner;
public class FahrenheitTillKelvin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Skriv in en temperatur i Fahrenheit: ");
        float fahrenheit = scanner.nextFloat();

        // Mer exakt, skriver ut decimaler
        System.out.println(fahrenheit + " Fahrenheit är " + ((fahrenheit - 32) / 1.8F + 273.15F) + " Kelvin");
        // Mindre exakt, skriver endast ut heltal.
        System.out.println((int)fahrenheit + " Fahrenheit är " + (int)((fahrenheit - 32) / 1.8F + 273.15F) + " Kelvin");
    }
}
