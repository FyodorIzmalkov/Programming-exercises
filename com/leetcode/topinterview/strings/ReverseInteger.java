package leetcode.topinterview.strings;

/**
 * Given a signed 32-bit integer x, return x with its digits reversed.
 * If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 */
public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(123));
        System.out.println(reverse(-123));
        System.out.println(reverse(120));
        System.out.println(reverse(0));
        System.out.println(reverse(1534236469));

    }


    // Runtime: 2 ms
    //Memory Usage: 36.1 MB
    public static int reverse(int x) {
        if (Integer.MIN_VALUE == x) {
            return 0;
        }

        String str = String.valueOf(x);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            char curChar = str.charAt(i);
            if (curChar == '-' || curChar == '+') {
                continue;
            }
            stringBuilder.append(curChar);
        }

        String result = stringBuilder.toString();
        try {
            if (x < 0) {
                return Integer.parseInt(result) * -1;
            }
            return Integer.parseInt(result);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}