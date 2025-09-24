package PrefixSum;

public class MinimumValuetoGetPositiveStepbyStepSum {

    // Core method
    public int minStartValue(int[] nums) {
        int sum = 0;        // running prefix sum
        int minPref = 0;    // track the minimum prefix sum (start at 0)

        for (int n : nums) {
            sum += n;
            minPref = Math.min(minPref, sum);
        }

        // If minPref >= 0 → return 1
        // Otherwise → return 1 - minPref
        return (minPref >= 0) ? 1 : 1 - minPref;
    }

    // Main method for quick testing
    public static void main(String[] args) {
        MinimumValuetoGetPositiveStepbyStepSum solver = new MinimumValuetoGetPositiveStepbyStepSum();

        int[] nums1 = {-3, 2, -3, 4, 2};
        System.out.println("Answer: " + solver.minStartValue(nums1)); // Expected 5

        int[] nums2 = {1, 2};
        System.out.println("Answer: " + solver.minStartValue(nums2)); // Expected 1

        int[] nums3 = {1, -2, -3};
        System.out.println("Answer: " + solver.minStartValue(nums3)); // Expected 5
    }
}
