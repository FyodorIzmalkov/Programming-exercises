package Difficulty700;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cf1139A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int result = 0;
        for (int i = 0; i < n; i++) {
            if ((int) str.charAt(i) % 2 == 0)
                result += i + 1;
        }
        System.out.println(result);
    }
}
