package TwoPointer;

import java.util.Arrays;

public class FindtheDistanceValueBetweenTwoArrays {

    // Main method to find the distance value
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2); // Sort arr2 for binary search
        int count = 0;

        for (int num : arr1) {
            if (isFarEnough(num, arr2, d)) {
                count++;
            }
        }

        return count;
    }

    // Binary search to check if all elements in arr2 are farther than d from num
    private boolean isFarEnough(int num, int[] arr2, int d) {
        int left = 0, right = arr2.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (Math.abs(num - arr2[mid]) <= d) {
                return false; // Found a close enough element
            }

            if (arr2[mid] < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return true; // No element within distance d
    }

    // Test the implementation
    public static void main(String[] args) {
        FindtheDistanceValueBetweenTwoArrays finder = new FindtheDistanceValueBetweenTwoArrays();

        int[] arr1 = {4, 5, 8};
        int[] arr2 = {10, 9, 1, 8};
        int d = 2;

        int result = finder.findTheDistanceValue(arr1, arr2, d);
        System.out.println("Distance Value: " + result); // Expected output: 2
    }
}