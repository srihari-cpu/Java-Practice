package Array.search;

public class floorandceil {
  public static void main(String args[]) {
    int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
    int k = 15;
    int res1 = binarysearchceil(arr, k);
    System.out.println("ceil value of the given number is : " + res1);
    int res2 = binarysearchfloor(arr, k);
    System.out.println("floor value of the given number is : " + res2);
  }

  static int binarysearchceil(int[] arr, int k) {
    int s = 0;
    int e = arr.length - 1;
    int mid;
    while (s <= e) {
      mid = (s + e) / 2;
      if (k == arr[mid]) {
        return arr[mid];
      } else if (k < arr[mid]) {
        e = mid - 1;
      } else if (k > arr[mid]) {
        s = mid + 1;
      }
    }
    return arr[s];
  }

  static int binarysearchfloor(int[] arr, int k) {
    int s = 0;
    int e = arr.length - 1;
    int mid;
    while (s <= e) {
      mid = (s + e) / 2;
      if (k == arr[mid]) {
        return arr[mid];
      } else if (k < arr[mid]) {
        e = mid - 1;
      } else if (k > arr[mid]) {
        s = mid + 1;
      }
    }
    return arr[e];
  }

}
