//https://leetcode.com/problems/water-bottles

package Math;

public class WaterBottles {

    // Main function to calculate max bottles you can drink
    public int numWaterBottles(int numBottles, int numExchange) {
        int sum = numBottles;       // total bottles drunk
        int empty = numBottles;     // all bottles become empty after drinking

        while (empty >= numExchange) {
            int newBottles = empty / numExchange;   // exchange empty for new full bottles
            sum += newBottles;                      // drink them
            empty = empty % numExchange + newBottles; // leftovers + new empties
        }
        return sum;
    }

    // Testing the solution
    public static void main(String[] args) {
        WaterBottles wb = new WaterBottles();

        // Example test cases
        System.out.println(wb.numWaterBottles(9, 3));   // Output: 13
        System.out.println(wb.numWaterBottles(15, 4));  // Output: 19
        System.out.println(wb.numWaterBottles(5, 5));   // Output: 6
        System.out.println(wb.numWaterBottles(2, 3));   // Output: 2
    }
}
