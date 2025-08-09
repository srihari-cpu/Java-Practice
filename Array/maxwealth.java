package Array;

public class maxwealth {
    public static void main(String args[]) {
        int nums[][] = { { 1, 2 }, { 3, 4 } };
        // int maxWealth = 0;
        // int rows = nums.length;
        // int col = nums[0].length;
        // for (int i = 0; i < rows; i++) {
        // int wealth = 0;
        // for (int j = 0; j < col; j++) {
        // wealth += nums[i][j];
        // }
        // maxWealth = Math.max(maxWealth, wealth);
        // }
        // System.out.println("the maximum wealth of the customer is : " + maxWealth);

        System.out.println(maximumwealth(nums));
    }

    static int maximumwealth(int[][] arr) {
        int max = 0;
        for (int person = 0; person < arr.length; person++) {
            int rowSum = 0;
            for (int account = 0; account < arr[person].length; account++) {
                rowSum += arr[person][account];
            }
            if (rowSum > max) {
                max = rowSum;
            }
        }
        return max;
    }
}