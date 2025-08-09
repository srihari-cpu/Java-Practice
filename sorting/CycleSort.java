package sorting;

public class CycleSort {
  public static void main(String[] args) {
    int[] arr = { 5, 4, 3, 2, 1 };
    sort(arr);
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }

  static void sort(int[] arr) {
    int i = 0;
    while (i < arr.length) {
      int current = arr[i] - 1;
      if (arr[i] == arr[current]) {
        i++;
      } else {
        int temp = arr[i];
        arr[i] = arr[current];
        arr[current] = temp;
      }
    }
  }
}