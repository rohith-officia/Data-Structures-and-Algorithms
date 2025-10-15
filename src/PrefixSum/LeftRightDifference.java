package PrefixSum;


import java.util.Arrays;

public class LeftRightDifference {

    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];

        // Step 1: Compute prefix sums of elements to the left
        arr[0] = 0;
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] + nums[i - 1];
        }

        // Step 2: Compute suffix sums on the right and take absolute difference
        int post = 0;
        for (int i = n - 1; i >= 0; i--) {
            arr[i] = Math.abs(arr[i] - post);
            post += nums[i];
        }

        return arr;
    }

    // Main method to test
    public static void main(String[] args) {
        LeftRightDifference solution = new LeftRightDifference();

        int[] nums = {10, 4, 8, 3};
        int[] result = solution.leftRightDifference(nums);

        System.out.println("Left-Right Difference: " + Arrays.toString(result));
    }
}

