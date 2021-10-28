package leetcode.topinterview.strings;

/**
 * Write a function that reverses a string. The input string is given as an array of characters s.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: s = ["h","e","l","l","o"]
 * Output: ["o","l","l","e","h"]
 * Example 2:
 * <p>
 * Input: s = ["H","a","n","n","a","h"]
 * Output: ["h","a","n","n","a","H"]
 */
public class ReverseString {
    public static void main(String[] args) {
        char[] arr = {'h', 'e', 'l', 'l', 'o'};
        reverseString(arr);
        System.out.println(arr);
    }

    public static void reverseString(char[] s) {
        int last = s.length - 1;
        for (int i = 0; i < last; i++) {
            char tmp = s[i];
            s[i] = s[last];
            s[last] = tmp;
            --last;
        }
    }
}
