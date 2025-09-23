package TwoPointer;

import java.util.Scanner;

public class RemovePalindromicSubsequences {

    // Function to return minimum steps to remove the string
    public int removePalindromeSub(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return 2; // Not a palindrome → needs 2 steps
            }
            left++;
            right--;
        }
        return 1; // Already a palindrome → 1 step
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string consisting of only 'a' and 'b':");
        String s = sc.nextLine();

        RemovePalindromicSubsequences solution = new RemovePalindromicSubsequences();
        int steps = solution.removePalindromeSub(s);

        System.out.println("Minimum steps to remove the string: " + steps);
        sc.close();
    }
}
