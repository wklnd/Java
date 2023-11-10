import java.util.Scanner;
public class MenyVal {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Samtalsbokning");
        System.out.println("2. Avbokning");
        System.out.println("3. Telefonist");
        System.out.println("4. Avsluta");
        System.out.print("Välj ett av följande alternativ: ");
        int val = scanner.nextInt();

        if (val == 1){
            System.out.println("Samtalsbokning");
        }
        else if (val == 2){
            System.out.println("Avbokning");
        } else if (val == 3) {
           System.out.println("Telefonist");
        } else if (val == 4) {
            System.out.println("Avsluta");
        } else {
            System.out.println("Felaktigt val");
        }

    }
}
