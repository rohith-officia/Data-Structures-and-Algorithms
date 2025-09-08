package Arrays;

public class SingleNumber {

    // ✅ XOR approach (O(n), O(1) space)
    public int singleNumber(int[] nums) {
        int result = 0;

        for (int i : nums) {
            result ^= i; // XOR cancels out duplicates
        }

        return result;
    }

    // ✅ Test driver
    public static void main(String[] args) {
        SingleNumber sol = new SingleNumber();

        int[] nums1 = {2, 2, 1};
        System.out.println(sol.singleNumber(nums1)); // Output: 1

        int[] nums2 = {4, 1, 2, 1, 2};
        System.out.println(sol.singleNumber(nums2)); // Output: 4

        int[] nums3 = {1};
        System.out.println(sol.singleNumber(nums3)); // Output: 1
    }
}
