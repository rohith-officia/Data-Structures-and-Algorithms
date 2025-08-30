//https://leetcode.com/problems/next-greater-element-i?envType=problem-list-v2&envId=stack

package Stack;

import java.util.*;

class Solution {

    // Function to find the Next Greater Element
    public int[] Next_Greater_Element_I(int[] nums1, int[] nums2) {
        // HashMap to store the next greater element for each number in nums2
        HashMap<Integer,Integer> map =  new HashMap<>();

        // Stack to keep track of elements for which we haven't found NGE yet
        Stack<Integer> stack = new Stack<>();

        // Traverse nums2 to build the next greater element mapping
        for (int num : nums2) {
            // While stack is not empty AND current number is greater than stack top
            // it means we found the next greater element for stack top
            while (!stack.isEmpty() && num > stack.peek()) {
                map.put(stack.pop(), num); // map the popped element to current num
            }
            // Push current number to stack (waiting for its NGE)
            stack.push(num);
        }

        // For any remaining elements in stack, no greater element exists
        while (!stack.isEmpty()) {
            map.put(stack.pop(), -1); // assign -1 as NGE
        }

        // Build the result array for nums1
        int arr[] = new int[nums1.length];
        int j = 0;

        // For each number in nums1, get its NGE from the map
        for (int i : nums1) {
            if (map.containsKey(i)) {
                arr[j++] = map.get(i);
            }
        }

        return arr; // return result
    }

    // Main method to test the program
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Example input
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};

        // Call the function
        int[] result = sol.Next_Greater_Element_I(nums1, nums2);

        // Print output
        System.out.println("Next Greater Elements: " + Arrays.toString(result));
        // Expected: [-1, 3, -1]
    }
}

