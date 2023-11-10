/*
Användaren anger en siffra, sedan kommer programmet printa ut siffran * siffrans värde.
Input = 5
Output:
1
22
333
4444
55555
 */
import java.util.Scanner;
public class Utskriften {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ange ett heltal: ");
        int userInput = scanner.nextInt();

        if (userInput > 0) {
            // Om inmatningen är giltig, loopa från 1 till användarens inmatning
            for (int number = 1; number <= userInput; number++) {
                // Skriv ut numret upprepade gånger enligt dess värde
                for (int i = 0; i < number; i++) {
                    System.out.print(number + " ");
                }
                System.out.println(); // Ny rad efter varje iteration av den inre loopen
            }
        } else {
            System.out.println("Ogiltig inmatning. Ange ett positivt heltal.");
        }
    }
}