package Sorting;

import java.util.*;

public class MinimumAbsoluteDifference {

    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();

        // Step 1: Sort the array
        Arrays.sort(arr);

        // Step 2: Find the minimum absolute difference
        int minDiff = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            minDiff = Math.min(minDiff, arr[i] - arr[i - 1]);
        }

        // Step 3: Collect all pairs with that min difference
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] == minDiff) {
                result.add(Arrays.asList(arr[i - 1], arr[i]));
            }
        }

        return result;
    }

    // Main method to test
    public static void main(String[] args) {
        MinimumAbsoluteDifference obj = new MinimumAbsoluteDifference();

        int[] arr1 = {4, 2, 1, 3};
        System.out.println("Result 1: " + obj.minimumAbsDifference(arr1));
        // Expected: [[1, 2], [2, 3], [3, 4]]

        int[] arr2 = {1, 3, 6, 10, 15};
        System.out.println("Result 2: " + obj.minimumAbsDifference(arr2));
        // Expected: [[1, 3]]

        int[] arr3 = {3, 8, -10, 23, 19, -4, -14, 27};
        System.out.println("Result 3: " + obj.minimumAbsDifference(arr3));
        // Expected: [[-14, -10], [19, 23], [23, 27]]
    }
}
