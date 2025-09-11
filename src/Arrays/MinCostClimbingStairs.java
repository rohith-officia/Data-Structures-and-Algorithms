package Arrays;

public class MinCostClimbingStairs {

    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int first = 0, second = 0; // represents dp[i+1], dp[i+2]

        for (int i = n - 1; i >= 0; i--) {
            int result = cost[i] + Math.min(first, second);
            // shift the values for next iteration
            first = second;
            second = result;
        }

        return Math.min(first, second); // min cost from step 0 or step 1
    }

    // Main method to test the function
    public static void main(String[] args) {
        MinCostClimbingStairs solver = new MinCostClimbingStairs();

        int[] cost1 = {10, 15, 20};
        int[] cost2 = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};

        System.out.println("Minimum cost for cost1: " + solver.minCostClimbingStairs(cost1)); // 15
        System.out.println("Minimum cost for cost2: " + solver.minCostClimbingStairs(cost2)); // 6
    }
}
