package Arrays;

import java.util.Arrays;

public class LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        Arrays.sort(nums);

        int max = 1;
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                continue; // skip duplicates
            } else if (nums[i] == nums[i - 1] + 1) {
                count++; // extend streak
            } else {
                max = Math.max(max, count); // streak ended
                count = 1; // reset count
            }
        }

        return Math.max(max, count); // final check
    }

    // Main method for testing
    public static void main(String[] args) {
        LongestConsecutiveSequence solution = new LongestConsecutiveSequence();

        int[] nums1 = {100, 4, 200, 1, 3, 2};
        System.out.println("Longest consecutive sequence length: " + solution.longestConsecutive(nums1));
        // Expected output: 4 (sequence: 1, 2, 3, 4)

        int[] nums2 = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        System.out.println("Longest consecutive sequence length: " + solution.longestConsecutive(nums2));
        // Expected output: 9 (sequence: 0, 1, 2, 3, 4, 5, 6, 7, 8)

        int[] nums3 = {};
        System.out.println("Longest consecutive sequence length: " + solution.longestConsecutive(nums3));
        // Expected output: 0
    }
}
