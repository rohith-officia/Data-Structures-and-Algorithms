package Counting;

import java.util.ArrayList;
import java.util.HashMap;

public class UncommonWordsfromTwoSentences {
    public String[] uncommonFromSentences(String s1, String s2) {
        // merge both sentences into one
        s1 = s1 + " " + s2;

        ArrayList<String> list = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        // split into words
        String[] newS1 = s1.split(" ");

        // count frequency of each word
        for (String i : newS1) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        // collect words with frequency == 1
        for (String key : map.keySet()) {
            if (map.get(key) == 1) {
                list.add(key);
            }
        }

        // convert ArrayList to array
        return list.toArray(new String[0]);
    }

    // main method to test
    public static void main(String[] args) {
        UncommonWordsfromTwoSentences obj = new UncommonWordsfromTwoSentences();

        String s1 = "this apple is sweet";
        String s2 = "this apple is sour";

        String[] ans = obj.uncommonFromSentences(s1, s2);

        for (String word : ans) {
            System.out.print(word + " ");
        }
    }
}
