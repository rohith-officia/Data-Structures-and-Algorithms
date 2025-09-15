package Strings;

public class FirstUniqueCharacterinaString {
    public int firstUniqChar(String s) {
        // Approach 1 (commented out): indexOf & lastIndexOf
        // for (int i = 0; i < s.length(); i++) {
        //     char current = s.charAt(i);
        //     if (s.indexOf(current) == s.lastIndexOf(current)) {
        //         return i;
        //     }
        // }
        // return -1;

        // Approach 2: Using frequency array
        int[] arr = new int[26]; // only lowercase letters

        // count frequency of each char
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }

        // find the first index where frequency == 1
        for (int i = 0; i < s.length(); i++) {
            if (arr[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1; // no unique char
    }

    // main method for testing
    public static void main(String[] args) {
        FirstUniqueCharacterinaString obj = new FirstUniqueCharacterinaString();

        String s1 = "leetcode";
        String s2 = "loveleetcode";
        String s3 = "aabb";

        System.out.println(obj.firstUniqChar(s1)); // 0 ('l')
        System.out.println(obj.firstUniqChar(s2)); // 2 ('v')
        System.out.println(obj.firstUniqChar(s3)); // -1 (no unique char)
    }
}
