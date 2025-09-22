package TwoPointer;

import java.util.Arrays;

public class ShortestDistancetoaCharacter {

    // Method to find shortest distance to character c
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] result = new int[n];
        int pre = -n;  // initialize pre far to the left

        // Left → Right pass
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == c) {
                pre = i;
            }
            result[i] = i - pre;
        }

        pre = 2 * n;  // initialize pre far to the right

        // Right → Left pass
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == c) {
                pre = i;
            }
            result[i] = Math.min(result[i], pre - i);
        }

        return result;
    }

    // Main method to test
    public static void main(String[] args) {
        ShortestDistancetoaCharacter solver = new ShortestDistancetoaCharacter();
        String s = "loveleetcode";
        char c = 'e';
        int[] distances = solver.shortestToChar(s, c);
        System.out.println(Arrays.toString(distances));
    }
}
