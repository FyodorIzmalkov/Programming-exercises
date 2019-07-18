package Difficulty700;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Cf835A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int numberOfSymbols = Integer.parseInt(stk.nextToken());
        int speedFirst = Integer.parseInt(stk.nextToken());
        int speedSecond = Integer.parseInt(stk.nextToken());
        int pingFirst = Integer.parseInt(stk.nextToken());
        pingFirst += pingFirst;
        int pingSecond = Integer.parseInt(stk.nextToken());
        pingSecond += pingSecond;
        int total = 0;
        total = (numberOfSymbols * speedFirst + pingFirst) - (numberOfSymbols * speedSecond + pingSecond);
        if (total < 0)
            System.out.println("First");
        else if (total > 0)
            System.out.println("Second");
        else
            System.out.println("Friendship");
    }
}
