import java.util.Scanner;

public class HoursToSecond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double secondPerHour = 3600;
        System.out.print("Skriv in antal timmar: ");
        double hours = scanner.nextDouble();
        double seconds = hours * secondPerHour;
        System.out.println(hours + " timmar är " + seconds +" sekunder.");



    }
}
