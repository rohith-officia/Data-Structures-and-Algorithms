//https://leetcode.com/problems/alice-and-bob-playing-flower-game?envType=daily-question&envId=2025-08-30

package DailyQuestion;

public class Alice_and_Bob_Playing_Flower_Game {
    public long flowerGame(int n, int m) {
        // Count odd and even numbers from 1 to n
        long oddN = (n + 1) / 2;
        long evenN = n / 2;

        // Count odd and even numbers from 1 to m
        long oddM = (m + 1) / 2;
        long evenM = m / 2;

        // Pairs where sum is odd: (oddN * evenM) + (evenN * oddM)
        return oddN * evenM + evenN * oddM;
    }

    public static void main(String[] args) {
        Alice_and_Bob_Playing_Flower_Game sol = new Alice_and_Bob_Playing_Flower_Game();

        // Test cases
        System.out.println(sol.flowerGame(3, 4)); // Expected 6
        System.out.println(sol.flowerGame(5, 5)); // Expected 12
        System.out.println(sol.flowerGame(2, 2)); // Expected 2
        System.out.println(sol.flowerGame(1, 1)); // Expected 0
        System.out.println(sol.flowerGame(10, 10)); // Expected 50
    }
}

