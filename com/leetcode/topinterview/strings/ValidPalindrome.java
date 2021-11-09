package leetcode.topinterview.strings;

/**
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters,
 * it reads the same forward and backward. Alphanumeric characters include letters and numbers.
 * <p>
 * Given a string s, return true if it is a palindrome, or false otherwise.
 * <p>
 * Example 1:
 * Input: s = "A man, a plan, a canal: Panama"
 * Output: true
 * Explanation: "amanaplanacanalpanama" is a palindrome.
 * <p>
 * Example 2:
 * Input: s = "race a car"
 * Output: false
 * Explanation: "raceacar" is not a palindrome.
 * <p>
 * Example 3:
 * Input: s = " "
 * Output: true
 * Explanation: s is an empty string "" after removing non-alphanumeric characters.
 * Since an empty string reads the same forward and backward, it is a palindrome.
 */
public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome("zzaazz1"));
        System.out.println(isPalindrome("zzaazz1s"));
        System.out.println(isPalindrome(" "));
        System.out.println(isPalindrome("0P"));
        System.out.println(isPalindrome("1a2"));
    }

    public static boolean isPalindrome(String s) {
        String formatted = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        int end = formatted.length() - 1;
        for (int i = 0; i < formatted.length(); i++) {
            if (i == end) {
                return true;
            }
            if (formatted.charAt(i) == formatted.charAt(end)) {
                --end;
            } else {
                return false;
            }
        }

        return true;
    }

    public static boolean isPalindrome2(String s) {
        String formatted = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        StringBuilder sb = new StringBuilder(formatted);
        return formatted.equals(sb.reverse().toString());
    }
}
