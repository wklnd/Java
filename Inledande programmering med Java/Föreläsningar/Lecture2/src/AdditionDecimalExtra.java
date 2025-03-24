/*
Konstruera ett program som tar in två decimaltal från användaren, adderar de och sedan skriver ut talen och summan utan decimaler (inte avrundat utan genom att bara ta bort decimalerna).
 */
import java.util.Scanner;
public class AdditionDecimalExtra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Skriv in ett decimaltal: ");
        float a = scanner.nextFloat();
        System.out.print("Skriv in ett till decimaltal: ");
        float b = scanner.nextFloat();
        System.out.println(a + "+" +b + "=" + (int)(a+b));

    }
}
