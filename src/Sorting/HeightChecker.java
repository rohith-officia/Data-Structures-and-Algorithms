package Sorting;

import java.util.Arrays;

public class HeightChecker {

    public int heightChecker(int[] heights) {
        // Clone the original array to preserve it
        int[] arr = heights.clone();

        // Sort the cloned array
        Arrays.sort(arr);

        int k = 0, count = 0;

        // Compare original and sorted arrays
        while (k < arr.length) {
            if (arr[k] != heights[k]) {
                count++;
            }
            k++;
        }
        return count;
    }

    // Main method to test
    public static void main(String[] args) {
        HeightChecker obj = new HeightChecker();

        int[] heights1 = {1, 1, 4, 2, 1, 3};
        System.out.println("Result 1: " + obj.heightChecker(heights1));
        // Expected: 3

        int[] heights2 = {5, 1, 2, 3, 4};
        System.out.println("Result 2: " + obj.heightChecker(heights2));
        // Expected: 5

        int[] heights3 = {1, 2, 3, 4, 5};
        System.out.println("Result 3: " + obj.heightChecker(heights3));
        // Expected: 0
    }
}
