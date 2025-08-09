package sorting;

import java.util.Arrays;

public class CycleQ5 {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 2, 4 };
    System.out.println(Arrays.toString(setMismatch(arr)));
  }

  static int[] setMismatch(int[] arr) {
    int i = 0;
    while (i < arr.length) {
      int curr = arr[i] - 1;
      if (arr[i] != arr[curr]) {
        int temp = arr[i];
        arr[i] = arr[curr];
        arr[curr] = temp;
      } else {
        i++;
      }
    }
    int[] res = new int[2];
    for (int j = 0; j < arr.length; j++) {
      if (arr[j] - 1 != j) {
        res[0] = arr[j];
        res[1] = j + 1;
      }
    }
    return res;
  }

}
