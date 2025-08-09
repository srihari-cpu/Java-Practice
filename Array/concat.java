package Array;
import java.util.*;
public class concat {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int[] nums={1,3,2,1};
        int n=nums.length;
        int ans[]=new int[n*2];
        for(int i=0;i<n;i++){
            ans[i]=nums[i];
            ans[i+n]=nums[i];
        }
        for (int i : ans) {
            System.out.print(i + " ");
        }

    }
    
}
