import java.util.Scanner;

public class MovieDatabaseUI {

    public void startUI() {
        Scanner scanner = new Scanner(System.in);
        int input;
        boolean quit = false;
        System.out.println("** Welcome to the Movie Database **");
        System.out.println("1. Add a movie\n2. Search review score\n3. Add Movie");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        input = scanner.nextInt();
        while(!quit) {
            switch(input) {
                case 1: searchTitle(); break;
                case 2: System.out.println("2"); break;
                case 3: System.out.println("3"); break;
                case 4: quit = true;
            }
        }

    }

    private void searchTitle() {
        System.out.println("searchTitle()");
    }
}