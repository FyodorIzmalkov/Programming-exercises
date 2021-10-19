package leetcode.topinterview.array;

import java.util.*;

/**
 * Given two integer arrays nums1 and nums2, return an array of their intersection.
 * Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2,2]
 * Example 2:
 * <p>
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [4,9]
 * Explanation: [9,4] is also accepted.
 */
public class IntersectionOfTwoArrays2 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] res = intersect(nums1, nums2);
        System.out.println(Arrays.toString(res));
    }

    //Runtime: 9 ms
    //Memory Usage: 41.1 MB
    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> firstMap = new HashMap<>(nums1.length);
        Map<Integer, Integer> secondMap = new HashMap<>(nums2.length);

        firstMap = getMap(nums1, firstMap);
        secondMap = getMap(nums2, secondMap);

        for (Integer key : firstMap.keySet()) {
            Integer secondMapVal = secondMap.get(key);
            if (secondMapVal != null) {
                Integer firstMapVal = firstMap.get(key);

                for (int i = 0; i < Math.min(secondMapVal, firstMapVal); i++) {
                    list.add(key);
                }
            }
        }

        int[] result = new int[list.size()];
        for (int j = 0; j < list.size(); j++) {
            result[j] = list.get(j);
        }

        return result;
    }

    private static Map<Integer, Integer> getMap(int[] array, Map<Integer, Integer> map) {
        for (Integer curVal : array) {
            if (map.get(curVal) == null) {
                map.put(curVal, 1);
            } else {
                map.computeIfPresent(curVal, (key, val) -> ++val);
            }
        }
        return map;
    }
}
