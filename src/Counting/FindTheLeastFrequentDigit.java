package Counting;

public class FindTheLeastFrequentDigit {

    // Original string-based approach
    static class StringVersion {
        public int getLeastFrequentDigit(int n) {
            int arr[] = new int[10];
            String s = n + "";
            int result = Integer.MAX_VALUE;

            // Count digit frequency
            for (char c : s.toCharArray()) {
                arr[c - '0']++;
            }

            int min = arr[n % 10];

            // Find least frequent digit (if tie, smaller digit)
            for (char c : s.toCharArray()) {
                if (arr[c - '0'] < min || (arr[c - '0'] == min && result > c - '0')) {
                    min = arr[c - '0'];
                    result = c - '0';
                }
            }
            return result;
        }
    }

    // Optimized integer-based approach
    static class OptimizedVersion {
        public int getLeastFrequentDigit(int n) {
            int[] freq = new int[10];

            // Count frequency using modulus
            while (n > 0) {
                freq[n % 10]++;
                n /= 10;
            }

            int ans = 0;
            int count = Integer.MAX_VALUE;

            // Find the digit with least frequency (smallest if tie)
            for (int d = 0; d < 10; d++) {
                if (freq[d] > 0 && freq[d] < count) {
                    count = freq[d];
                    ans = d;
                }
            }
            return ans;
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        int[] testNumbers = {151, 772734, 987654321, 55555};

        StringVersion sv = new StringVersion();
        OptimizedVersion ov = new OptimizedVersion();

        System.out.println("=== String Version ===");
        for (int num : testNumbers) {
            System.out.println("Number: " + num + " → Least Frequent Digit: " + sv.getLeastFrequentDigit(num));
        }

        System.out.println("\n=== Optimized Version ===");
        for (int num : testNumbers) {
            System.out.println("Number: " + num + " → Least Frequent Digit: " + ov.getLeastFrequentDigit(num));
        }
    }
}
