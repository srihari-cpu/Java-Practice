package basic;
public class call_by_value {
    public static void main(String[] args) {
        int m=0;
        int a=10;
        int b=20;
        m=mul(a,b);
        System.out.println("the multiplication of the two numbers is : "+m);
    }
    static int mul(int a,int b){
        return a*b;
    }
    
}
