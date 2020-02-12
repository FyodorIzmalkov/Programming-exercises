import java.util.Scanner;
import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()){
            String input = scanner.nextLine();
            Stack<Character> stack = new Stack<>();

            int i = -1;
            while (++i < input.length()){
                Character currentChar = input.charAt(i);
                if (currentChar == '{' || currentChar == '[' || currentChar == '(') {
                    stack.push(currentChar);
                }
                if (currentChar == '}' || currentChar == ']' || currentChar == ')') {
                    if (stack.isEmpty()){
                        System.out.println("false");
                        break;
                    }
                    Character lastChar = stack.pop();
                    if (lastChar == '{' && currentChar != '}'){
                        System.out.println("false");
                        break;
                    }
                    if (lastChar == '[' && currentChar != ']'){
                        System.out.println("false");
                        break;
                    }
                    if (lastChar == '(' && currentChar != ')'){
                        System.out.println("false");
                        break;
                    }
                }
                if (i + 1 == input.length() && stack.isEmpty()){
                    System.out.println("true");
                } else if ( i + 1 == input.length() && !stack.isEmpty()){
                    System.out.println("false");
                }
            }
        }
    }
}
