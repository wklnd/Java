/*
Konstruera ett program som skriver ut en
"*" på första raden,
"**" på andra raden,
"***" på tredje raden osv upp till
"**********" på tionde raden.
 */
public class AsterixRow {
    public static void main(String[]args){
        int row = 1;
        int count = 0;
        for(int i = 0; i < 10; i++){
            while(count < row){
                System.out.print("*");
                count++;
            }
            System.out.println();
            row++;
            count = 0;
        }
    }
}
