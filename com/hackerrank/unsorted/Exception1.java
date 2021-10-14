package hackerrank.unsorted;

import java.util.Scanner;

class MyCalculator {

    public int power(int n, int p) throws Exception{
        int result = 1;

        if (n < 0 || p < 0){
            throw new Exception("n or p should not be negative.");
        }

        if (n == 0 && p == 0){
            throw new Exception("n and p should not be zero.");
        }

        int i = 0;
        while (i < p){
            result *= n;
            ++i;
        }
        return result;
    }

}

public class Exception1 {
    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (in.hasNextInt()) {
            int n = in.nextInt();
            int p = in.nextInt();

            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}