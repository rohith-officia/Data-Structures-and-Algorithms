//https://leetcode.com/problems/coin-change

package Arrays;

import java.util.Arrays;

public class CoinChange {

    // Function to find the minimum number of coins
    public int coinChange(int[] coins, int amount) {
        int arr[] = new int[amount + 1];

        // Fill with "infinity" (amount+1 ensures it's impossible value)
        Arrays.fill(arr, amount + 1);

        arr[0] = 0; // Base case: 0 coins needed to make 0

        // Build DP table
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (i - coin >= 0) {
                    arr[i] = Math.min(arr[i], arr[i - coin] + 1);
                }
            }
        }

        // If no solution found, return -1
        return arr[amount] > amount ? -1 : arr[amount];
    }

    // Main method to test
    public static void main(String[] args) {
        CoinChange solution = new CoinChange();

        int[] coins1 = {1, 2, 5};
        int amount1 = 11;
        System.out.println("Minimum coins for amount " + amount1 + " = " + solution.coinChange(coins1, amount1));
        // Expected: 3 (5 + 5 + 1)

        int[] coins2 = {2};
        int amount2 = 3;
        System.out.println("Minimum coins for amount " + amount2 + " = " + solution.coinChange(coins2, amount2));
        // Expected: -1 (cannot make 3 using only coin 2)

        int[] coins3 = {1};
        int amount3 = 0;
        System.out.println("Minimum coins for amount " + amount3 + " = " + solution.coinChange(coins3, amount3));
        // Expected: 0 (no coins needed for 0)
    }
}
