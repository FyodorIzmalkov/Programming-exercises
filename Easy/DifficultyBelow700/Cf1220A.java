package DifficultyBelow700;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cf1220A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int z = 0;
        int ns = 0;
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == 'z') {
                z++;
                continue;
            }
            else if (str.charAt(i) == 'n'){
                ns++;
                continue;
            }
        }
        StringBuilder result = new StringBuilder("");
        while (ns > 0){
            result.append("1 ");
            --ns;
        }
        while (z > 0){
            result.append("0 ");
            --z;
        }
        System.out.println(result);
    }
}
