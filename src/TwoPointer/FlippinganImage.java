package TwoPointer;

import java.util.Arrays;

public class FlippinganImage {

    // Method to flip and invert the image
    public int[][] flipAndInvertImage(int[][] image) {
        for (int[] row : image) {
            // Invert each element
            for (int j = 0; j < row.length; j++) {
                row[j] = row[j] == 1 ? 0 : 1;
            }
            // Reverse the row
            reverse(row);
        }
        return image;
    }

    // Helper method to reverse a 1D array
    public void reverse(int[] row) {
        int left = 0, right = row.length - 1;
        while (left < right) {
            int temp = row[left];
            row[left] = row[right];
            row[right] = temp;
            left++;
            right--;
        }
    }

    // Main method to test
    public static void main(String[] args) {
        FlippinganImage solver = new FlippinganImage();
        int[][] image = {
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        };

        int[][] result = solver.flipAndInvertImage(image);

        // Print result
        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }
}
