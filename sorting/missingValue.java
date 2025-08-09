package sorting;

class missingValue {
  public static void main(String[] args) {
    int[] arr = { 0, 1, 3 };
    System.out.println(sort(arr));
  }

  public static int sort(int[] arr) {
    int i = 0;
    int num = 0;
    while (i < arr.length) {
      int curr = arr[i];
      if (arr[i] < arr.length && arr[i] != arr[curr]) {
        int temp = arr[i];
        arr[i] = arr[curr];
        arr[curr] = temp;
      } else {
        i++;
      }
    }
    for (int index = 0; index < arr.length; index++) {
      if (index == arr[i]) {
        num = index;
      } else {
        num = arr.length;
      }
    }
    return num;
  }
}
