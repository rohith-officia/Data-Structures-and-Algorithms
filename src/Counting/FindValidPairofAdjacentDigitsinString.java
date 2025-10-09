package Counting;

public class FindValidPairofAdjacentDigitsinString {

    public static class Solution {
        public String findValidPair(String s) {
            int[] freq = new int[10];

            // Step 1: Count frequency of each digit (0–9)
            for (char c : s.toCharArray()) {
                freq[c - '0']++;
            }

            // Step 2: Traverse the string and check adjacent pairs
            for (int i = 1; i < s.length(); i++) {
                char prev = s.charAt(i - 1);
                char curr = s.charAt(i);

                // Valid pair if:
                // 1️⃣ Adjacent digits are different
                // 2️⃣ Each digit’s frequency equals its numeric value
                if (prev != curr &&
                        freq[prev - '0'] == (prev - '0') &&
                        freq[curr - '0'] == (curr - '0')) {

                    // Return the first valid pair found
                    return s.substring(i - 1, i + 1);
                }
            }

            // Step 3: Return empty string if no valid pair found
            return "";
        }
    }

    // Optional: main method for quick testing
    public static void main(String[] args) {
        Solution sol = new Solution();

        String s1 = "343334";
        String s2 = "122333";
        String s3 = "55555";

        System.out.println(sol.findValidPair(s1));
        System.out.println(sol.findValidPair(s2));
        System.out.println(sol.findValidPair(s3));
    }
}
