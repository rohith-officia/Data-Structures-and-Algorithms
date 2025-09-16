package Strings;

public class Base7 {
    public String convertToBase7(int num) {
        // 🔹 One-liner solution
        return Integer.toString(num, 7);
    }

    // Alternative: Manual implementation
    public String convertToBase7Manual(int num) {
        if (num == 0) return "0";

        boolean isNegative = num < 0;
        num = Math.abs(num);
        StringBuilder sb = new StringBuilder();

        while (num > 0) {
            int remainder = num % 7;
            sb.append(remainder);
            num /= 7;
        }

        if (isNegative) sb.append("-");
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Base7 b7 = new Base7();

        System.out.println(b7.convertToBase7(100));   // "202"
        System.out.println(b7.convertToBase7(-7));    // "-10"

        // Manual version
        System.out.println(b7.convertToBase7Manual(100));  // "202"
        System.out.println(b7.convertToBase7Manual(-7));   // "-10"
    }
}
