package basic;
import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        palind(num);
    }
    static void  palind(int num){
        int p=0;
        int num2=num;
        while(num>0){
            p=p*10+(num%10);
            num=num/10;
        }
        if(num2 == p){
            System.out.println("it is palindrome");
        }
        else{
            System.out.println("it is not a palindrome");
        }
    }
    
}
