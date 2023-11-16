public class LevenshteinDistance {

    public static int calculateDistance(String s1, String s2) {
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];

        for (int i = 0; i <= s1.length(); i++) {
            for (int j = 0; j <= s2.length(); j++) {
                if (i == 0) {
                    dp[i][j] = j;
                } else if (j == 0) {
                    dp[i][j] = i;
                } else {
                    int cost = (s1.charAt(i - 1) == s2.charAt(j - 1)) ? 0 : 1;
                    dp[i][j] = min(
                            dp[i - 1][j] + 1,
                            dp[i][j - 1] + 1,
                            dp[i - 1][j - 1] + cost
                    );
                }
            }
        }
        return dp[s1.length()][s2.length()];
    }

    private static int min(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }
    public static void main(String[] args) {
        String str1 = "String 1"; // Replace with your first string
        String str2 = "String 1"; // Replace with your second string

        int distance = calculateDistance(str1, str2);
        System.out.println("The Levenshtein distance between '" + str1 + "' and '" + str2 + "' is: " + distance);
    }
}
