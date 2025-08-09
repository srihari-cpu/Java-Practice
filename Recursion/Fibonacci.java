package Recursion;

//Fibonacci of the nth number is 
public class Fibonacci {
  public static void main(String[] args) {
    int n = 10;
    // System.out.print(0 + " " + 1 + " ");
    fib(n, 0, 1);
  }

  static void fib(int n, int a, int b) {

    if (n <= 3) {
      System.out.print(a + b);
      return;
    }
    int c = a + b;
    fib(n - 1, b, c);
  }

}