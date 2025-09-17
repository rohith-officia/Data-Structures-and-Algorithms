package Math;

public class NimGame {
    public static boolean canWinNim(int n) {
        return n % 4 != 0;
    }
    public static void main(String[] args){
        System.out.println(canWinNim(4)); // false
        System.out.println(canWinNim(14));
        System.out.println(canWinNim(16));
    }
}
