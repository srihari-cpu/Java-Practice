package Recursion;

class ArrayIsSort {
  public static void main(String[] args) {
    int[] arr = { 0, 1, 3, 3, 4, 2 };
    isSort(arr, arr.length - 1);
  }

  static void isSort(int[] arr, int n) {// n=3,2,1,0
    // base case
    if (n == 0) {
      System.out.print("sorted");
      return;
    }
    // recursion case
    if (arr[n] < arr[n - 1]) {
      System.out.print("Not sorted");
      return;
    }
    isSort(arr, n - 1);

  }
}
