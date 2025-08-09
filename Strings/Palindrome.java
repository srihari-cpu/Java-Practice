package Strings;

import java.util.Scanner;

public class Palindrome {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter name here");
    String name = sc.next();
    // boolean res = isPalindromeSimple(name);
    // System.out.println(res);

    System.out.println(checkPalindrome(name));
  }

  public static boolean checkPalindrome(String str) {
    int n = str.length();
    for (int i = 0; i < str.length() / 2; i++) {
      if (str.charAt(i) != str.charAt(n - 1 - i)) {
        return false;
      }
    }
    return true;
  }

  public static boolean isPalindromeSimple(String str) {
    char newStr;
    String str2 = str;
    String temp = "";
    int num = str.length() - 1;
    while (num >= 0) {
      char a = str.charAt(num);
      temp += a;
      num -= 1;
    }
    if (temp.equals(str2)) {
      return true;
    } else {
      return false;
    }
  }

}
