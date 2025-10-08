package Counting;

public class MaximumCountofPositiveIntegerandNegativeInteger {

    public int maximumCount(int[] nums) {
        int arr[] = new int[2]; // arr[0] = negatives, arr[1] = positives

        for (int i : nums) {
            if (i < 0) arr[0]++;
            if (i > 0) arr[1]++;
        }

        return Math.max(arr[0], arr[1]);
    }

    // Test the function
    public static void main(String[] args) {
        MaximumCountofPositiveIntegerandNegativeInteger obj = new MaximumCountofPositiveIntegerandNegativeInteger();

        int[] nums1 = {-2, -1, -3, 4, 5};
        System.out.println(obj.maximumCount(nums1)); // Output: 3 (negatives)

        int[] nums2 = {0, 1, 2, 3, -1};
        System.out.println(obj.maximumCount(nums2)); // Output: 3 (positives)

        int[] nums3 = {0, 0, 0};
        System.out.println(obj.maximumCount(nums3)); // Output: 0 (no positives or negatives)
    }
}
