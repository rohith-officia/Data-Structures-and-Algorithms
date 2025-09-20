package Math;

import java.util.*;  // for List and LinkedList

public class AddtoArrayFormofInteger {

    public List<Integer> addToArrayForm(int[] num, int k) {
        LinkedList<Integer> result = new LinkedList<>();
        int i = num.length - 1;

        while (i >= 0 || k > 0) {
            if (i >= 0) {
                k += num[i];  // add current digit
                i--;
            }
            result.addFirst(k % 10); // last digit
            k /= 10;                 // carry
        }

        return result;
    }

    // Main method for testing
    public static void main(String[] args) {
        AddtoArrayFormofInteger solution = new AddtoArrayFormofInteger();

        int[] num1 = {1, 2, 0, 0};
        int k1 = 34;
        System.out.println(solution.addToArrayForm(num1, k1)); // [1, 2, 3, 4]

        int[] num2 = {2, 7, 4};
        int k2 = 181;
        System.out.println(solution.addToArrayForm(num2, k2)); // [4, 5, 5]

        int[] num3 = {9, 9, 9, 9, 9};
        int k3 = 1;
        System.out.println(solution.addToArrayForm(num3, k3)); // [1, 0, 0, 0, 0, 0]
    }
}
