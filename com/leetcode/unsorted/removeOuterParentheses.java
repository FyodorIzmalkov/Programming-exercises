package leetcode.unsorted;

import java.util.Stack;

public class removeOuterParentheses {
    public String removeOuterParentheses(String S) {
        StringBuilder result = new StringBuilder("");
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if (ch == '('){
                if (stack.empty()){
                    stack.push(ch);
                    continue;
                }
                else {
                    stack.push(ch);
                    result.append(ch);
                }
            }
            else if (ch == ')'){
                if (stack.size() == 1){
                    stack.pop();
                    continue;
                }
                else{
                    stack.pop();
                    result.append(ch);
                }
            }
        }
        return result.toString();
    }
}
