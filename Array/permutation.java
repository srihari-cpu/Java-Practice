package Array;

public class permutation {
    public static void main(String[] args) {
        int[] num = { 1, 2, 3, 4, 2 };
        int[] ans = new int[num.length];
        for (int i = 0; i < num.length; i++) {
            ans[i] = num[num[i]]; // {2,3,4,2,3}
        }
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }

}
