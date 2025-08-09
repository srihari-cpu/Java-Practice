package basic;
public class even_or_odd {
    public static void main(String[] args) {
        int num=8;
        boolean store=even(num);
        System.out.println("the is even :"+store);
        }
    
        static boolean even(int num){
            if(num%2==0){
                return true;
            }
            else{
                return false;
            }
        }
    
}
