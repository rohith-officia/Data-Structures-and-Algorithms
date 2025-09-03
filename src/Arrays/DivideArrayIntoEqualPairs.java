///https://leetcode.com/problems/divide-array-into-equal-pairs

package Arrays;
import java.util.*;

public class DivideArrayIntoEqualPairs {
    public static  boolean divideArray(int[] nums) {
        if(nums.length % 2 != 0){return false;}

        Arrays.sort(nums);
        int i = 0;
        int j = 1;

        while(j < nums.length){
            if(nums[i] != nums[j]){
                return false;
            }
            i+=2;
            j+=2;
        }
        return true;
    }

    public static void main(String [] args){
        int [] arr = {1,2,2,1};
        System.out.print(divideArray(arr));
    }
}
