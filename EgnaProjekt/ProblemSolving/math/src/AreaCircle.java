import java.util.Scanner;
public class AreaCircle {
    //A = π * r²
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Skriv in radien på cirkeln:");
        float radius = scanner.nextFloat();
        float area = (float) (Math.PI * Math.pow(radius, 2));
        System.out.println("Arean är " + area + " enheter.");
        System.out.println("Omkretesen är " + (2*Math.PI*radius) + " enheter.");

    }
}
