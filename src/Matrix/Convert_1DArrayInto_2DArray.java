package Matrix;

import java.util.Arrays;

public class Convert_1DArrayInto_2DArray {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if (m * n != original.length) return new int[][]{}; // return empty if not possible

        int matrix [][] = new int[m][n];
        int val = 0;

        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                matrix[i][j] = original[val++];
            }
        }
        return matrix;
    }

    // Main method for testing
    public static void main(String[] args) {
        Convert_1DArrayInto_2DArray sol = new Convert_1DArrayInto_2DArray();

        int[] original = {1, 2, 3, 4};
        int m = 2, n = 2;

        int[][] result = sol.construct2DArray(original, m, n);

        // Print result
        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }
}
