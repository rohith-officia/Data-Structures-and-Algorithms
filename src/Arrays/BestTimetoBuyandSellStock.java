//https://leetcode.com/problems/best-time-to-buy-and-sell-stock?envType=problem-list-v2&envId=array

package Arrays;

public class BestTimetoBuyandSellStock {
    public static int maxProfit(int [] price){
        int buy = price[0];
        int profit = 0;

        int i = 0;
        int j = 1;

        while(j < price.length){
            if(buy > price[j]){
                buy = price[j];
                i = j;
            }
            else if(buy < price[j]){
                if(profit < price[j] - price[i]){
                    profit = price[j] - price[i];
                }
            }
            j++;
        }
        return profit;
    }

    public static void main(String [] args){
        int [] arr = {7,1,5,3,6,4};
        System.out.print(maxProfit(arr));
    }
}
