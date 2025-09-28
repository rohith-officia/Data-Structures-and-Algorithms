package Sorting;

import java.util.*;  // import Arrays, HashMap, etc.

public class RankTransformofanArray {
    public int[] arrayRankTransform(int[] arr) {
        int[] clonedArray = arr.clone();
        Arrays.sort(clonedArray);

        // map to store number -> rank
        HashMap<Integer, Integer> map = new HashMap<>();
        int rank = 1;

        for (int num : clonedArray) {
            if (!map.containsKey(num)) {
                map.put(num, rank++);
            }
        }

        // build result using original array
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = map.get(arr[i]);
        }

        return result;
    }

    // Main method for testing
    public static void main(String[] args) {
        RankTransformofanArray obj = new RankTransformofanArray();

        int[] arr = {40, 10, 20, 30, 20};
        int[] result = obj.arrayRankTransform(arr);

        System.out.println(Arrays.toString(result));
    }
}
