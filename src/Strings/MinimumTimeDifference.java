//https://leetcode.com/problems/minimum-time-difference

package Strings;

import java.util.*;

public class MinimumTimeDifference {
    public int findMinDifference(List<String> timePoints) {
        ArrayList<Integer> list = new ArrayList<>();
        int result = 1440; // max possible difference (24*60)

        // Convert each "HH:MM" to total minutes
        for (String i : timePoints) {
            String[] arr = i.split(":");
            int totalMinutes = Integer.parseInt(arr[0]) * 60 + Integer.parseInt(arr[1]);
            if (totalMinutes == 0) {
                list.add(1440);  // treat "00:00" as 1440 for easier sorting
            } else {
                list.add(totalMinutes);
            }
        }

        // Sort times
        Collections.sort(list);

        // Find minimum difference between neighbors
        for (int k = 1; k < list.size(); k++) {
            result = Math.min(result, list.get(k) - list.get(k - 1));
        }

        // Handle circular case (last and first across midnight)
        int circularDiff = 1440 - (list.getLast() - list.getFirst());
        result = Math.min(result, circularDiff);

        return result;
    }

    // Main method for testing
    public static void main(String[] args) {
        MinimumTimeDifference sol = new MinimumTimeDifference();

        List<String> timePoints1 = Arrays.asList("23:59", "00:00");
        System.out.println(sol.findMinDifference(timePoints1)); // Output: 1

        List<String> timePoints2 = Arrays.asList("01:00", "04:00", "23:00");
        System.out.println(sol.findMinDifference(timePoints2)); // Output: 120

        List<String> timePoints3 = Arrays.asList("05:31","22:08","00:35");
        System.out.println(sol.findMinDifference(timePoints3)); // Output: 147
    }
}


