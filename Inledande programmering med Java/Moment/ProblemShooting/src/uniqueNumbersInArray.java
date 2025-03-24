import java.util.ArrayList;
import java.util.Scanner;

public class uniqueNumbersInArray {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);

        //först skall användaren skriva in en siffra
        //detta kontrollerar att användaren inputar en int, om man skriver en string får man skriva om
        int numberOfNumbers = IntInput("Hur många heltal vill du ange: ");
        System.out.println(numberOfNumbers);

        //skapa en array av alla tal
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        System.out.println("Ange " + numberOfNumbers + " tal");
        for (int i = 0; i < numberOfNumbers; i++) {
            numbers.add(IntInput("Ange heltal " + (i+1) + ": "));

        }

        System.out.println("Du angav " + numberOfNumbers + "tal");

        //här skall programmet räkna ut hur många av talen som angavs bara en gång

        //till sist skall programmet räkna ut medelvärdet för alla tal
    }

    public static int IntInput(String message) {
        //denna metod tar in ett tal och kontrollerar sedan att det är en int
        //om det inte är en int får man error och får skriva om
        int userInput = 0;
        boolean error = false;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println(message);
            try {
                userInput = scanner.nextInt();
                error = false;
            } catch (Exception e) {
                System.out.println("Ogiltigt värde! Skriv om!");
                scanner.nextLine();//ERROR---------------------------------------------------------
                error = true;
            }
            //scanner.nextLine();//ERROR---------------------------------------------------------
        } while (error == true);
        scanner.nextLine();
        scanner.close();
        return userInput;
    }
}