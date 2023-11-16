/**
 * The AlmostCorrect class provides methods for determining if two strings are
 * "almost correct" based on Levenshtein distance.
 */
public class LevenshteinStringComparator {

    /**
     * The threshold for Levenshtein distance.
     * Strings with a distance equal to or below this threshold are considered "almost correct".
     */
    public static int threshold = 1; // Högre tröskel = mer förlåtande

    /**
     * Calculates the Levenshtein distance between two strings.
     *
     * @param s1 The first string.
     * @param s2 The second string.
     * @return The Levenshtein distance between the two strings.
     */
    public static int calculate(String s1, String s2) {
        /*
         * Skapar en tvådimensionell array för att lagra Levenshtein-distanser mellan delsträngar av två givna strängar.
         * Varje element i arrayen är av datatypen int, vilket gör det möjligt att lagra heltal.
         * Arrayens storlek är (s1.length() + 1) x (s2.length() + 1) för att täcka alla möjliga kombinationer av delsträngar,
         * inklusive tomma strängar och hela strängarna s1 och s2.
         *
         * Exempel:
         * Om s1 är "katt" (längd 4) och s2 är "hatt" (längd 4),
         * kommer arrayen att vara av dimensionen 5 x 5 för att täcka alla möjliga kombinationer av delsträngar,
         * inklusive tomma strängar och hela strängarna s1 och s2.
         *  */
        int[][] distance = new int[s1.length() + 1][s2.length() + 1];
        /*
         * Initialiserar den första kolumnen i Levenshtein-distansmatrisen 'distance'.
         * För varje rad i matrisen tilldelas värdet av radens index till motsvarande position i kolumnen.
         * Detta representerar insättning av tecken i den tomma strängen s2 för att matcha strängen s1.
         *
         * Exempel:
         * Om s1 är "katt" (längd 4),
         * kommer denna del av koden att sätta värdena i den första kolumnen av 'distance' som följer:
         *   distance[0][0] = 0 (tom sträng till tom sträng)
         *   distance[1][0] = 1 (sätt in 'k' i tom sträng)
         *   distance[2][0] = 2 (sätt in 'a' i tom sträng)
         *   distance[3][0] = 3 (sätt in 't' i tom sträng)
         *   distance[4][0] = 4 (sätt in 't' i tom sträng)
         */
        for (int i = 0; i <= s1.length(); i++) {
            distance[i][0] = i;
        }

        // Initiera första kolumnen i matrisen med konsekutiva heltal (0 till s2.length()).
        for (int j = 0; j <= s2.length(); j++) {
            distance[0][j] = j;
        }

        // Beräkna Levenshtein-distansen för varje position i matrisen.
        for (int i = 1; i <= s1.length(); i++) {
            for (int j = 1; j <= s2.length(); j++) {
                // Bestäm kostnaden för matchande tecken på de aktuella positionerna.
                // Om karaktärerna är lika är kostnaden 0, annars 1.
                int cost = (s1.charAt(i - 1) == s2.charAt(j - 1)) ? 0 : 1;

                // Uppdatera matrisen med den minsta kostnaden för att nå den aktuella positionen.
                distance[i][j] = Math.min(
                        Math.min(distance[i - 1][j] + 1, distance[i][j - 1] + 1),
                        distance[i - 1][j - 1] + cost
                );
            }
        }

        System.out.println("DEBUG: Levenshtein distance: " + distance[s1.length()][s2.length()]);
        return distance[s1.length()][s2.length()];
    }
    /**
     * Checks if two strings are "almost correct" based on Levenshtein distance.
     *
     * @param userTranslation    The user's input string.
     * @param correctTranslation The correct string for comparison.
     * @return True if the strings are almost correct; otherwise, false.
     */
    public static boolean isAlmostCorrect(String userTranslation, String correctTranslation) {
        int levDistance = calculate(userTranslation, correctTranslation);

        return levDistance <= threshold;
    }

    /**
     * Gets the current threshold for Levenshtein distance.
     *
     * @return The current threshold.
     */
    public static int getThreshold() {
        return threshold;
    }

    /**
     * Sets a new threshold for Levenshtein distance.
     *
     * @param newThreshold The new threshold to set.
     */
    public static void setThreshold(int newThreshold) {
        threshold = newThreshold;
    }
}
