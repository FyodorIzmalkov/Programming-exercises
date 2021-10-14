package codeforces.difficulty700;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cf734A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        char ch;
        int danik = 0;
        int anton = 0;
        for (int i = 0; i < str.length() ; i++) {
            ch = str.charAt(i);
            if (ch == 'D')
                danik++;
            else
                anton++;
        }
        if (anton == danik) {
            System.out.println("Friendship");
            System.exit(0);
        }
        System.out.println(anton > danik ? "Anton" : "Danik");
    }
}
