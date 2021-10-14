package codeforces.difficulty700;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Cf581A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int red = Integer.parseInt(stk.nextToken());
        int blue = Integer.parseInt(stk.nextToken());
        int numOfDays = red > blue ? blue : red;
        int other = Math.abs(red - blue) / 2;
        System.out.println(numOfDays + " " + other);
    }
}
