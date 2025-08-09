package Array;

import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] res = runningSum(arr);
        System.out.println("original Array");
        System.out.println(Arrays.toString(arr));
        System.out.println("Running Sum Array");
        System.out.println(Arrays.toString(res));
    }

    static int[] runningSum(int[] arr) {
        int[] res = new int[arr.length];
        res[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            res[i] = res[i - 1] + arr[i];
        }
        return res;
    }
}