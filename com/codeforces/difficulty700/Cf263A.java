package codeforces.difficulty700;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math;
import java.util.StringTokenizer;

public class Cf263A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 1; i <= 5 ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int counter = 1;
            while (st.hasMoreTokens()){
                if (Integer.parseInt(st.nextToken()) == 1){
                    System.out.println(Math.abs(3 - i) + Math.abs(3 - counter));
                    System.exit(0);
                }
                counter++;
            }
        }
    }
}
