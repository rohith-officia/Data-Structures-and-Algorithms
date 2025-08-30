package Stack;

import java.util.*;

public class Next_Greater_Element_II {

    // Function to find Next Greater Element in a circular array
    public static int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        Arrays.fill(arr, -1); // Default values = -1

        Stack<Integer> stack = new Stack<>(); // stores indexes

        // Traverse array twice for circular behavior
        for (int i = 0; i < 2 * n; i++) {
            int num = nums[i % n];  // circular index
            while (!stack.isEmpty() && nums[stack.peek()] < num) {
                arr[stack.pop()] = num;
            }
            if (i < n) { // Only push indexes during first round
                stack.push(i);
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        int[] result = nextGreaterElements(nums); // direct call
        System.out.println(Arrays.toString(result));
        // Expected: [2, -1, 2]
    }
}
