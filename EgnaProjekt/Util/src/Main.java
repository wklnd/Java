import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
Kopiera texten nedan och klistra in det i en textfil.
Filen innehåller information om testresultat för ett antal studenter.
Skapa sedan ett program som kan läsa in och skriva ut alla studenter
tillsammans med medelvärdet av alla deras testresultat utan decimaler men korrekt avrundat.
 */
public class Main {
    public static void main(String[] args) {
        File studentScore = new File("/Users/oscar/Documents/GitHub/Java/EgnaProjekt/Util/src/StudentScore.txt");
        try {
            Scanner scanner = new Scanner(studentScore);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(" ");

                String studentName = parts[0];
                int[] testResults = new int[parts.length - 1];

                for (int i = 1; i < parts.length; i++) {
                    testResults[i - 1] = Integer.parseInt(parts[i]);
                }

                int sum = 0;
                for (int result : testResults) {
                    sum += result;
                }

                double average = (double) sum / testResults.length;
                int roundedAverage = (int) Math.round(average);

                System.out.println(studentName + " medelvärde: " + roundedAverage);
            }

            scanner.close();

        } catch (FileNotFoundException fileError){
            System.out.println("No File found");
            fileError.printStackTrace();
        }

    }
}
