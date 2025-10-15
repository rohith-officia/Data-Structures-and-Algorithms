package PrefixSum;

public class FindtheMiddleIndexinArray {

    // ✅ Optimal and clean approach (Recommended)
    static class OptimalSolution {
        public int findMiddleIndex(int[] nums) {
            int total = 0, leftSum = 0;

            // Step 1: Find total sum
            for (int num : nums) total += num;

            // Step 2: Traverse and check condition
            for (int i = 0; i < nums.length; i++) {
                if (leftSum == total - leftSum - nums[i]) {
                    return i; // Found middle index
                }
                leftSum += nums[i];
            }

            // Step 3: No valid index found
            return -1;
        }
    }

    // 🧩 Your version using prefix and suffix sums
    static class PrefixSuffixSolution {
        public int findMiddleIndex(int[] nums) {
            int n = nums.length;
            int[] prefix = new int[n];
            int[] suffix = new int[n];

            int pre = 0, post = 0;

            // Build prefix sum array
            for (int i = 0; i < n; i++) {
                prefix[i] = pre + nums[i];
                pre = prefix[i];
            }

            // Build suffix sum array
            for (int i = n - 1; i >= 0; i--) {
                suffix[i] = post + nums[i];
                post = suffix[i];
            }

            // Compare prefix and suffix (excluding current index)
            for (int i = 0; i < n; i++) {
                if (prefix[i] - nums[i] == suffix[i] - nums[i]) {
                    return i;
                }
            }

            return -1;
        }
    }

    // 🔹 Main method to test both implementations
    public static void main(String[] args) {
        int[] nums = {2, 3, -1, 8, 4};

        OptimalSolution optimal = new OptimalSolution();
        PrefixSuffixSolution prefix = new PrefixSuffixSolution();

        System.out.println("Optimal Solution Output: " + optimal.findMiddleIndex(nums));
        System.out.println("Prefix-Suffix Solution Output: " + prefix.findMiddleIndex(nums));
    }
}
