package patterns;

import java.util.*;

public class invertedstar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter how many columns");
        int n = sc.nextInt();
        System.out.println(" ");
        int i, j;
        for (i = 1; i <= n; i++) {

            // spaces
            int spaces = i - 1;
            for (int k = 1; k <= spaces; k++) {
                System.out.print(" ");
            }

            // stars
            for (j = i; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

}
