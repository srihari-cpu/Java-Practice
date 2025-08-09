package Array;

public class NoOfGoodPairs {
  public static void main(String[] args) {
    int[] nums = { 1, 1, 1, 1 };
    int res = goodPairs(nums);
    System.out.println(res);
  }

  static int goodPairs(int[] nums) {
    int res = 0;
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] == nums[j]) {
          res++;
        }
      }
    }
    return res;
  }

}
