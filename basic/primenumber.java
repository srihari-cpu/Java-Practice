package basic;
import java.util.*;
public class primenumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            prime(i);
        }        
    }
    static void prime(int num){
        int count=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count=count+1;
            }
        }
        if(count==2){
            System.out.println(num);
        }
    }
    
}
