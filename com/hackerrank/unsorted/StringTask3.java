package hackerrank.unsorted;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringTask3 {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        String currentSubString = s.substring(0, k);
        smallest = currentSubString;
        largest = currentSubString;
        for (int i = 1; i <= s.length() - k; i++) {
            currentSubString = s.substring(i, k + i);
            if (currentSubString.compareTo(largest) > 0){
                largest = currentSubString;
            }
            if (currentSubString.compareTo(smallest) < 0){
                smallest = currentSubString;
            }
        }

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
