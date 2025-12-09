package SlidingWindow;

public class MaximumStrongPairXORI {

    public int maximumStrongPairXor(int[] nums) {
        int res = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) { // start from i+1
                if (Math.abs(nums[i] - nums[j]) <= Math.min(nums[i], nums[j])) {
                    res = Math.max(res, nums[i] ^ nums[j]);
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        MaximumStrongPairXORI obj = new MaximumStrongPairXORI();

        int[] nums1 = {1, 2, 3, 4};
        System.out.println("Maximum Strong Pair XOR: " + obj.maximumStrongPairXor(nums1));

        int[] nums2 = {5, 1, 10, 6};
        System.out.println("Maximum Strong Pair XOR: " + obj.maximumStrongPairXor(nums2));

        int[] nums3 = {8, 2, 7, 3};
        System.out.println("Maximum Strong Pair XOR: " + obj.maximumStrongPairXor(nums3));
    }
}
