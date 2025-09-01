//https://leetcode.com/problems/product-of-array-except-self?envType=problem-list-v2&envId=array

package Arrays;

public class ProductofArrayExceptSelf {

    public static int[] product_ExceptSelf(int[] nums){

        int [] arr = new int[nums.length];
        int i = 0;
        int j = 0;
        int post = 1;

        while(j < nums.length){
            if(j == 0){
                arr[i] = 1;
            }
            else{
                arr[i + 1] = arr[i] * nums[i];
                i++;
            }
            j++;
        }

        i = nums.length-1;
        j = nums.length-1;

        while(j >= 0){
            if(j == nums.length-1){
                arr[i] = arr[i] * post;
            }
            else{
                arr[i-1] = nums[i] * post  * arr[j];
                post = nums[i] * post;
                i--;
            }
            j--;
        }
        return arr;
    }

    public static void main(String [] args){
        int [] numb = {1,2,3,4};
        int[] result = product_ExceptSelf(numb);
        for(int i : result){
            System.out.println(i);
        }
    }
}
