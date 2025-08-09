package Recursion;

/**
 * Asc1ToN
 */
public class Asc1ToN {

  public static void main(String[] args) {
    int n = 10;
    Number(n);
  }

  static void Number(int n) {
    if (n == 0) {
      return;
    }
    Number(n - 1);
    System.out.println(n);
  }
}