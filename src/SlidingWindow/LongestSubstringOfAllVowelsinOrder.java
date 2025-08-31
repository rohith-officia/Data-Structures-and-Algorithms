// https://leetcode.com/problems/longest-substring-of-all-vowels-in-order?envType=problem-list-v2&envId=sliding-window

package SlidingWindow;

public class LongestSubstringOfAllVowelsinOrder {

    public int longestBeautifulSubstring(String word) {
        int n = word.length();
        int maxLen = 0;
        int currLen = 1;   // current substring length
        int vowelCount = 1; // distinct vowels count (start with first char)

        for (int i = 1; i < n; i++) {
            if (word.charAt(i) >= word.charAt(i - 1)) {
                currLen++;
                if (word.charAt(i) > word.charAt(i - 1)) {
                    vowelCount++;
                }
            } else {
                currLen = 1;
                vowelCount = 1;
            }

            if (vowelCount == 5) {
                maxLen = Math.max(maxLen, currLen);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        LongestSubstringOfAllVowelsinOrder sol = new LongestSubstringOfAllVowelsinOrder();

        // Testcase 1
        String word1 = "aeiaaioaaaaeiiiiouuuooaauuaeiu";
        System.out.println("Input: " + word1);
        System.out.println("Longest Beautiful Substring Length: " + sol.longestBeautifulSubstring(word1));

        // Testcase 2
        String word2 = "aeeeiiiioooauuuaeiou";
        System.out.println("\nInput: " + word2);
        System.out.println("Longest Beautiful Substring Length: " + sol.longestBeautifulSubstring(word2));

        // Testcase 3
        String word3 = "aaiiou";
        System.out.println("\nInput: " + word3);
        System.out.println("Longest Beautiful Substring Length: " + sol.longestBeautifulSubstring(word3));
    }
}
