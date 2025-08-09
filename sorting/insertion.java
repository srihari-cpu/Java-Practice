package sorting;

public class insertion {
  public static void main(String args[]) {
    int arr[] = { 2, 4, 21, 5, 1, 64, 8, 17 };
    insertionsort(arr);
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }

  public static int[] insertionsort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = i + 1; j > 0; j--) {
        if (arr[j] < arr[j - 1]) {
          int temp = arr[j];
          arr[j] = arr[j - 1];
          arr[j - 1] = temp;
        } else {
          break;
        }
      }
    }
    return arr;
  }
}
