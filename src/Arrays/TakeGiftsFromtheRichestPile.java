package Arrays;

import java.util.*;

public class TakeGiftsFromtheRichestPile {

    public long pickGifts(int[] gifts, int k) {
        // Max-Heap
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        // Add all piles
        for (int g : gifts) {
            pq.offer(g);
        }

        // Perform k operations
        while (k > 0) {
            int val = pq.poll();  // get largest pile
            int newVal = (int) Math.sqrt(val);  // take square root
            pq.offer(newVal);
            k--;
        }

        // Sum remaining gifts
        long sum = 0;
        while (!pq.isEmpty()) {
            sum += pq.poll();
        }
        return sum;
    }

    // Optional: main method for testing
    public static void main(String[] args) {
        TakeGiftsFromtheRichestPile sol = new TakeGiftsFromtheRichestPile();

        int[] gifts1 = {25, 64, 9, 4, 100};
        int k1 = 4;
        System.out.println(sol.pickGifts(gifts1, k1));  // Example output

        int[] gifts2 = {1, 1, 1, 1};
        int k2 = 2;
        System.out.println(sol.pickGifts(gifts2, k2));  // Example output
    }
}
