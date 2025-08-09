package sorting;

import java.util.Arrays;

public class selectionsort {
  public static void main(String[] args) {
    int arr[] = { 2, 4, 21, 5, 1, 64, 8, 17 };
    selectionsort(arr);
    System.out.println(Arrays.toString(arr));
  }

  // selection sort function
  static int[] selectionsort(int[] arr) { // { 2, 4, 21, 5, 1, 64, 8, 17 }
    for (int i = 0; i < arr.length; i++) { // to iterate over all elements
      int minindex = i;
      for (int j = i; j < arr.length; j++) {// to find out the min index
        if (arr[j] < arr[minindex]) {
          minindex = j;
        }
      }
      int temp = arr[i];
      arr[i] = arr[minindex];
      arr[minindex] = temp;
    }
    return arr;
  }
}
