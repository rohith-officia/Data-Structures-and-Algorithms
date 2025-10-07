package Counting;

public class CheckWhetherTwoStringsareAlmostEquivalent {

    public boolean checkAlmostEquivalent(String word1, String word2) {
        int[] arr = new int[26];

        // Step 1: Count net frequency differences
        for (int c = 0; c < word1.length(); c++) {
            arr[word1.charAt(c) - 'a']++;
            arr[word2.charAt(c) - 'a']--;
        }

        // Step 2: Check if any difference exceeds 3
        for (int i = 0; i < 26; i++) {
            if (Math.abs(arr[i]) > 3) return false;
        }

        return true;
    }

    // Test the code
    public static void main(String[] args) {
        CheckWhetherTwoStringsareAlmostEquivalent obj = new CheckWhetherTwoStringsareAlmostEquivalent();

        String word1 = "abcde";
        String word2 = "abccde";
        System.out.println(obj.checkAlmostEquivalent(word1, word2)); // Output: true

        word1 = "aaaa";
        word2 = "bbbb";
        System.out.println(obj.checkAlmostEquivalent(word1, word2)); // Output: false

        word1 = "abcabc";
        word2 = "abcabc";
        System.out.println(obj.checkAlmostEquivalent(word1, word2)); // Output: true
    }
}
