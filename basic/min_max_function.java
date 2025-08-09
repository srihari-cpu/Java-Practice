package basic;
/**
 * min_max_function
 */
public class min_max_function {

    public static void main(String[] args) {
        int a=8,b=11,c=4;
        maximum(a,b,c);
        minimun(a,b,c);
    } 

    //maximu, of numbers
    static void maximum(int a,int b,int c){
        if(a>b){
            if(a>c){
                System.out.println("maximum value is : "+a);
            }
            else{
                System.out.println("maximum value is : "+c);
            }
        }
        else{
            if(b>c){
                System.out.println("maximum value is : "+b);
            }
            else{
                System.out.println("maximum value is : "+c);
            }
        }
    }

    //minimum of numbers
    static void minimun(int a,int b,int c){
        if(a<b){
            if(a<c){
                System.out.println("minimum value is : "+a);
            }
            else{
                System.out.println("minimum value is : "+c);
            }
        }
        else{
            if(b<c){
                System.out.println("minimum value is : "+b);
            }
            else{
                System.out.println("minimum value is : "+c);
            }
        }
    }
}