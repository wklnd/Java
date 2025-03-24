public class Main {
    public static void main(String[] args) {
        var p = new Person();
        p.firstName = "John";
        p.lastName = "Doe";
        p.yearOfBirth = 1980;
        p.isMarried = true;
        System.out.println(p.firstName + " " + p.lastName + " " + p.yearOfBirth + " and its " + p.isMarried + " that he is married.");
    }
}
class Person{
    String firstName, lastName;
    int yearOfBirth;
    boolean isMarried;
}