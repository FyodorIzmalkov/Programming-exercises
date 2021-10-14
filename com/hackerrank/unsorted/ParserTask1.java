package hackerrank.unsorted;

import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ParserTask1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        String matcher = "<(.+)>([^<]+)</\\1>";
        Pattern pattern = Pattern.compile(matcher);
        while (testCases > 0) {
            String line = in.nextLine();
            Matcher m = pattern.matcher(line);
            boolean matchFound = false;
            while (m.find()) {
                matchFound = true;
                System.out.println(m.group(2));
            }
            if (!matchFound){
                System.out.println("None");
            }
            testCases--;
        }
    }
}
