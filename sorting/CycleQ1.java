package sorting;

import java.util.Arrays;

public class CycleQ1 {
  public static void main(String[] args) {
    int[] arr = { 2, 1, 3, 5, 0 };
    System.out.println(sort(arr));
    System.out.println(Arrays.toString(arr));

  }

  static int sort(int[] arr) {
    int i = 0;
    while (i < arr.length) {
      int curr = arr[i];// 1
      if (arr[i] < arr.length && arr[i] != arr[curr]) {
        int temp = arr[i];
        arr[i] = arr[curr];
        arr[curr] = temp;
      } else {
        i++;
      }
    }
    for (int j = 0; j < arr.length; j++) {
      if (arr[j] != j) {
        return j;
      }
    }
    return arr.length;
  }

}
