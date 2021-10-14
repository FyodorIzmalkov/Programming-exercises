package codeforces.difficulty700;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Cf1006A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int tmp;
        StringBuilder result = new StringBuilder("");
        for (int i = 0; i < n; i++) {
            tmp = Integer.parseInt(stk.nextToken());
            result.append( tmp % 2 == 0 ? --tmp : tmp);
            result.append(" ");
        }
        System.out.println(result);
    }
}
