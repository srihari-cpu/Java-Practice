package Array.TwoDArray;

public class SearchIn2D {
  public static void main(String[] args) {
    int arr[][] = new int[3][3];
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
    int target = 9;
    getElementBetterApproch(arr, target);
  }

  public static void getElementBetterApproch(int[][] arr, int target) {
    int m = arr.length;
    int n = arr[0].length;
    int row = 0;
    int col = n - 1;
    while (row < m && col >= 0) {
      if (arr[row][col] == target) {
        System.out.println("element is found at " + row + " " + col);
        return;
      } else if (arr[row][col] > target) {
        col--;
      } else {
        row++;
      }
    }
    System.out.println("Not found");
    return;

  }

  public static int[] getElement(int[][] arr, int target) {
    int res[] = { -1, -1 };
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        if (arr[i][j] == target) {
          res[0] = i;
          res[1] = j;
          return res;
        }
      }
    }
    return res;
  }

}
