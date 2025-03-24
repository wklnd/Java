/*
Konstruera ett program som läser in en int och om något annat än en int matas in så skall metoden fånga felet
(InputMismatchException), skriva ut ett felmeddelande och be användaren att mata in ett heltal. Detta fortsätter tills
användaren matar in ett heltal. När användaren har matat in ett heltal, ska heltalet skrivas ut.


 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class MustInputInt {
    public static void main(String[]args){
        boolean wentToCatch = true;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("Skriv in ett heltal: ");
            try{
                int intNum = scanner.nextInt();
                System.out.println("Korrekt!");
                wentToCatch = false;

            }catch(InputMismatchException e){
                System.out.println("Error, försök igen noob");
                scanner.nextLine();
            }
        }while(wentToCatch);

    }
}
