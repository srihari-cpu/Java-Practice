package Array;

import java.util.Arrays;

public class FirstAndLastIndexOfArray {

  public static void main(String[] args) {

    int[] num = { 5, 7, 7, 8, 8, 10 };
    int k = 7;
    int[] res = FALA(num, k);
    System.out.println(Arrays.toString(res));

  }

  static int[] FALA(int[] nums, int k) {

    int[] ans = { -1, -1 };
    // check for first occurrence if target first
    ans[0] = search(nums, k, true);
    if (ans[0] != -1) {
      ans[1] = search(nums, k, false);
    }
    return ans;
  }

  // this function just return the index value of target
  static int search(int[] nums, int k, boolean findStartIndex) {
    int ans = -1;
    int s = 0;
    int e = nums.length - 1;
    int mid;
    while (s <= e) {
      mid = s + (e - s) / 2;
      if (k > nums[mid]) {
        s = mid + 1;

      } else if (k < nums[mid]) {
        e = mid - 1;
      } else {
        // potential ans found
        ans = mid;
        if (findStartIndex) {
          e = mid - 1;
        } else {
          s = mid + 1;
        }

      }
    }
    return ans;
  }
}