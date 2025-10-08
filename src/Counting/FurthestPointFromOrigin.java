package Counting;

public class FurthestPointFromOrigin {

    // 🔹 Your Approach (Two Passes)
    public int furthestDistanceFromOrigin_TwoPass(String moves) {
        int countL = 0, countR = 0;

        // Assume '_' as 'L'
        for (char c : moves.toCharArray()) {
            if (c == 'L' || c == '_') {
                countL++;
            } else {
                countL--;
            }
        }

        // Assume '_' as 'R'
        for (char c : moves.toCharArray()) {
            if (c == 'R' || c == '_') {
                countR++;
            } else {
                countR--;
            }
        }

        return Math.max(Math.abs(countL), Math.abs(countR));
    }

    // 🔹 Optimized Approach (One Pass Formula)
    public int furthestDistanceFromOrigin_Optimized(String moves) {
        int countL = 0, countR = 0, countUnderscore = 0;

        for (char c : moves.toCharArray()) {
            if (c == 'L') countL++;
            else if (c == 'R') countR++;
            else countUnderscore++; // '_'
        }

        // Formula: max distance = |R - L| + underscores
        return Math.abs(countR - countL) + countUnderscore;
    }

    // 🔹 Test Runner
    public static void main(String[] args) {
        FurthestPointFromOrigin obj = new FurthestPointFromOrigin();

        String moves = "L_RR_L_";  // Example input

        System.out.println("Your Approach (Two Passes): " +
                obj.furthestDistanceFromOrigin_TwoPass(moves));

        System.out.println("Optimized Approach (Formula): " +
                obj.furthestDistanceFromOrigin_Optimized(moves));
    }
}
