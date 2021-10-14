package codeforces.difficulty700;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Cf677A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer strTk = new StringTokenizer(str);
        strTk.nextToken();
        int heightOfFence = Integer.parseInt(strTk.nextToken());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int result = 0;
        while (st.hasMoreTokens()) {
            result += Integer.parseInt(st.nextToken()) > heightOfFence ? 2 : 1;
        }
        System.out.println(result);
    }
}
