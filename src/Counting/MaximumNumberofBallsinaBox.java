package Counting;

public class MaximumNumberofBallsinaBox {
    public int countBalls(int lowLimit, int highLimit) {
        int arr[] = new int[46];  // Maximum possible digit sum for 99999 = 45
        int max = 0;

        for (int i = lowLimit; i <= highLimit; i++) {
            int sum = addSum(i);
            arr[sum]++;
            max = Math.max(max, arr[sum]);
        }

        return max;
    }

    public int addSum(int i) {
        int sum = 0;
        while (i > 0) {
            sum += i % 10;
            i /= 10;
        }
        return sum;
    }

    // ✅ Example usage
    public static void main(String[] args) {
        MaximumNumberofBallsinaBox obj = new MaximumNumberofBallsinaBox();
        System.out.println(obj.countBalls(1, 10)); // Output: 2
        System.out.println(obj.countBalls(5, 15)); // Output: 2
    }
}
