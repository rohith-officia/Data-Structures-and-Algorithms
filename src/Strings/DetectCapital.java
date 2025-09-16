package Strings;

public class DetectCapital {
    public boolean detectCapitalUse(String word) {
        if (word.length() <= 1) return true;

        if (Character.isUpperCase(word.charAt(0))) {
            // Case 1: All capitals (USA) OR First capital + rest lowercase (Google)
            boolean isSecondUpper = Character.isUpperCase(word.charAt(1));
            for (int i = 2; i < word.length(); i++) {
                boolean isUpper = Character.isUpperCase(word.charAt(i));
                if (isUpper != isSecondUpper) return false;
            }
        } else {
            // Case 2: All lowercase (leetcode)
            for (int i = 1; i < word.length(); i++) {
                if (Character.isUpperCase(word.charAt(i))) return false;
            }
        }
        return true;
    }

    // 🔹 Main method for testing
    public static void main(String[] args) {
        DetectCapital dc = new DetectCapital();

        System.out.println(dc.detectCapitalUse("USA"));      // true
        System.out.println(dc.detectCapitalUse("leetcode")); // true
        System.out.println(dc.detectCapitalUse("Google"));   // true
        System.out.println(dc.detectCapitalUse("FlaG"));     // false
    }
}
