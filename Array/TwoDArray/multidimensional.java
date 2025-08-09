package Array.TwoDArray;

import java.util.Arrays;
import java.util.Scanner;

public class multidimensional {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    /*
     * int arr[][] = {
     * { 1, 2, 3, },
     * { 3, 4, 5 },
     * { 5, 6, 7 }
     * };
     * 
     * //output
     * for (int i = 0; i < arr.length; i++) {
     * System.out.println(Arrays.toString(arr[i]));
     * }
     * 
     */

    // taking input
    int[][] arr = new int[3][3];
    // input
    System.out.println("enter the values");
    for (int row = 0; row < arr.length; row++) {
      for (int col = 0; col < arr[row].length; col++) {
        arr[row][col] = sc.nextInt();
      }
    }
    // output
    for (int row = 0; row < arr.length; row++) {
      // for (int col = 0; col < arr[row].length; col++) {
      // System.out.print(arr[row][col] + " ");
      // }
      System.out.print(Arrays.toString(arr[row]));
      System.out.println();
    }
  }
}