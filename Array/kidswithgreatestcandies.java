package Array;

import java.util.Arrays;

/**
 * kidswithgreatestcandies
 */
public class kidswithgreatestcandies {

  public static void main(String[] args) {
    int[] arr = { 2, 3, 5, 1, 3 };
    int extraCandies = 3;
    boolean[] res = serveCandies(arr, extraCandies);
    System.out.println(Arrays.toString(res));// {true,true,true,flase,true}
  }

  static boolean[] serveCandies(int[] arr, int e) {
    boolean[] res = new boolean[arr.length];
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      arr[i] = arr[i] + e;
      for (int j = 0; j < arr.length; j++) {
        if (arr[i] >= arr[j]) {
          count++;
        }
      }
      if (count == arr.length) {
        res[i] = true;
      } else {
        res[i] = false;
      }
      arr[i] = arr[i] - e;
      count = 0;
    }
    return res;
  }
}