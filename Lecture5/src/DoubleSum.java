public class DoubleSum {
    //Konstruera metoden sumOfNumbers som tar två parametrar av typen double. Metoden skall returnera summan av parametrarna.


    static double sumOfNumbers(double a, double b) {

        return a + b;
    }
    static int smallestNumber(int a, int b){
        if (a > b){
            return b;
        } else {
            return a;

        }
    }
    static boolean loopDouble(int a){
        if(a > 0){
            for(int i = 1; i <= (a*2); i++){
                System.out.print(i + " ");
            }
            return true;
        }else{
            System.out.println("error");
            return false;
        }
    }

    public static void main(String[]args){

        System.out.println(sumOfNumbers(2.5, 3.5));
    }


}
