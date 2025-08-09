package Array;

public class largestinArray {
    public static void main(String args[]){
        int[] arr={9,7,61,3,111};
        int max=maximum(arr);
        System.out.println("the maximum of the array is : " + max);
    }
    static int maximum(int []a){
        int curr=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>curr){
                curr=a[i];
            }
        }
        return curr;
    }
}
