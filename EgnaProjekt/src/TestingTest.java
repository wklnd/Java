import java.util.Scanner;
class TestingTest{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text 1: ");
        String text1 = scanner.nextLine();
        System.out.println("Enter text 2: ");
        String text2 = scanner.nextLine();

        if(text1.equals(text2)){
            System.out.println("The texts are equal!");
        } else {
            System.out.println("The texts are not equal!");
        }
        scanner.close();
    }
}