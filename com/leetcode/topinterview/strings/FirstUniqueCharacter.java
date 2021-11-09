package leetcode.topinterview.strings;

import java.util.*;

/**
 * Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
 * <p>
 * Example 1:
 * Input: s = "leetcode"
 * Output: 0
 * <p>
 * Example 2:
 * Input: s = "loveleetcode"
 * Output: 2
 * <p>
 * Example 3:
 * Input: s = "aabb"
 * Output: -1
 */
public class FirstUniqueCharacter {
    public static void main(String[] args) {
        System.out.println(firstUniqChar2("leetcode"));
        System.out.println(firstUniqChar2("loveleetcode"));
        System.out.println(firstUniqChar2("aabb"));
        System.out.println(firstUniqChar2("a"));
    }


    public static int firstUniqChar2(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            Character curChar = s.charAt(i);
            if (set.contains(curChar)) {
                map.remove(curChar);
            } else {
                map.put(curChar, i);
                set.add(curChar);
            }
        }

        return map.size() == 0 ? -1 : map.values().iterator().next();
    }

    public static int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            Character curChar = s.charAt(i);
            map.computeIfPresent(curChar, (k, v) -> ++v);
            map.putIfAbsent(curChar, 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }
}
