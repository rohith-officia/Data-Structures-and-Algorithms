package Arrays;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        // Start with the first string as prefix
        String a = strs[0];

        // Compare with every other string
        for (int i = 1; i < strs.length; i++) {
            // While the current string doesn't start with 'a'
            while (strs[i].indexOf(a) != 0) {
                // Shrink 'a' by one character
                a = a.substring(0, a.length() - 1);

                // If 'a' becomes empty, no common prefix exists
                if (a.isEmpty()) {
                    return "";
                }
            }
        }

        return a;
    }

    // Main function to test
    public static void main(String[] args) {
        String[] strs1 = {"flower", "flow", "flight"};
        System.out.println("Longest Common Prefix: " + longestCommonPrefix(strs1)); // Output: "fl"

        String[] strs2 = {"dog", "racecar", "car"};
        System.out.println("Longest Common Prefix: " + longestCommonPrefix(strs2)); // Output: ""

        String[] strs3 = {"interspecies","interstellar","interstate"};
        System.out.println("Longest Common Prefix: " + longestCommonPrefix(strs3)); // Output: "inters"
    }
}

