import java.util.Scanner;

public class Average {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int a,b,c;
        System.out.println("Skriv in det första talet: ");
        a = scanner.nextInt();
        System.out.println("Skriv in det andra talet: ");
        b = scanner.nextInt();
        System.out.println("Skriv in det tredje talet: ");
        c = scanner.nextInt();
        System.out.println("Medelvärdet av talen är: " + (a+b+c)/3);


    }
}
