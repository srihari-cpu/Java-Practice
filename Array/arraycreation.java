package Array;

import java.util.*;

public class arraycreation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        // chagearr(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void chagearr(int[] a) {
        a[2] = 999;
    }

}
