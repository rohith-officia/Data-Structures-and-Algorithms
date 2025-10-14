package Counting;

import java.util.*;

public class KthDistinctStringInAnArray {
    public String kthDistinct(String[] arr, int k) {
        // ✅ Use LinkedHashMap to maintain insertion order
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        // Step 1: Count frequency of each string
        for (String s : arr) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        // Step 2: Find the k-th distinct string (frequency = 1)
        int count = 0;
        for (String key : map.keySet()) {
            if (map.get(key) == 1) {
                count++;
                if (count == k) {
                    return key;  // Return the k-th distinct string
                }
            }
        }

        // Step 3: If not found
        return "";
    }

    // 🧪 Example usage
    public static void main(String[] args) {
        KthDistinctStringInAnArray obj = new KthDistinctStringInAnArray();
        String[] arr1 = {"d","b","c","b","c","a"};
        System.out.println(obj.kthDistinct(arr1, 2)); // Output: "a"

        String[] arr2 = {"a","b","a"};
        System.out.println(obj.kthDistinct(arr2, 1)); // Output: "b"
    }
}
