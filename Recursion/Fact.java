public class Fact {
  public static void main(String[] args) {
    int n = 5;
    int res = fact(n);
    System.out.println(res);
  }
  static int fact(int n) {
    // base case
    if (n == 1 || n == 0) {
      return 1;
    }

    // recursion
    int res = n * fact(n - 1);
    return res;

  }
}


