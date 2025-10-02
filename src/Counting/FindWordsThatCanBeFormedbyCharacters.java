package Counting;

import java.util.*;

public class FindWordsThatCanBeFormedbyCharacters {
    public int countCharacters(String[] words, String chars) {
        int[] counts = new int[26];

        // Step 1: Initialize Character Counts Array (from chars)
        for (int i = 0; i < chars.length(); i++) {
            counts[chars.charAt(i) - 'a']++;
        }

        int res = 0;
        // Step 2: Check each word
        for (String s : words) {
            if (canForm(s, counts)) {
                // Step 3: If word can be formed, add its length
                res += s.length();
            }
        }
        return res;
    }

    private boolean canForm(String word, int[] counts) {
        int[] c = new int[26]; // local frequency counter for word

        for (int i = 0; i < word.length(); i++) {
            int x = word.charAt(i) - 'a';
            c[x]++;
            // if word needs more of a character than available → fail
            if (c[x] > counts[x]) {
                return false;
            }
        }
        return true;
    }

    // For quick testing
    public static void main(String[] args) {
        FindWordsThatCanBeFormedbyCharacters obj = new FindWordsThatCanBeFormedbyCharacters();

        String[] words = {"cat","bt","hat","tree"};
        String chars = "atach";

        System.out.println(obj.countCharacters(words, chars)); // Output: 6
    }
}
