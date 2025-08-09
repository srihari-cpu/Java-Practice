package Array;

public class pairs {
  public static void main(String args[]) {
    int arr[] = { 5, 2, 3, 4, 1, 6, 7 };
    int sum = 7;
    pair(arr, sum);
  }

  static void pair(int arr[], int p) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        int pair = arr[i] + arr[j];
        if (pair == p) {
          count++;
        }
      }
    }
    System.out.println(count);
  }

}
