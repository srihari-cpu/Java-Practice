package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Arraylist1 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // syntax
    ArrayList<Integer> a = new ArrayList<>(10);
    // a.add(1);
    // a.add(12);
    // a.add(13);
    // a.add(14);
    // a.add(15);
    // a.add(16);
    // a.add(17);
    // a.add(18);
    // a.add(19);

    // System.out.println(a);
    // System.out.println(a.get(2));
    // System.out.println(a.size());

    // read input from user
    for (int i = 0; i < 5; i++) {
      a.add(sc.nextInt());
    }

    // output
    for (int i = 0; i < 5; i++) {
      System.out.println(a.get(i));// index not workout here
    }

  }

}
