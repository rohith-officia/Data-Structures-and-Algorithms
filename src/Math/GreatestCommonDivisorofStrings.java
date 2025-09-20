package Math;

public class GreatestCommonDivisorofStrings {

    public String gcdOfStrings(String str1, String str2) {
        // Step 1: If concatenations don't match, no common divisor exists
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        // Step 2: Find gcd of lengths
        int gcdLength = gcd(str1.length(), str2.length());

        // Step 3: Return substring of gcd length
        return str1.substring(0, gcdLength);
    }

    // Euclidean algorithm to compute gcd
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    // Main method to test the function
    public static void main(String[] args) {
        GreatestCommonDivisorofStrings solver = new GreatestCommonDivisorofStrings();

        // Test cases
        System.out.println(solver.gcdOfStrings("ABCABC", "ABC"));   // Output: "ABC"
        System.out.println(solver.gcdOfStrings("ABABAB", "ABAB")); // Output: "AB"
        System.out.println(solver.gcdOfStrings("LEET", "CODE"));   // Output: ""
        System.out.println(solver.gcdOfStrings("AAAAAA", "AAA"));  // Output: "AAA"
    }
}
