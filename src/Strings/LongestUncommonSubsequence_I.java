package Strings;

public class LongestUncommonSubsequence_I {

    // Inner class Solution (same as on LeetCode)
    static class Solution {
        public int findLUSlength(String a, String b) {
            // If both strings are equal, no uncommon subsequence exists
            if (a.equals(b)) {
                return -1;
            }
            // Otherwise, the longer string itself is the answer
            return Math.max(a.length(), b.length());
        }
    }

    // Test the solution
    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.findLUSlength("aba", "cdc"));   // Output: 3
        System.out.println(sol.findLUSlength("aaa", "aaa"));   // Output: -1
        System.out.println(sol.findLUSlength("abc", "ab"));    // Output: 3
    }
}
