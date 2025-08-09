package Strings;

public class largestString {
  public static void main(String[] args) {
    String names[] = { "srihari", "srikanth", "hanumanthu", "alaveni" };
    String l = names[0];
    for (int i = 1; i < names.length; i++) {
      if (names[i].length() > l.length()) {
        l = names[i];
      }
    }
    System.out.println(l);
  }

}
