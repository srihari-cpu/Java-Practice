package Array;

import java.util.Arrays;

/**
 * shuffle
 */
public class shuffle {

  public static void main(String[] args) {
    int[] arr = { 2, 3, 4, 2, 5, 7 };
    System.out.println(Arrays.toString(shufflethearray(arr, 3)));
  }

  static int[] shufflethearray(int[] arr, int n) {
    int[] res = new int[2 * n];
    for (int i = 0; i < 2 * n; i++) {
      if (i % 2 == 0) {
        res[i] = arr[i / 2];
      } else {
        res[i] = arr[n + i / 2];
      }
    }
    return res;
  }
}
