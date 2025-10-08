package Counting;

import java.util.HashSet;
import java.util.Set;

public class CounttheNumberofVowelStringsinRange {

    // ---------- WAY 1: Using String.contains ----------
    public int vowelStringsContains(String[] words, int left, int right) {
        String vowels = "aeiou";
        int count = 0;

        for (int i = left; i <= right; i++) {
            String word = words[i];
            if (vowels.contains(word.charAt(0) + "") &&
                    vowels.contains(word.charAt(word.length() - 1) + "")) {
                count++;
            }
        }
        return count;
    }

    // ---------- WAY 2: Using indexOf ----------
    public int vowelStringsIndexOf(String[] words, int left, int right) {
        String vowels = "aeiou";
        int count = 0;

        for (int i = left; i <= right; i++) {
            char first = words[i].charAt(0);
            char last = words[i].charAt(words[i].length() - 1);
            if (vowels.indexOf(first) != -1 && vowels.indexOf(last) != -1) {
                count++;
            }
        }
        return count;
    }

    // ---------- WAY 3: Using HashSet ----------
    public int vowelStringsSet(String[] words, int left, int right) {
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        int count = 0;
        for (int i = left; i <= right; i++) {
            char first = words[i].charAt(0);
            char last = words[i].charAt(words[i].length() - 1);
            if (vowels.contains(first) && vowels.contains(last)) {
                count++;
            }
        }
        return count;
    }

    // ---------- MAIN TEST ----------
    public static void main(String[] args) {
        CounttheNumberofVowelStringsinRange obj = new CounttheNumberofVowelStringsinRange();

        String[] words = {"aba", "bcb", "ece", "aa", "e"};
        int left = 0, right = 2;

        System.out.println("Using contains: " + obj.vowelStringsContains(words, left, right));
        System.out.println("Using indexOf: " + obj.vowelStringsIndexOf(words, left, right));
        System.out.println("Using HashSet: " + obj.vowelStringsSet(words, left, right));
    }
}
