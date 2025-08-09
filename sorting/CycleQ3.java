package sorting;

public class CycleQ3 {
  public static void main(String[] args) {
    int[] arr = { 1, 1, 2 };
    System.out.println(duplicate(arr));
  }

  static int duplicate(int[] arr) {
    int i = 0;
    while (i < arr.length) {
      int curr = arr[i] - 1;
      if (arr[i] != arr[curr]) {
        int temp = arr[i];
        arr[i] = arr[curr];
        arr[curr] = temp;
      } else {
        i++;
      }
    }
    for (int j = 0; j < arr.length; j++) {
      if (arr[j] - 1 != j) {
        return arr[j];
      }
    }
    return -1;
  }

}
