package LeetCodeEz;

import java.util.Arrays;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int tmp;
        for (int i = 0; i < nums.length; i++) {
            result[0] = i;
            tmp = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] +tmp == target){
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] num = {-1,-2,-3,-4,-5};
        System.out.println(Arrays.toString(twoSum(num, -8)));
    }
}
