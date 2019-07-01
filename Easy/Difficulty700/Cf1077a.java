package Difficulty700;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Cf1077a {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder stringResult = new StringBuilder("");
        for (int i = 0; i < n; i++) {
            StringTokenizer stk = new StringTokenizer(br.readLine());
            int right = Integer.parseInt(stk.nextToken());
            int left = Integer.parseInt(stk.nextToken());
            int numberOfJumps = Integer.parseInt(stk.nextToken());
            long rightResult = right * (long)Math.ceil((double)numberOfJumps / 2);
            long leftResult = left * (long)Math.floor((double)numberOfJumps / 2);
            stringResult.append(rightResult - leftResult + "\n");
        }
        System.out.println(stringResult);
    }
}
