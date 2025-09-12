package Arrays;
import java.util.Arrays;

public class NextPermutation {

    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;

        while (i >= 0 && nums[i] >= nums[i + 1]) i--;

        if (i >= 0) {
            int j = nums.length - 1;

            while (j >= 0 && nums[j] <= nums[i]) j--;
            swap(nums, i, j);
        }
        reverse(nums, i + 1);
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void reverse(int[] nums, int start) {
        int end = nums.length - 1;
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    // Main method to test the code
    public static void main(String[] args) {
        NextPermutation np = new NextPermutation();

        int[] nums = {1, 1, 5, 4, 1};
        System.out.println("Original array: " + Arrays.toString(nums));

        np.nextPermutation(nums);

        System.out.println("Next permutation: " + Arrays.toString(nums));
    }
}
