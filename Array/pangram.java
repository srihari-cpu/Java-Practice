package Array;

public class pangram {

  public static void main(String[] args) {
    String s = "the quick brown fox jumps over the lazy dog";
    // to convert lowerCase or upperCase and check all alphabets are presnt are not
    boolean res = isPangram(s.toLowerCase());
    System.out.println(res);
  }

  static boolean isPangram(String s) {
    if (s.length() < 26) {
      return false;
    } else {
      for (char ch = 'A'; ch <= 'Z'; ch++) {
        if (s.indexOf(ch) < 0) {
          return false;
        }
      }
      return true;
    }
  }
}
