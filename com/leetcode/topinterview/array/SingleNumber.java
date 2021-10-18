package leetcode.topinterview.array;

import java.util.HashSet;

/**
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 * <p>
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 * <p>
 * Example 1:
 * Input: nums = [2,2,1]
 * Output: 1
 * <p>
 * Example 2:
 * Input: nums = [4,1,2,1,2]
 * Output: 4
 * <p>
 * Example 3:
 * Input: nums = [1]
 * Output: 1
 */
public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        System.out.println(singleNumber(nums));
    }

    // 94.91%
    //Runtime: 1 ms
    //Memory Usage: 47.7 MB
    public static int singleNumber(int[] nums) {
        int num = 0;
        for (int j : nums) {
            num ^= j;
        }
        return num;
    }

    // 14.78%
    // Runtime: 16 ms
    //Memory Usage: 53.1 MB
    // Runtime: 7 ms ?
    //Memory Usage: 39.5 MB ?
    public static int singleNumber1(int[] nums) {
//        Arrays.sort(nums);
        HashSet<Integer> set = new HashSet<>(nums.length);
        for (Integer curVal : nums) {
            if (set.contains(curVal)) {
                set.remove(curVal);
            } else {
                set.add(curVal);
            }
        }
        return set.iterator().next();
    }
}
