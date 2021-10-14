package leetcode.unsorted;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class numJewelsInStones {
    public static int numJewelsInStones(String J, String S) {
        Set<Character> map = new HashSet<>();
        for (int i = 0; i < J.length(); i++) {
            map.add(J.charAt(i));
        }
        int result = 0;
        for (int i = 0; i < S.length(); i++) {
            if (map.contains(S.charAt(i)))
                result++;
        }
        return result;
    }

    public static void main(String[] args) {
    }
}
