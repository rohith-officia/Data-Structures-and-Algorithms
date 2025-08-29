package Strings;

import java.util.*;

public class ReverseString {
    public static void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }

    // Main function to test
    public static void main(String[] args) {
        char[] s1 = {'h', 'e', 'l', 'l', 'o'};
        reverseString(s1);
        System.out.println("Reversed: " + Arrays.toString(s1)); // Output: [o, l, l, e, h]

        char[] s2 = {'H', 'a', 'n', 'n', 'a', 'h'};
        reverseString(s2);
        System.out.println("Reversed: " + Arrays.toString(s2)); // Output: [h, a, n, n, a, H]
    }
}
