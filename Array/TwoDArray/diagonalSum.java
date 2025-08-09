package Array.TwoDArray;

public class diagonalSum {
  public static void main(String[] args) {
    int arr[][] = new int[4][4];
    int c = 1;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length; j++) {
        arr[i][j] = c++;
      }
    }
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length; j++) {
        System.out.print(arr[i][j] + "  ");
      }
      System.out.println();
    }
    int i = 0;
    int j = 0;
    int k = arr.length - 1;
    int sum = 0;
    while (i < arr.length && k >= 0) {
      sum += arr[i][j];
      sum += arr[i][k];
      if (j == k) {
        sum -= arr[i][k];
      }
      i++;
      j++;
      k--;
    }
    System.out.println("sum is : " + sum);
  }
}
