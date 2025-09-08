package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class MedianofTwoSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();

        // Add elements from nums1
        for (int i : nums1) {
            list.add(i);
        }

        // Add elements from nums2
        for (int i : nums2) {
            list.add(i);
        }

        // Sort merged list
        Collections.sort(list);
        int n = list.size();

        // If odd length, return middle element
        if (n % 2 != 0) {
            return list.get(n / 2);
        }
        // If even length, return average of two middle elements
        return (list.get(n / 2) + list.get(n / 2 - 1)) / 2.0;
    }

    // ✅ Test driver
    public static void main(String[] args) {
        MedianofTwoSortedArrays sol = new MedianofTwoSortedArrays();

        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        System.out.println(sol.findMedianSortedArrays(nums1, nums2)); // Output: 2.0

        int[] nums3 = {1, 2};
        int[] nums4 = {3, 4};
        System.out.println(sol.findMedianSortedArrays(nums3, nums4)); // Output: 2.5
    }
}
