package hackerrank.java;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] a = new int[n];
        int j = 0;
        while (j < n){
            a[j] = scan.nextInt();
            ++j;
        }

        scan.close();
        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
