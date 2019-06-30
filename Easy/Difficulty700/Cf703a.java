package Difficulty700;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Cf703a {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int mishka = 0;
        int chris = 0;
        for (int i = 0; i < n; i++) {
            StringTokenizer stk = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(stk.nextToken());
            int second = Integer.parseInt(stk.nextToken());
            mishka += first > second ? 1 : 0;
            chris += first < second ? 1 : 0;
        }
        if (chris == mishka)
            System.out.println("Friendship is magic!^^");
        else if (chris > mishka)
            System.out.println("Chris");
        else
            System.out.println("Mishka");
    }
}
