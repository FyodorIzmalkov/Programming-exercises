package hackerrank.java;

import java.util.Scanner;

public class StringTask4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(new StringBuffer(A).reverse().toString().equals(A) ? "Yes" : "No");
    }
}
