package Difficulty700;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Cf1080A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(stk.nextToken());
        int k = Integer.parseInt(stk.nextToken());
        int red = n * 2;
        int green = n * 5;
        int blue = n * 8;
        int result = red / k + ((red % k == 0) ? 0 : 1) + green / k + ((green % k == 0) ? 0 : 1) + blue / k + ((blue % k == 0)? 0: 1);
        System.out.println(result);
    }
}
