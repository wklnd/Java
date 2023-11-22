/*
Konstruera ett program som tar in decimaltal och visar talet multiplicerat med sig själv och
sedan låter användaren skriva in ett nytt decimaltal.
Talen ska först läsas in som text och sedan göras om till tal.
Programmet ska kunna avslutas genom att 'q' anges istället för ett decimaltal.
Om användaren inte anger ett decimaltal eller 'q' ska ett felmeddelande
visas och användaren ska få en ny chans att ange ett decimaltal.
 */
import java.util.Scanner;
public class DecimalMultiplication {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        String input;
        double floatNumber = 0;
        while(true){
            System.out.println("Ange ett decimaltal, eller q för att avsluta");
            if(scanner.hasNext("q")){
                System.out.println("Bye bye");
                break;
            }else if(scanner.hasNextLine()){
                input = scanner.nextLine();
                try {
                    floatNumber = Double.parseDouble(input);
                    floatNumber = floatNumber*floatNumber;
                    System.out.println(floatNumber);
                }
                catch (NumberFormatException e) {
                    System.out.println("Error osv");
                    floatNumber = 0;
                }
            }
        }
    }
}
