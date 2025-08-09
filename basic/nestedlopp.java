package basic;

import java.util.*;

public class nestedlopp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter which tables you want");
        int i, j, n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }

}
