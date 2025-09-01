// https://leetcode.com/problems/contains-duplicate?envType=problem-list-v2&envId=array

package Arrays;

import java.util.HashSet;
//import java.util.Set;

public class ContainsDuplicate {
    public static boolean contains_Duplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int i : nums){
            if(!set.contains(i)){
                set.add(i);
            }
            else{
                return true;
            }
        }
        return false;
    }

    public static void main(String [] args){
        int [] arr = {1,2,3,1};
        System.out.print(contains_Duplicate(arr));
    }
}
