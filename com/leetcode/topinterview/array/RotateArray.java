package leetcode.topinterview.array;

import java.util.Arrays;

/**
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 * <p>
 * Input: nums = [1,2,3,4,5,6,7], k = 3
 * Output: [5,6,7,1,2,3,4]
 * Explanation:
 * rotate 1 steps to the right: [7,1,2,3,4,5,6]
 * rotate 2 steps to the right: [6,7,1,2,3,4,5]
 * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 * <p>
 * Input: nums = [-1,-100,3,99], k = 2
 * Output: [3,99,-1,-100]
 * Explanation:
 * rotate 1 steps to the right: [99,-1,-100,3]
 * rotate 2 steps to the right: [3,99,-1,-100]
 */
public class RotateArray {
    public static void main(String[] args) {
//        int[] nums = {1,2,3,4,5,6,7};
        int[] nums = {-1};
        rotate(nums, 3);
        System.out.println(Arrays.toString(nums));
    }

    public static void rotate(int[] nums, int k) {
        int len = nums.length;
        int[] result = new int[len];

        for (int i = 0; i < len; i++) {
            if (i + k >= len) {
                int step = i + k - len;
                while (step >= len) {
                    step -= len;
                }
                result[step] = nums[i];
            } else {
                result[i + k] = nums[i];
            }
        }

        System.arraycopy(result, 0, nums, 0, len);
    }
}
