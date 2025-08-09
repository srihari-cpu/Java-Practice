package Array.search;

public class Evendigit {
  public static void main(String[] args) {
    int[] arr = { 12, 345, 22, 64, 7896 };
    System.out.println(evendigit(arr));
  }

  // function
  static int evendigit(int[] arr) {
    int count = 0;
    for (Integer num : arr) {
      if (even(num)) {
        count++;
      }
    }
    return count;
  }

  // to check the digit count is even or odd
  static boolean even(int num) {
    return digit(num) % 2 == 0;
  }

  // count the number of digits
  static int digit(int num) {
    int count = 0;
    // if number is negitive
    if (num < 0) {
      num *= -1;
    }

    // if number is 0
    if (num == 0) {
      return 1;
    }
    while (num > 0) {
      count++;
      num /= 10;
    }
    return count;
  }
}
