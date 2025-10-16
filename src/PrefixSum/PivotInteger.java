package PrefixSum;

public class PivotInteger {

    public int pivotInteger(int n) {
        int pre[] = new int[n + 1];
        int post[] = new int[n + 1];

        post[n] = n;
        pre[0] = 0;

        int pr = 0;
        int po = 0;

        for (int i = 0; i <= n; i++) {
            pre[i] = pr + i;
            pr = pre[i];
        }

        for (int i = n; i >= 0; i--) {
            post[i] = i + po;
            po = post[i];

            if (pre[i] == post[i]) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        PivotInteger sol = new PivotInteger();
        System.out.println(sol.pivotInteger(8)); // Expected output: 6
        System.out.println(sol.pivotInteger(1)); // Expected output: 1
        System.out.println(sol.pivotInteger(4)); // Expected output: -1
    }
}
