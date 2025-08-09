package sorting;

import java.util.Arrays;

public class Ex {
  public static void main(String[] args) {
    int arr[] = { 2, 4, 21, 5, 1, 64, 8, 17 };
    // int[] res = bubblesort(arr);
    // int[] res2 = selectionsort(arr);
    int[] res3 = insertionsort(arr);
    System.out.print(Arrays.toString(res3));

  }

  static int[] insertionsort(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
      int curr = arr[i];
      int prev = i - 1;
      while (prev >= 0 && arr[prev] > arr[i]) {
        arr[prev + 1] = arr[prev];
        prev--;

      }
      arr[prev + 1] = arr[i];
    }
    return arr;
  }

  public static int[] insertionsort1(int[] arr) {// { 2, 4, 21, 5, 1, 64, 8, 17 }
    for (int i = 1; i < arr.length; i++) {
      for (int j = 0; j < i; j++) {
        if (arr[i - 1] < arr[i]) {
          break;
        }
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
    return arr;
  }

  static int[] bubblesort(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
    return arr;
  }

  static int[] selectionsort(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = i; j < arr.length - 1; j++) {
        if (arr[i] > arr[j]) {
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
    return arr;
  }
}
