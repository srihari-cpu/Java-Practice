package Array.TwoDArray;

//Q) Sum of the 2nd rows;
public class secondRowSum {
  public static void main(String[] args) {
    int arr[][] = { { 1, 4, 9, }, { 11, 4, 3 }, { 2, 2, 3 } };
    int sum = sumRow(arr);
    System.out.println("the sum of the second row is : " + sum);
  }

  public static int sumRow(int[][] arr) {
    int sum = 0;
    for (int i = 0; i < arr[1].length; i++) {
      sum += arr[1][i];
    }
    return sum;
  }

}
