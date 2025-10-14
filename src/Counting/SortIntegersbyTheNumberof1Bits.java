package Counting;

import java.util.Arrays;

public class SortIntegersbyTheNumberof1Bits {
    public int[] sortByBits(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] += Integer.bitCount(arr[i]) * 10001;
        }

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] % 10001;
        }

        return arr;
    }

    // main() to test
    public static void main(String[] args) {
        SortIntegersbyTheNumberof1Bits sol = new SortIntegersbyTheNumberof1Bits();

        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        int[] result = sol.sortByBits(arr);

        System.out.println("Sorted by number of 1 bits: " + Arrays.toString(result));
    }
}
