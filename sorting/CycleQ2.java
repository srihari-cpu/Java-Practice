package sorting;

import java.util.ArrayList;
import java.util.List;;

public class CycleQ2 {
  public static void main(String[] args) {
    int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
    System.out.println(missingNumber(arr));
  }

  static List<Integer> missingNumber(int[] arr) {
    int i = 0;
    List<Integer> ans = new ArrayList<>();
    while (i < arr.length) {
      int curr = arr[i] - 1;
      if (arr[i] != arr[curr]) {
        int temp = arr[i];
        arr[i] = arr[curr];
        arr[curr] = temp;
      } else {
        i++;
      }
      for (int j = 0; j < arr.length; j++) {
        if (arr[j] - 1 != j) {
          ans.add(j + 1);
        }
      }
      return ans;
    }
    return null;
  }
}
