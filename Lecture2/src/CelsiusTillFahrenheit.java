/*
Konstruera ett program som tar in en temperatur i Celsius från användaren och konverterar den till Fahrenheit och meddelar svaret till användaren.
 */
import java.util.Scanner;
public class CelsiusTillFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Skriv in en temperatur i Celsius: ");
        float celsius = scanner.nextFloat();
        // Mindre exakt, får endast heltal
        System.out.println((int)celsius + " grader Celsius motsvarar " + (int)(celsius * 1.8F + 32F) + " grader Fahrenheit");
        //Mer exakt, får decimaltal
        System.out.println(celsius + " grader Celsius motsvarar " + (celsius * 1.8F + 32F) + " grader Fahrenheit");

    }
}
