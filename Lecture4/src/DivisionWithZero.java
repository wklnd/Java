public class DivisionWithZero {
    /*
    Konstruera ett program som gör en division med 0 (noll) och fångar det ArithmeticException som kastas,
    gör en utskrift (välj själv vad som skrivs ut) och går vidare.
     */

    public static void main(String[]args){
        int number = 5;
        int result;

        try {
            result = number / 0;
        }
        catch(ArithmeticException e) {
            System.out.println("Sjukt Tydlig Error Code");
        }

    }
}
