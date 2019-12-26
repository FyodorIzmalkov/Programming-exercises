package hackerrank;

import java.util.Scanner;

public class Conditionals {
    private static boolean flag = false;
    private static int B = 0;
    private static int H = 0;

    static {
        Scanner scanner = new Scanner(System.in);
        B = Integer.parseInt(scanner.nextLine());
        H = Integer.parseInt(scanner.nextLine());
        if (B <= 0 || H <= 0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        } else {
            flag = true;
        }
    }

    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main

}//end of class

