package hackerrank.unsorted;

import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Scanner;

public class Mdfive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        try {
            byte[] digest = java.security.MessageDigest.getInstance("MD5").digest(input.getBytes());
            for (byte b : digest){
                System.out.printf("%02x", b);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
