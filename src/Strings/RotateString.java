//https://leetcode.com/problems/rotate-string

package Strings;

public class RotateString {
    public boolean rotateString(String s, String goal) {
        // If lengths are different, they cannot be rotations
        if (s.length() != goal.length()) return false;
        // Concatenate s with itself and check if goal is a substring
        return (s + s).contains(goal);
    }

    // Optional: main method to test
    public static void main(String[] args) {
        RotateString sol = new RotateString();

        String s1 = "abcde";
        String goal1 = "cdeab";
        System.out.println(sol.rotateString(s1, goal1)); // true

        String s2 = "abcde";
        String goal2 = "abced";
        System.out.println(sol.rotateString(s2, goal2)); // false
    }
}

