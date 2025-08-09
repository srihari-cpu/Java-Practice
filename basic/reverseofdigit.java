package basic;
import java.util.*;
public class reverseofdigit {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        int res=0;
        int last_digit;
        while(num>0){
            last_digit=num%10;
            res=res*10+last_digit;
            num=num/10;
        }
        System.out.println(res);

    }
}
