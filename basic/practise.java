package basic;
/**
 * App
 */import java.util.*;
public class practise {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter how many colums of pattern");
        int n=sc.nextInt();
        System.out.println();
        int i,j;
        for(i=1;i<=n;i++){
            int spaces=i-1;

            for(j=i;j<=n;j++){
                System.out.print("*");
            }

            for(int k=1;k<=spaces;k++){
                System.out.print(" ");
            }

            for(int k=1;k<=spaces;k++){
                System.out.print(" ");
            }
            for(j=i;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}