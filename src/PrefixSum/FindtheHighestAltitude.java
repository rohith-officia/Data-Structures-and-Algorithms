package PrefixSum;

public class FindtheHighestAltitude {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int current = 0;

        for (int g : gain) {
            current += g;           // Add current gain/loss to altitude
            max = Math.max(max, current);
        }

        return max;
    }

    // Optional test
    public static void main(String[] args) {
        FindtheHighestAltitude obj = new FindtheHighestAltitude();
        System.out.println(obj.largestAltitude(new int[]{-5, 1, 5, 0, -7})); // Output: 1
        System.out.println(obj.largestAltitude(new int[]{-4, -3, -2, -1, 4, 3, 2})); // Output: 0
    }
}
