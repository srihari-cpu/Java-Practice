package Array.search;

import java.util.Arrays;

public class searchIn2DArray {
  public static void main(String[] args) {
    int[][] arr = {
        { 1, 2, 3 },
        { 4, 5 },
        { 122 },
    };
    int k = 35;
    int[] res = searchin2darray(arr, k);
    // System.out.println(Arrays.toString(res));

    System.out.println(max(arr));
  }

  static int max(int[][] arr) {
    int max = arr[0][0];
    for (int row = 0; row < arr.length; row++) {
      for (int col = 0; col < arr[row].length; col++) {
        max = Math.max(max, arr[row][col]);
      }
    }
    return max;

  }

  static int[] searchin2darray(int[][] arr, int k) {
    if (arr.length == 0) {
      return new int[] { -1, -1 };
    }
    for (int row = 0; row < arr.length; row++) {
      for (int col = 0; col < arr[row].length; col++) {
        if (k == arr[row][col]) {
          return new int[] { row, col };
        }
      }
    }
    return new int[] { -1, -1 };
  }
}
