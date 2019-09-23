package LeetCodeEz;

public class removeOuterParentheses {
    public String removeOuterParentheses(String S) {
        StringBuilder result = new StringBuilder("");
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if (ch =='('){
                int num = 0;
                i++;
                while (num >= 0 && i < S.length()) {
                    if (S.charAt(i) == '(') {
                        result.append(S.charAt(i));
                        num++;
                        i++;
                    } else if (S.charAt(i) == ')' && num > 0) {
                        result.append(S.charAt(i));
                        num--;
                        i++;
                    }
                }
            }
        }
        return result.toString();
    }
}
