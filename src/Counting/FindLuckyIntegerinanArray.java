package Counting;

import java.util.HashMap;

public class FindLuckyIntegerinanArray {

    // Method to find lucky integer
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int result = 0;

        // Count frequencies
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        // Find the largest lucky number
        for (int key : map.keySet()) {
            if (map.get(key) == key) {
                result = Math.max(result, key);
            }
        }

        return result == 0 ? -1 : result;
    }

    // Main method for testing
    public static void main(String[] args) {
        FindLuckyIntegerinanArray obj = new FindLuckyIntegerinanArray();

        int[] arr1 = {2, 2, 3, 4};
        int[] arr2 = {1, 2, 2, 3, 3, 3};
        int[] arr3 = {2, 2, 2, 3, 3};

        System.out.println(obj.findLucky(arr1)); // Output: 2
        System.out.println(obj.findLucky(arr2)); // Output: 3
        System.out.println(obj.findLucky(arr3)); // Output: -1
    }
}
