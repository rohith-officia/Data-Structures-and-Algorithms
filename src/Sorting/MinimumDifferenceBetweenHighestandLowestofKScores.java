package Sorting;

import java.util.Arrays;

public class MinimumDifferenceBetweenHighestandLowestofKScores {

    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);  // Step 1: Sort the array

        int i = 0, j = k - 1;
        int min = Integer.MAX_VALUE;

        // Step 2: Slide a window of size k across the array
        while (j < nums.length) {
            min = Math.min(min, nums[j] - nums[i]);
            i++;
            j++;
        }
        return min;
    }

    // Main method for testing
    public static void main(String[] args) {
        MinimumDifferenceBetweenHighestandLowestofKScores obj =
                new MinimumDifferenceBetweenHighestandLowestofKScores();

        int[] nums1 = {9, 4, 1, 7};
        int k1 = 2;
        System.out.println("Result 1: " + obj.minimumDifference(nums1, k1));
        // Expected: 2

        int[] nums2 = {90};
        int k2 = 1;
        System.out.println("Result 2: " + obj.minimumDifference(nums2, k2));
        // Expected: 0

        int[] nums3 = {1, 3, 6, 10, 15};
        int k3 = 3;
        System.out.println("Result 3: " + obj.minimumDifference(nums3, k3));
        // Expected: 4 (window [1,3,6] -> 6-1 = 5, [3,6,10] -> 10-3 = 7, [6,10,15] -> 15-6 = 9)
    }
}
