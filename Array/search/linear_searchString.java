package Array.search;

import java.util.Arrays;

public class linear_searchString {
  public static void main(String[] args) {
    String n = "srihari";
    System.out.println(Arrays.toString(n.toCharArray()));
    char k = 'h';

    // System.out.println(linearSearch(n, k));
    // System.out.println(linearSearch2(n, k));
    System.out.println(linearSearchrange(n, k, 3, 7));

  }

  static boolean linearSearchrange(String n, char k, int s, int e) {
    if (n.length() == 0) {
      return false;
    }
    for (int i = s; i < e; i++) {
      if (k == n.charAt(i)) {
        return true;
      }
    }
    return false;
  }

  static int linearSearch(String n, char k) {
    if (n.length() == 0) {
      return -1;
    }
    for (int i = 0; i < n.length(); i++) {
      if (k == n.charAt(i)) {
        return i;
      }
    }
    return -1;
  }

  static boolean linearSearch2(String n, char k) {
    if (n.length() == 0) {
      return false;
    }
    for (char c : n.toCharArray()) {
      if (c == k) {
        return true;
      }
    }
    return false;
  }

}
