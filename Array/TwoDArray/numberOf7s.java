package Array.TwoDArray;

//Q) number of given num int the array; 
public class numberOf7s {
  public static void main(String[] args) {
    int arr[][] = { { 4, 7, 8 }, { 8, 8, 7 } };
    int num = 8;
    int c = count(arr, num);
    System.out.println("the count of the number is :" + c);
  }

  public static int count(int arr[][], int num) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        if (arr[i][j] == num) {
          count++;
        }
      }
    }
    return count;
  }
}
