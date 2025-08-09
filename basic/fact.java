package basic;
import java.util.*;
public class fact {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        int getfact=fact(num);
        System.out.println("the factorial og the given number is : " + getfact);
    }
    static int fact(int num){
        int fact1=1;
        while(num>0){
            fact1=fact1*num;
            num-=1; 
        }
        return fact1;
    }
    
}
