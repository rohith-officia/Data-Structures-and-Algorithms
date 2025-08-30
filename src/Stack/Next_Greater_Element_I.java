//https://leetcode.com/problems/next-greater-element-i?envType=problem-list-v2&envId=stack

package Stack;

import java.util.*;

public class Next_Greater_Element_I {

    // Function to find the Next Greater Element
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // HashMap to store the next greater element for each number in nums2
        HashMap<Integer,Integer> map =  new HashMap<>();

        // Stack to keep track of elements for which we haven't found NGE yet
        Stack<Integer> stack = new Stack<>();

        // Traverse nums2 to build the next greater element mapping
        for (int num : nums2) {
            while (!stack.isEmpty() && num > stack.peek()) {
                map.put(stack.pop(), num); // map popped element → current num
            }
            stack.push(num); // push current number
        }

        // Remaining elements don’t have NGE
        while (!stack.isEmpty()) {
            map.put(stack.pop(), -1);
        }

        // Build result array for nums1
        int[] arr = new int[nums1.length];
        int j = 0;
        for (int i : nums1) {
            arr[j++] = map.get(i); // guaranteed to exist
        }

        return arr;
    }

    // Main method for testing
    public static void main(String[] args) {
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};

        int[] result = nextGreaterElement(nums1, nums2);

        System.out.println("Next Greater Elements: " + Arrays.toString(result));
        // Expected: [-1, 3, -1]
    }
}
