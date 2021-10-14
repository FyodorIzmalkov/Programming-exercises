package hackerrank.unsorted;

import java.util.Scanner;

public class StringTask6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();
        s = s.trim();
        if (s.isEmpty()){
            System.out.println(0);
            return;
        }
        String [] result = s.split("[ !,?._'@]+");
        System.out.println(result.length);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
