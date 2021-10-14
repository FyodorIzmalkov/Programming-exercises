package hackerrank.unsorted;

import java.math.BigInteger;
import java.util.Scanner;

public class PrimalityTest {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();

        scanner.close();

        System.out.println(new BigInteger(n).isProbablePrime(100) ? "prime" : "not prime");
    }
}
