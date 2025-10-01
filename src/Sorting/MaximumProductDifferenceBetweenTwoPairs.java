package Sorting;

public class MaximumProductDifferenceBetweenTwoPairs {

    public int maxProductDifference(int[] nums) {

        // Variables to track two smallest and two largest numbers
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;

        for (int num : nums) {
            // Find two smallest
            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }

            // Find two largest
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
        }

        return (max1 * max2) - (min1 * min2);
    }

    // Arrays.sort(nums);
    // return (nums[nums.length-1] * nums[nums.length-2]) - (nums[0] * nums[1]);

    // Main method for testing
    public static void main(String[] args) {
        MaximumProductDifferenceBetweenTwoPairs obj = new MaximumProductDifferenceBetweenTwoPairs();

        int[] nums1 = {5, 6, 2, 7, 4};
        System.out.println("Result 1: " + obj.maxProductDifference(nums1));
        // Expected: (7*6) - (2*4) = 42 - 8 = 34

        int[] nums2 = {4, 2, 5, 9, 7, 4, 8};
        System.out.println("Result 2: " + obj.maxProductDifference(nums2));
        // Expected: (9*8) - (2*4) = 72 - 8 = 64
    }
}
