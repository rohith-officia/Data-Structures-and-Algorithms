package Counting;

import java.util.*;

public class IntersectionOfMultipleArrays {

    // ✅ Optimized Version (Efficient & Clean)
    static class Solution {
        public List<Integer> intersection(int[][] nums) {
            int[] freq = new int[1001];
            int n = nums.length;

            // Count frequency of each number across all arrays
            for (int[] arr : nums) {
                for (int num : arr) {
                    freq[num]++;
                }
            }

            // Collect numbers that appear in all arrays
            List<Integer> res = new ArrayList<>();
            for (int i = 1; i <= 1000; i++) {
                if (freq[i] == n) {
                    res.add(i);
                }
            }
            return res;
        }
    }

    // 🧩 Your Version (works but slightly less optimal)
    static class MyVersion {
        public List<Integer> intersection(int[][] nums) {
            ArrayList<Integer> list = new ArrayList<>();
            int[] arr = new int[1001];

            // Count all numbers
            for (int[] num : nums) {
                for (int i : num) {
                    arr[i]++;
                }
            }

            // Find numbers that appear in all arrays
            for (int[] num : nums) {
                for (int i : num) {
                    if (arr[i] % nums.length == 0) {
                        if (!list.contains(i)) {
                            list.add(i);
                        }
                    }
                }
            }

            Collections.sort(list);
            return list;
        }
    }

    // 🧪 Main Method for Testing
    public static void main(String[] args) {
        int[][] nums = {
                {3, 1, 2, 4, 5},
                {1, 2, 3, 4},
                {3, 4, 5, 6}
        };

        Solution sol = new Solution();
        MyVersion mine = new MyVersion();

        System.out.println("✅ Optimized Version Output: " + sol.intersection(nums));
        System.out.println("🧩 Your Version Output: " + mine.intersection(nums));
    }
}
