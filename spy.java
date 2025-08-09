public class spy {
  public static void main(String args[]) {   
  int num=123;
  int res=spyYN(num);
  if(res==1){
    System.out.println("it is a spy");  }else{
    System.out.println("it is not a spy");  }
  }
  public static int  spyYN(int num){
    int a=num;
    int sum=0;
    int prod=1;
    while(a>0){
      int last_digit=a%10;
      sum=sum+last_digit;
      prod=prod*last_digit;
      a=a/10;
    }
    if(sum==prod){      return 1;    }
    else{      return 0;    }
  }
}
