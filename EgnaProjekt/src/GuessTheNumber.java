import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Skapar objektet scanner.
        Random random = new Random(); // Skapar objektet random, som kommer användas för att generera random int.

        int randInt = 0;
        int guess = 0;
        int antalGissningar = 0;

        System.out.println("Gissa Numret! \nSvårighetsgrader.");
        System.out.println("1. Lätt\n2. Medium \n3. Svårt \n4. Omöjligt\n Välj Svårighetsgrad: ");
        int difficultyLevel = scanner.nextInt();

        if (difficultyLevel == 1){
            System.out.println("Du valde Lätt");
            randInt = random.nextInt(10);
        }
        else if (difficultyLevel == 2){
            System.out.println("Du valde Medium");
            randInt = random.nextInt(20);
        }
        else if (difficultyLevel == 3){
            System.out.println("Du valde Svår");
            randInt = random.nextInt(50);
        }
        else if (difficultyLevel == 4){
            System.out.println("Du valde Omöjlig");
            randInt = random.nextInt(1000);
        }
        else{
            System.out.print("Felaktig Input. ");
        }
        //System.out.println(randInt);
        System.out.println("Gissa numret!");
        while(randInt != guess){

            guess = scanner.nextInt();
            if (guess == randInt){
                System.out.println("Det var rätt!");
                System.out.println("Det tog "+ antalGissningar +" försök!");
                break;
            }
            antalGissningar ++;
            System.out.println("Det var fel!\nFörsök igen: ");


        }
    }
}