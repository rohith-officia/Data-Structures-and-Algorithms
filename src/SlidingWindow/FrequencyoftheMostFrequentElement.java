//https://leetcode.com/problems/frequency-of-the-most-frequent-element?envType=problem-list-v2&envId=sliding-window

package SlidingWindow;

import java.util.*;

public class FrequencyoftheMostFrequentElement {

    public static void main(String[] args) {
        FrequencyoftheMostFrequentElement sol = new FrequencyoftheMostFrequentElement();

        // Example 1
        int[] nums1 = {1, 2, 4};
        int k1 = 5;
        System.out.println("Input: " + Arrays.toString(nums1) + ", k = " + k1);
        System.out.println("Max Frequency: " + sol.maxFrequency(nums1, k1));

        // Example 2
        int[] nums2 = {1, 4, 8, 13};
        int k2 = 5;
        System.out.println("\nInput: " + Arrays.toString(nums2) + ", k = " + k2);
        System.out.println("Max Frequency: " + sol.maxFrequency(nums2, k2));

        // Example 3
        int[] nums3 = {3, 9, 6};
        int k3 = 2;
        System.out.println("\nInput: " + Arrays.toString(nums3) + ", k = " + k3);
        System.out.println("Max Frequency: " + sol.maxFrequency(nums3, k3));
    }

    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        long total = 0;
        int left = 0, result = 1;

        for (int right = 0; right < nums.length; right++) {
            total += nums[right];

            // shrink window if cost > k
            while ((long) nums[right] * (right - left + 1) - total > k) {
                total -= nums[left];
                left++;
            }

            result = Math.max(result, right - left + 1);
        }
        return result;
    }
}
