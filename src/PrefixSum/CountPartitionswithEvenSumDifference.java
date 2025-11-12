package PrefixSum;

public class CountPartitionswithEvenSumDifference {
    public int countPartitions(int[] nums) {
        int n = nums.length;
        int total = 0;

        for (int x : nums) {
            total += x;
        }

        int prefix = 0, count = 0;

        for (int i = 0; i < n - 1; i++) {
            prefix += nums[i];
            int suffix = total - prefix;

            if ((prefix % 2) == (suffix % 2)) {
                count++;
            }
        }

        return count;
    }

    // Optional main method to test
    public static void main(String[] args) {
        CountPartitionswithEvenSumDifference obj = new CountPartitionswithEvenSumDifference();
        int[] nums = {10, 10, 3, 7, 6};
        System.out.println(obj.countPartitions(nums)); // Output: 4
    }
}
