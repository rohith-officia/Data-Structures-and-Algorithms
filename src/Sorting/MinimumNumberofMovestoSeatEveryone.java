package Sorting;

import java.util.Arrays;

public class MinimumNumberofMovestoSeatEveryone {

    public int minMovesToSeat(int[] seats, int[] students) {
        // Step 1: Sort both arrays
        Arrays.sort(seats);
        Arrays.sort(students);

        // Step 2: Calculate total moves
        int sum = 0;
        for (int i = 0; i < seats.length; i++) {
            sum += Math.abs(students[i] - seats[i]);
        }

        // Step 3: Return total moves
        return sum;
    }

    // Main method for testing
    public static void main(String[] args) {
        MinimumNumberofMovestoSeatEveryone obj = new MinimumNumberofMovestoSeatEveryone();

        int[] seats1 = {1, 4, 5, 9};
        int[] students1 = {1, 2, 3, 6};
        System.out.println("Total moves: " + obj.minMovesToSeat(seats1, students1));
        // Expected: 7

        int[] seats2 = {2, 2, 6, 6};
        int[] students2 = {1, 3, 4, 6};
        System.out.println("Total moves: " + obj.minMovesToSeat(seats2, students2));
        // Expected: 4

        int[] seats3 = {3, 1, 5};
        int[] students3 = {2, 7, 4};
        System.out.println("Total moves: " + obj.minMovesToSeat(seats3, students3));
        // Expected: 5
    }
}
