package PrefixSum;

public class EqualScoreSubstrings {

    // Function to check if score can be balanced
    public boolean scoreBalance(String s) {
        int total = 0;

        // Calculate total score of string
        for (char c : s.toCharArray()) {
            total += c - 'a' + 1;  // 'a' = 1, 'b' = 2, ... 'z' = 26
        }

        int prefix = 0;

        // Check prefix sum
        for (char c : s.toCharArray()) {
            prefix += c - 'a' + 1;

            if (2 * prefix == total) {
                return true; // valid split found
            }
        }
        return false;
    }

    // Main method to test
    public static void main(String[] args) {
        EqualScoreSubstrings obj = new EqualScoreSubstrings();

        System.out.println(obj.scoreBalance("abc")); // true (1+2 == 3)
        System.out.println(obj.scoreBalance("abcd")); // false (no equal score split)
        System.out.println(obj.scoreBalance("zab")); // true (26 == 1+2+26 ? no but prefix 26 == suffix 3? try multiple)
        System.out.println(obj.scoreBalance("aabb")); // true (2+2 == 2+2)
    }
}
