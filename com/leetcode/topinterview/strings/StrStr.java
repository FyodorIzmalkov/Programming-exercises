package leetcode.topinterview.strings;

/**
 * Implement strStr().
 * <p>
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 * <p>
 * Clarification:
 * <p>
 * What should we return when needle is an empty string? This is a great question to ask during an interview.
 * <p>
 * For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().
 * <p>
 * <p>
 * <p>
 * Example 1:
 * Input: haystack = "hello", needle = "ll"
 * Output: 2
 * <p>
 * Example 2:
 * Input: haystack = "aaaaa", needle = "bba"
 * Output: -1
 * <p>
 * Example 3:
 * Input: haystack = "", needle = ""
 * Output: 0
 */
public class StrStr {
    public static void main(String[] args) {
        System.out.println(strStr("hello", "ll"));
        System.out.println(strStr("aaaaa", "bba"));
        System.out.println(strStr("", ""));
        System.out.println(strStr("mississippi", "issipi"));
        System.out.println(strStr("mississippi", "a"));
    }

    public static int strStr(String haystack, String needle) {
        if (needle == null || needle.isEmpty()) {
            return 0;
        }

        int haystackLen = haystack.length();
        int needleLen = needle.length();
        if (haystackLen < needleLen) {
            return -1;
        }

        int maxDiff = haystackLen - needleLen;
        for (int i = 0; i <= maxDiff; i++) {
            if (haystack.substring(i, i + needleLen).equals(needle)) {
                return i;
            }
        }

        return -1;
    }


    // too slow
    public static int strStr1(String haystack, String needle) {
        if (needle == null || needle.isEmpty()) {
            return 0;
        }
        if (haystack.length() < needle.length()) {
            return -1;
        }

        int max = haystack.length() - needle.length();
        char[] haystackArr = haystack.toCharArray();
        char[] needleArr = needle.toCharArray();
        char first = needleArr[0];
        for (int i = 0; i <= max; i++) {
            if (haystackArr[i] == first) {
                boolean valid = checkSubstr(haystack, needle, i);
                if (valid) {
                    return i;
                }
            }
        }
        return -1;
    }

    private static boolean checkSubstr(String haystack, String needle, int index) {
        char[] haystackArr = haystack.toCharArray();
        char[] needleArr = needle.toCharArray();

        for (int i = 0; i < needle.length(); i++) {
            if (index + i >= haystack.length()) {
                return false;
            }
            if (needleArr[i] != haystackArr[index + i]) {
                return false;
            }
        }
        return true;
    }
}
