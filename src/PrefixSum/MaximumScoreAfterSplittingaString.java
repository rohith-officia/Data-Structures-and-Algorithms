package PrefixSum;

public class MaximumScoreAfterSplittingaString {

    public int maxScore(String s) {
        int totalOnes = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') totalOnes++;
        }

        int leftZeros = 0;
        int leftOnes = 0;
        int maxScore = Integer.MIN_VALUE;

        // split before last character
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0') leftZeros++;
            else leftOnes++;

            int score = leftZeros + (totalOnes - leftOnes);
            maxScore = Math.max(maxScore, score);
        }

        return maxScore;
    }

    // Optional: main method to test
    public static void main(String[] args) {
        MaximumScoreAfterSplittingaString solver = new MaximumScoreAfterSplittingaString();
        String s = "011101";
        System.out.println("Max score: " + solver.maxScore(s)); // Output should be 5
    }
}
