package Recursion;

class Sum {
  public static void main(String[] args) {
    int num = 10;
    System.out.println(total(num));
  }

  static int total(int n) {
    if (n == 0) {
      return 0;
    }
    int res = n + total(n - 1);
    return res;
  }

}
