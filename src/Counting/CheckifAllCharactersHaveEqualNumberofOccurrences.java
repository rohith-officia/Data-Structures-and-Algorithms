package Counting;

public class CheckifAllCharactersHaveEqualNumberofOccurrences {

    public boolean areOccurrencesEqual(String s) {
        int[] arr = new int[26];

        // Step 1: Count frequency of each character
        for (char c : s.toCharArray()) {
            arr[c - 'a']++;
        }

        // Step 2: Frequency of the first character
        int check = arr[s.charAt(0) - 'a'];

        // Step 3: Verify all characters
        for (char c : s.toCharArray()) {
            if (arr[c - 'a'] != check) {
                return false;
            }
        }

        // Step 4: All counts are equal
        return true;
    }

    // Test the code
    public static void main(String[] args) {
        CheckifAllCharactersHaveEqualNumberofOccurrences obj = new CheckifAllCharactersHaveEqualNumberofOccurrences();

        System.out.println(obj.areOccurrencesEqual("aabb")); // true
        System.out.println(obj.areOccurrencesEqual("abcabc")); // true
        System.out.println(obj.areOccurrencesEqual("aabbc")); // false
    }
}
