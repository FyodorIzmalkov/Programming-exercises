package hackerrank.java;

import java.math.BigInteger;
import java.util.Scanner;

public class BigInteger1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger first = new BigInteger(scanner.nextLine());
        BigInteger second = new BigInteger(scanner.nextLine());
        System.out.println(first.add(second));
        System.out.println(first.multiply(second));
    }
}
