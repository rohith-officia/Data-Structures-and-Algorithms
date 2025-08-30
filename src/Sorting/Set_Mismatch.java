//https://leetcode.com/problems/set-mismatch?envType=problem-list-v2&envId=sorting

package Sorting;

import java.util.*;

public class Set_Mismatch {

    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] freq = new int[n + 1];  // To count occurrences of each number
        int duplicate = -1, missing = -1;

        // Count frequency of each number
        for (int num : nums) {
            freq[num]++;
        }

        // Find duplicate and missing
        for (int i = 1; i <= n; i++) {
            if (freq[i] == 2) {
                duplicate = i;
            } else if (freq[i] == 0) {
                missing = i;
            }
        }

        return new int[]{duplicate, missing};
    }

    public static void main(String[] args) {
        Set_Mismatch sol = new Set_Mismatch();

        // Test cases
        System.out.println(Arrays.toString(sol.findErrorNums(new int[]{1, 2, 2, 4}))); // [2, 3]
        System.out.println(Arrays.toString(sol.findErrorNums(new int[]{1, 1})));       // [1, 2]
        System.out.println(Arrays.toString(sol.findErrorNums(new int[]{2, 2})));       // [2, 1]
        System.out.println(Arrays.toString(sol.findErrorNums(new int[]{3, 2, 3, 4, 6, 5}))); // [3, 1]
    }
}
