package leetcode.topinterview.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 * <p>
 * Example 1:
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 * <p>
 * Example 2:
 * Input: s = "rat", t = "car"
 * Output: false
 */
public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram3("anagram", "nagaram"));
        System.out.println(isAnagram3("rat", "car"));
    }

    public static boolean isAnagram3(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);

        return Arrays.equals(s1, s2);
    }

    public static boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> first = new HashMap<>();
        Map<Character, Integer> second = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            first.computeIfPresent(s.charAt(i), (k, v) -> ++v);
            first.putIfAbsent(s.charAt(i), 1);
            second.computeIfPresent(t.charAt(i), (k, v) -> ++v);
            second.putIfAbsent(t.charAt(i), 1);
        }

        return first.equals(second);
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> first = new HashMap<>();
        Map<Character, Integer> second = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            first.computeIfPresent(s.charAt(i), (k, v) -> ++v);
            first.putIfAbsent(s.charAt(i), 1);
        }

        for (int i = 0; i < t.length(); i++) {
            second.computeIfPresent(t.charAt(i), (k, v) -> ++v);
            second.putIfAbsent(t.charAt(i), 1);
        }

        return first.equals(second);
    }
}
