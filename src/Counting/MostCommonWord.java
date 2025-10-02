package Counting;

import java.util.*;

public class MostCommonWord {

    public String mostCommonWord(String paragraph, String[] banned) {
        // Prepare banned words set (lowercase for case-insensitivity)
        Set<String> bannedSet = new HashSet<>();
        for (String word : banned) {
            bannedSet.add(word.toLowerCase());
        }

        // Split paragraph into words, remove punctuation, lowercase
        String[] words = paragraph.toLowerCase().split("\\W+");

        // Count word frequencies
        Map<String, Integer> wordCount = new HashMap<>();
        String mostCommon = "";
        int maxCount = 0;

        for (String word : words) {
            if (word.isEmpty() || bannedSet.contains(word)) continue;

            int count = wordCount.getOrDefault(word, 0) + 1;
            wordCount.put(word, count);

            // Update most common word on the fly
            if (count > maxCount) {
                mostCommon = word;
                maxCount = count;
            }
        }

        return mostCommon;
    }

    // Main method for testing
    public static void main(String[] args) {
        MostCommonWord obj = new MostCommonWord();

        String paragraph1 = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned1 = {"hit"};
        System.out.println(obj.mostCommonWord(paragraph1, banned1));
        // Expected output: "ball"

        String paragraph2 = "Jack and Jill went up the hill, and Jack fell down.";
        String[] banned2 = {"and", "the"};
        System.out.println(obj.mostCommonWord(paragraph2, banned2));
        // Expected output: "jack"
    }
}
