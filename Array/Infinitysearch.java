package Array;

public class Infinitysearch {

  public static void main(String[] args) {
    int arr[] = { 2, 4, 8, 14, 17, 19, 22, 25, 26, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 78, 79 };
    int k = 64;
    int res = search(arr, k);
    System.out.println(res);
  }

  static int search(int[] arr, int k) {
    int s = 0;
    int e = 1;
    while (k > arr[e]) {
      int temp = e + 1;

      e = e + (e - s + 1) * 2;

      s = temp;
    }
    return binary(arr, k, s, e);
  }

  static int binary(int[] arr, int k, int s, int e) {
    int mid;
    while (s <= e) {
      mid = s + (e - s) / 2;
      if (k < arr[mid]) {
        e = mid - 1;
      } else if (k > arr[mid]) {
        s = mid + 1;
      } else {
        return mid;
      }
    }
    return -1;
  }

}
