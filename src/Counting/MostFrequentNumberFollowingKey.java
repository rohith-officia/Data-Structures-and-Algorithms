package Counting;

public class MostFrequentNumberFollowingKey {
    public int mostFrequent(int[] nums, int key) {
        int arr [] = new int[1001];
        int max = 0, result = 0;

        // Count how many times each number follows 'key'
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == key) {
                arr[nums[i]]++;
            }
        }

        // Find the number with the maximum frequency
        for (int i : nums) {
            if (max < arr[i]) {
                max = arr[i];
                result = i;
            }
        }

        return result;
    }

    // Main method for testing
    public static void main(String[] args) {
        MostFrequentNumberFollowingKey obj = new MostFrequentNumberFollowingKey();

        int[] nums1 = {1, 100, 200, 1, 100};
        int key1 = 1;
        System.out.println("Most frequent number after " + key1 + " is: " + obj.mostFrequent(nums1, key1));
        // Output: 100

        int[] nums2 = {2, 2, 2, 2, 3};
        int key2 = 2;
        System.out.println("Most frequent number after " + key2 + " is: " + obj.mostFrequent(nums2, key2));
        // Output: 2

        int[] nums3 = {1, 2, 3, 4, 2, 3, 3, 2, 3};
        int key3 = 2;
        System.out.println("Most frequent number after " + key3 + " is: " + obj.mostFrequent(nums3, key3));
        // Output: 3
    }
}
