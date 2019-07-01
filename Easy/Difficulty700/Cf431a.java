package Difficulty700;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Cf431a {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int first = Integer.parseInt(stk.nextToken());
        int second = Integer.parseInt(stk.nextToken());
        int third = Integer.parseInt(stk.nextToken());
        int fourth = Integer.parseInt(stk.nextToken());
        String str = br.readLine();
        int len = str.length();
        int result = 0;
        for (int i = 0; i < len; i++) {
            switch (str.charAt(i)) {
                case '1':
                    result += first;
                    break;
                case '2':
                    result += second;
                    break;
                case '3':
                    result += third;
                    break;
                case '4':
                    result += fourth;
                    break;
            }
        }
        System.out.println(result);

    }
}
