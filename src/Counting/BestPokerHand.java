package Counting;

public class BestPokerHand {
    public String bestHand(int[] ranks, char[] suits) {
        int[] alpha = new int[26]; // For suits ('a' to 'z')
        int[] arr = new int[14];   // For ranks (1 to 13)
        int max = 0;

        // Step 1: Check for Flush
        for (char c : suits) {
            alpha[c - 'a']++;
            if (alpha[c - 'a'] == 5) {
                return "Flush";
            }
        }

        // Step 2: Count rank frequencies
        for (int i : ranks) {
            arr[i]++;
            max = Math.max(max, arr[i]);
        }

        // Step 3: Determine best hand
        if (max >= 3) return "Three of a Kind";
        if (max == 2) return "Pair";
        return "High Card";
    }

    // Optional test
    public static void main(String[] args) {
        BestPokerHand obj = new BestPokerHand();
        System.out.println(obj.bestHand(new int[]{13, 2, 3, 1, 9}, new char[]{'a', 'a', 'a', 'a', 'a'})); // Flush
        System.out.println(obj.bestHand(new int[]{4, 4, 2, 4, 5}, new char[]{'b', 'c', 'd', 'e', 'f'}));   // Three of a Kind
        System.out.println(obj.bestHand(new int[]{10, 10, 2, 3, 4}, new char[]{'a', 'b', 'c', 'd', 'e'})); // Pair
        System.out.println(obj.bestHand(new int[]{2, 3, 4, 5, 6}, new char[]{'a', 'b', 'c', 'd', 'e'}));   // High Card
    }
}
