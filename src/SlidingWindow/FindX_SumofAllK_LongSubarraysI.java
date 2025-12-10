package SlidingWindow;

import java.util.*;    // REQUIRED for Map, HashMap, List, ArrayList

public class FindX_SumofAllK_LongSubarraysI {

    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        int[] ans = new int[Math.max(0, n - k + 1)];
        Map<Integer, Integer> freq = new HashMap<>();

        // Build initial window freq
        for (int i = 0; i < k; i++) {
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
        }

        ans[0] = computeXSum(freq, x);

        // Slide window
        for (int i = k; i < n; i++) {
            int add = nums[i];
            int rem = nums[i - k];

            // Add new element
            freq.put(add, freq.getOrDefault(add, 0) + 1);

            // Remove outgoing element
            int fr = freq.get(rem) - 1;
            if (fr == 0) freq.remove(rem);
            else freq.put(rem, fr);

            ans[i - k + 1] = computeXSum(freq, x);
        }

        return ans;
    }

    private int computeXSum(Map<Integer, Integer> freq, int x) {
        List<int[]> items = new ArrayList<>();

        for (Map.Entry<Integer, Integer> e : freq.entrySet()) {
            items.add(new int[]{e.getKey(), e.getValue()});
        }

        // Sort by freq desc, value desc
        items.sort((a, b) -> {
            if (a[1] != b[1]) return b[1] - a[1];
            return b[0] - a[0];
        });

        long sum = 0;
        int take = Math.min(x, items.size());

        for (int i = 0; i < take; i++) {
            sum += 1L * items.get(i)[0] * items.get(i)[1];
        }

        return (int) sum;
    }

    public static void main(String[] args) {
        FindX_SumofAllK_LongSubarraysI sol = new FindX_SumofAllK_LongSubarraysI();

        int[] nums1 = {1,2,2,3,3,3,4};
        System.out.println("Output: " + Arrays.toString(sol.findXSum(nums1, 3, 2)));
        // Expected -> [5,7,8,9]

        int[] nums2 = {5,5,6,6,6,7};
        System.out.println("Output: " + Arrays.toString(sol.findXSum(nums2, 4, 1)));
        // Expected -> [16,18,19]

        int[] nums3 = {10,10,20,20,20,30,40};
        System.out.println("Output: " + Arrays.toString(sol.findXSum(nums3, 5, 3)));
        // Expected -> [80,100,140]
    }
}
