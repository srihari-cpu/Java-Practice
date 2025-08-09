package Array.TwoDArray;

public class TransposeMatrix {
  public static void main(String[] args) {
    int arr[][] = { { 11, 12, 13, 14 }, { 21, 22, 23, 24 } };
    int res[][] = transpose(arr);
    for (int i = 0; i < res.length; i++) {
      for (int j = 0; j < res[i].length; j++) {
        System.out.print(res[i][j] + "  ");
      }
      System.out.println();
    }
  }

  public static int[][] transpose(int[][] arr) {
    int res[][] = new int[arr[0].length][arr.length];
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        res[j][i] = arr[i][j];
      }
    }
    return res;
  }

}
