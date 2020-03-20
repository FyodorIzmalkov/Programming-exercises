
import java.util.Scanner;

public class Shatwohundredsfiftysix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        try {
            byte[] digest = java.security.MessageDigest.getInstance("SHA-256")
                    .digest(str.getBytes());
            for (byte b : digest){
                System.out.printf("%02x", b);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
