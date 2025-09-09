package Strings;

import java.util.HashMap;

public class LongestPalindrome {

    public int longestPalindrome(String s) {
        HashMap<Character , Integer> map = new HashMap<>();

        // Count frequency of each character
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        int count = 0, sum = 0;

        // Process frequencies
        for (char key : map.keySet()) {
            if (map.get(key) % 2 == 0) {
                sum += map.get(key);  // use all if even
            } else {
                sum += map.get(key) - 1; // use even part
                count++;                 // track odd freq
            }
        }

        // If we had at least one odd, place one char in center
        if (count > 0) {
            return sum + 1;
        }
        return sum;
    }

    // Main method for testing
    public static void main(String[] args) {
        LongestPalindrome lp = new LongestPalindrome();

        String s1 = "abccccdd";
        System.out.println("Input: " + s1);
        System.out.println("Longest Palindrome Length: " + lp.longestPalindrome(s1));
        // Expected: 7

        String s2 = "aA";
        System.out.println("Input: " + s2);
        System.out.println("Longest Palindrome Length: " + lp.longestPalindrome(s2));
        // Expected: 1

        String s3 = "bananas";
        System.out.println("Input: " + s3);
        System.out.println("Longest Palindrome Length: " + lp.longestPalindrome(s3));
        // Example run
    }
}
