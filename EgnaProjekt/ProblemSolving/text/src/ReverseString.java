public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello World";
        String reverse = new StringBuffer(str).reverse().toString();
        System.out.println("String before reverse: " + str);
        System.out.println("String after reverse: " + reverse);

    }
}
