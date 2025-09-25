package Sorting;

import java.util.Arrays;

public class MaximizeSumOfArrayAfterKNegations {

    public int largestSumAfterKNegations(int[] nums, int k) {
        // Step 1: Sort the array (smallest to largest)
        Arrays.sort(nums);

        // Step 2: Flip negative numbers to positive while k > 0
        for (int i = 0; i < nums.length && k > 0; i++) {
            if (nums[i] < 0) {
                nums[i] = -nums[i];  // flip sign
                k--;
            }
        }

        // Step 3: Re-sort so that the smallest element is at nums[0]
        Arrays.sort(nums);

        // Step 4: If k is odd, flip the smallest element
        if (k % 2 == 1) {
            nums[0] = -nums[0];
        }

        // Step 5: Calculate the sum
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }

        return sum;
    }

    // Main method to test
    public static void main(String[] args) {
        MaximizeSumOfArrayAfterKNegations obj = new MaximizeSumOfArrayAfterKNegations();

        int[] nums1 = {-3, -1, 2, 4};
        int k1 = 2;
        System.out.println("Result 1: " + obj.largestSumAfterKNegations(nums1, k1));
        // Expected: 10

        int[] nums2 = {4, 2, 3};
        int k2 = 1;
        System.out.println("Result 2: " + obj.largestSumAfterKNegations(nums2, k2));
        // Expected: 5

        int[] nums3 = {2, -3, -1, 5, -4};
        int k3 = 2;
        System.out.println("Result 3: " + obj.largestSumAfterKNegations(nums3, k3));
        // Expected: 13
    }
}
