package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class pratice {

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5 };

    int s = 0;
    int e = arr.length - 1;
    while (s < e) {
      int temp = arr[s];
      arr[s] = arr[e];
      arr[e] = temp;
    }
    System.out.println(Arrays.toString(arr));

  }

}