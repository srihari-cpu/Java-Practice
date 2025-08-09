package Recursion;

public class FirstLastOccurance {
  public static void main(String[] args) {
    int[] arr = { 1, 3, 4, 5, 10, 5, 9 };
    int k = 5;
    int firstindex = FirstOccurance(arr, 0, k);
    System.out.println("element first index is : " + firstindex);
    int lastindex = LastOccurance(arr, arr.length - 1, k);
    System.out.println("element last index is : " + lastindex);
  }

  static int FirstOccurance(int[] arr, int n, int k) {
    // base case
    if (n == arr.length) {
      return -1;
    }
    // recursion
    if (arr[n] == k) {
      return n;
    }
    return FirstOccurance(arr, n + 1, k);
  }

  static int LastOccurance(int[] arr, int n, int k) {
    // base case
    if (n == -1) {
      return -1;
    }

    // recursion
    if (arr[n] == k) {
      return n;
    }
    return LastOccurance(arr, n - 1, k);
  }
}
