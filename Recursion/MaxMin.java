package Recursion;

public class MaxMin {
  public static void main(String[] args) {
    int[] arr = { 1, 4, 10, 3, -5, -4, 8, 6, -10 };
    int min = arr[0];
    System.out.println(findmin(arr, min, 0));
    int max = arr[0];
    System.out.println(findMax(arr, max, 0));
  }

  static int findmin(int[] arr, int min, int n) {
    // base case
    if (n == arr.length) {
      return min;
    }
    // recursive case
    if (min > arr[n]) {
      min = arr[n];
    }
    return findmin(arr, min, n + 1);

  }

  static int findMax(int[] arr, int max, int n) {
    // base case
    if (n == arr.length) {
      return max;
    }
    // recursive case
    if (max < arr[n]) {
      max = arr[n];
    }
    return findMax(arr, max, n + 1);
  }

}
