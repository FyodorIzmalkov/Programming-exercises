package hackerrank.java;

import java.util.Scanner;

public class RegexTask1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

class MyRegex {
    String zeroTo255 = "\\d|2}|[01]\\d{2}|2[0-4]\\d|25[0-5]";
    String pattern = zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255;
}
