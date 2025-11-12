package PrefixSum;

import java.util.*;

public class MinimumPositiveSumSubarray {

    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();
        int inf = Integer.MAX_VALUE;
        int minSum = inf;

        int[] prefix = new int[n + 1];
        prefix[0] = 0;

        // Build prefix sum array
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums.get(i);
        }

        // Check all subarrays of length [l..r]
        for (int i = 0; i < n; i++) {
            for (int len = l; len <= r && i + len <= n; len++) {
                int j = i + len;
                int sum = prefix[j] - prefix[i];
                if (sum > 0) {
                    minSum = Math.min(minSum, sum);
                }
            }
        }

        return minSum == inf ? -1 : minSum;
    }

    // ✅ Main Method for testing
    public static void main(String[] args) {
        MinimumPositiveSumSubarray obj = new MinimumPositiveSumSubarray();

        List<Integer> nums = Arrays.asList(3, -2, 1, 2); // Example input
        int l = 2;
        int r = 3;

        int result = obj.minimumSumSubarray(nums, l, r);
        System.out.println("Minimum Positive Subarray Sum = " + result);
    }
}
