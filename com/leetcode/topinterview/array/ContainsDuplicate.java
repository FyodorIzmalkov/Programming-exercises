package leetcode.topinterview.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

/**
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 * <p>
 * Example 1:
 * Input: nums = [1,2,3,1]
 * Output: true
 * <p>
 * Example 2:
 * Input: nums = [1,2,3,4]
 * Output: false
 * <p>
 * Example 3:
 * Input: nums = [1,1,1,3,3,4,3,2,4,2]
 * Output: true
 */
public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(containsDuplicate(nums));
    }

    // 3 8.28%
    // Runtime: 18 ms
    //Memory Usage: 53.2 MB
    public static boolean containsDuplicate(int[] nums) {
        return Arrays.stream(nums).distinct().count() != nums.length;
    }

    // 2 35.43%
    public static boolean containsDuplicate2(int[] nums) {
        HashSet<Integer> set = new HashSet<>(nums.length);
        for (int curVal : nums) {
            if (set.contains(curVal)) {
                return true;
            }
            set.add(curVal);
        }
        return false;
    }

    //1 13%
    public static boolean containsDuplicate1(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>(nums.length);
        for (int curVal : nums) {
            if (map.get(curVal) != null) {
                return true;
            }
            map.put(curVal, 1);
        }
        return false;
    }
}
