package SlidingWindow;

public class MaximumSubarrayWithEqualProducts {

    public int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }

    public int maxLength(int[] nums) {
        int n = nums.length;
        int maxL = 0;

        for (int i = 0; i < n; i++) {
            int currGCD = nums[i];
            int currLCM = nums[i];
            long currPro = nums[i];

            for (int j = i + 1; j < n; j++) {
                currPro *= nums[j];
                currGCD = gcd(currGCD, nums[j]);
                currLCM = lcm(currLCM, nums[j]);

                if (currPro == (long) currGCD * currLCM) {
                    maxL = Math.max(maxL, j - i + 1);
                }
            }
        }
        return maxL;
    }

    // -------------------------
    // MAIN METHOD ADDED BELOW
    // -------------------------
    public static void main(String[] args) {
        MaximumSubarrayWithEqualProducts obj = new MaximumSubarrayWithEqualProducts();

        int[] nums = {2, 3, 6, 2};  // you can change input here

        int result = obj.maxLength(nums);

        System.out.println("Maximum Subarray Length = " + result);
    }
}
