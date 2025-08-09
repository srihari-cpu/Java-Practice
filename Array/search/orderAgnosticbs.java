package Array.search;

public class orderAgnosticbs {
  public static void main(String[] args) {
    int[] arr = {};
    int k = 3;
    System.out.println(OABS(arr, k));

  }

  static int OABS(int[] arr, int k) {
    if (arr.length == 0) {
      return -1;
    }
    int s = 0;
    int l = arr.length - 1;
    if (arr[s] < arr[l]) {
      return binarySearchAscendingOrder(arr, k);
    } else if (arr[s] > arr[l]) {
      return binarySearchDescendingOrder(arr, k);
    } else {
      if (k == arr[0]) {
        return 0;
      } else {
        return -1;
      }
    }
  }

  static int binarySearchAscendingOrder(int[] arr, int k) {
    int low = 0, high = arr.length, mid;
    while (low <= high) {
      mid = (low + high) / 2;// finding the mid value
      if (arr[mid] == k) {
        return mid;
      }
      if (k < arr[mid]) {
        high = mid - 1;
      }
      if (k > arr[mid]) {
        low = mid + 1;
      }
    }
    return -1;
  }

  static int binarySearchDescendingOrder(int[] arr, int k) {
    int low = 0, high = arr.length - 1, mid;
    while (low <= high) {
      mid = low + (high - low) / 2;
      if (arr[mid] == k) {
        return mid;
      } else if (k < arr[mid]) {
        low = mid + 1;
      } else if (k > arr[mid]) {
        high = mid - 1;
      }
    }
    return -1;
  }
}