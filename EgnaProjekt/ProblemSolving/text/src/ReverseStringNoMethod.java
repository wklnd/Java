// Write a program that reverses a string without using any built-in methods.

public class ReverseStringNoMethod {
    public static void main(String[]args){
        String str = "Hello World";
        StringBuilder reverse = new StringBuilder();
        for (int i = str.length()-1; i >= 0; i--){
            reverse.append(str.charAt(i));
        }


        System.out.println("String before reverse: " + str);
        System.out.println("String after reverse: " + reverse);

    }
}
