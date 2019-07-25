package Difficulty700;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Cf1167A {
    public static void main(String[] args)throws IOException{
            BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter out = new PrintWriter(System.out);

            int t = Integer.parseInt(f.readLine());

            for(int q = 0; q < t; q++){
                int n = Integer.parseInt(f.readLine());
                String s = f.readLine();
                if(s.indexOf('8') != -1 && n-s.indexOf('8')>=11){
                    out.println("YES");
                } else {
                    out.println("NO");
                }
            }
            out.close();
        }
}