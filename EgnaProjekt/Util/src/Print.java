public class Print {
    public static void print(String text) {
        try {
            for (char c : text.toCharArray()) {
                System.out.print(c);

                Thread.sleep(100); // Adjust the delay time (in milliseconds) for the typewriter effect
            }
            System.out.println(); // Add a new line after printing the text
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

    }
}