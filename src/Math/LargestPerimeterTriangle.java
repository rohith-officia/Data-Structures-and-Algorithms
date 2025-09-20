package Math;

import java.util.Arrays;

public class LargestPerimeterTriangle {

    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums); // sort ascending

        for (int i = nums.length - 1; i >= 2; i--) {
            if (nums[i] < nums[i - 1] + nums[i - 2]) {
                return nums[i] + nums[i - 1] + nums[i - 2];
            }
        }
        return 0; // no valid triangle
    }

    // test the solution
    public static void main(String[] args) {
        LargestPerimeterTriangle solution = new LargestPerimeterTriangle();

        int[] nums1 = {2, 1, 2};
        int[] nums2 = {1, 2, 1};
        int[] nums3 = {3, 2, 3, 4};
        int[] nums4 = {3, 6, 2, 3};

        System.out.println(solution.largestPerimeter(nums1)); // 5
        System.out.println(solution.largestPerimeter(nums2)); // 0
        System.out.println(solution.largestPerimeter(nums3)); // 10
        System.out.println(solution.largestPerimeter(nums4)); // 8
    }
}
