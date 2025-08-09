package Array;

import java.util.Arrays;

public class question {
  public static void main(String[] args) {

    // array
    int[] arr = { 1, -1, 4, 2, 3, 8, 3 };
    System.out.println(Arrays.toString(arr));

    // swap method
    int[] swaparr = swap(arr, 1, 2);
    // System.out.println(Arrays.toString(swaparr));

    // maximum of the array element
    int max = maximum(arr);
    // System.out.println(max);

    // minimum of the array element
    int minvalue = minimum(arr);
    // System.out.println(minvalue);

    // maximum of the part of an array
    int maxran = maximumRange(arr, 1, 4);
    // System.out.println(maxran);

    // concat of the array
    int[] concatarr = concatenationOfArray(arr);
    // System.out.println(Arrays.toString(concatarr));

    // reverse of the array
    int[] revarr = reverse(arr);
    // System.out.println(Arrays.toString(revarr));

  }

  // functions

  // reverse of the array
  static int[] reverse(int[] arr) {
    int s = 0;
    int e = arr.length - 1;
    while (s < e) {
      int temp = arr[s];
      arr[s] = arr[e];
      arr[e] = temp;
      s++;
      e--;
    }
    return arr;
  }

  // swap function
  static int[] swap(int[] arr, int index1, int index2) {
    int temp = arr[index1];
    arr[index1] = arr[index2];
    arr[index2] = temp;
    return arr;
  }

  // maximum function
  static int maximum(int[] arr) {
    int maxval = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > maxval) {
        maxval = arr[i];
      }
    }
    return maxval;
  }

  // minimum of the array
  static int minimum(int[] arr) {
    int min = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] < min) {
        min = arr[i];
      }
    }
    return min;
  }

  // maximum with in the range
  static int maximumRange(int[] arr, int s, int e) {
    int maxval = arr[0];
    for (int i = s; i <= e; i++) {
      if (arr[i] > maxval) {
        maxval = arr[i];
      }
    }
    return maxval;
  }

  // concatenation of the array
  static int[] concatenationOfArray(int[] arr) {
    int n = arr.length;
    int[] arr2 = new int[n * 2];
    for (int i = 0; i < n; i++) {
      arr2[i] = arr[i];
      arr2[n + i] = arr[i];
    }
    return arr2;
  }

}
