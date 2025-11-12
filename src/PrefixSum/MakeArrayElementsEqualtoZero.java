package PrefixSum;

import java.util.*;

public class MakeArrayElementsEqualtoZero {

    public int countValidSelections(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];  // prefix[i] = sum of nums[0..i-1]
        int[] suffix = new int[n];  // suffix[i] = sum of nums[i+1..n-1]

        // Build prefix sum
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + nums[i - 1];
        }

        // Build suffix sum
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] + nums[i + 1];
        }

        int ans = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) continue;

            if (prefix[i] == suffix[i]) {
                ans += 2;
            } else if (Math.abs(prefix[i] - suffix[i]) == 1) {
                ans += 1;
            }
        }

        return ans;
    }

    // ✅ Main method to test your solution
    public static void main(String[] args) {
        MakeArrayElementsEqualtoZero obj = new MakeArrayElementsEqualtoZero();

        int[] nums = {0, 1, 2, 0, 3}; // You can change test cases here

        int result = obj.countValidSelections(nums);
        System.out.println("Valid selections count = " + result);
    }
}
