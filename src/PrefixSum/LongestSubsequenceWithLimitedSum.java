package PrefixSum;

import java.util.*;

public class LongestSubsequenceWithLimitedSum {
        // -------------------------------
        // Version 1: Original Linear Count
        // -------------------------------
        public int[] answerQueriesLinear(int[] nums, int[] queries) {
            int n = nums.length;
            int[] prefix = new int[n];
            int pre = 0;

            Arrays.sort(nums);

            // Compute prefix sums
            for (int i = 0; i < n; i++) {
                prefix[i] = nums[i] + pre;
                pre = prefix[i];
            }

            // Count how many prefix sums <= query
            for (int i = 0; i < queries.length; i++) {
                int count = 0;
                for (int j = 0; j < prefix.length; j++) {
                    if (prefix[j] <= queries[i]) {
                        count++;
                    }
                }
                queries[i] = count;
            }

            return queries;
        }

        // ----------------------------------------
        // Version 2: Optimized with Binary Search
        // ----------------------------------------
        public int[] answerQueriesBinary(int[] nums, int[] queries) {
            Arrays.sort(nums);

            int[] res = new int[queries.length];

            for (int i = 1; i < nums.length; ++i)
                nums[i] += nums[i - 1];

            for (int i = 0; i < queries.length; ++i) {
                int j = Arrays.binarySearch(nums, queries[i]);
                res[i] = Math.abs(j + 1);
            }

            return res;// number of sums <= query
        }

        // -------------------------------
        // Main method to test both versions
        // -------------------------------
        public static void main(String[] args) {
            LongestSubsequenceWithLimitedSum sol = new LongestSubsequenceWithLimitedSum();

            int[] nums = {4, 5, 2, 1};
            int[] queries1 = {3, 10, 21};
            int[] queries2 = {3, 10, 21};

            int[] resLinear = sol.answerQueriesLinear(nums.clone(), queries1);
            System.out.println("Linear Approach: " + Arrays.toString(resLinear));

            int[] resBinary = sol.answerQueriesBinary(nums.clone(), queries2);
            System.out.println("Binary Search Approach: " + Arrays.toString(resBinary));
        }
    }



