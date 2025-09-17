package Math;

public class PowerofFour {
    public static boolean isPowerOfFour(int n) {
        return n > 0 && (n & (n - 1)) == 0 && (n - 1) % 3 == 0;
    }

    public static void main(String [] args){
        System.out.println(isPowerOfFour(1)); // true
        System.out.print(isPowerOfFour(2)); // false
    }
}

