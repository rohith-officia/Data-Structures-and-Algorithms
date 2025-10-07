package Counting;

import java.util.HashMap;
import java.util.Map;

public class CountNumberofPairsWithAbsoluteDifferenceK {

    // Optimized Solution using HashMap
    static class Solution {
        public int countKDifference(int[] nums, int k) {
            Map<Integer, Integer> map = new HashMap<>();
            int count = 0;

            for (int num : nums) {
                // Check if num+k exists (forms a valid pair)
                count += map.getOrDefault(num + k, 0);
                // Check if num-k exists (forms a valid pair)
                count += map.getOrDefault(num - k, 0);

                // Add current num to map
                map.put(num, map.getOrDefault(num, 0) + 1);
            }

            return count;
        }
    }

    // Alternative approach using a fixed-size array (works if nums[i] ≤ 1000)
    /*
    static class SolutionArray {
        public int countKDifference(int[] nums, int k) {
            int[] hash = new int[1001]; // adjust size based on constraints
            int n = nums.length;

            // Count frequency of each number
            for (int i = 0; i < n; i++) {
                hash[nums[i]]++;
            }

            int ans = 0;
            // Count valid pairs
            for (int i = 0; i < n; i++) {
                int diff = nums[i] + k;
                if (diff < hash.length) {
                    ans += hash[diff];
                }
            }
            return ans;
        }
    }
    */

    // Test the code
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums = {1, 2, 2, 1};
        int k = 1;

        System.out.println("Number of pairs with difference " + k + " : " + sol.countKDifference(nums, k));
        // Expected Output: 4
    }
}
