package leetcode.topinterview.array;

import java.util.Arrays;

/**
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * Note that you must do this in-place without making a copy of the array.
 * <p>
 * Example 1:
 * Input: nums = [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 * <p>
 * Example 2:
 * Input: nums = [0]
 * Output: [0]
 */
public class MoveZeroes {
    public static void main(String[] args) {
//        int[] nums = {0, 1, 0, 3, 12};
//        int[] nums = {0};
        int[] nums = {1, 0, 5, 1};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    // Runtime: 1 ms
    //Memory Usage: 40.2 MB
    public static void moveZeroes(int[] nums) {
        int length = nums.length;
        int lastInserted = 0;
        for (int i = 0; i < length; i++) {
            int curVal = nums[i];
            if (curVal != 0 && i == lastInserted) {
                ++lastInserted;
            } else if (curVal != 0) {
                nums[lastInserted++] = curVal;
                nums[i] = 0;
            }
        }
    }
}
