package Recursion;

public class NTo1 {
  public static void main(String[] args) {
    int n = 10;
    printNto1(n);
  }

  static void printNto1(int n) {
    // recursion
    System.out.print(n + " ");
    // base case
    if (n > 1) {
      printNto1(n - 1);
    }
  }
}
